package com.example.admin.genericbottombarshowhide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private CardView mCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerView);
        mCardView = findViewById(R.id.totalCard);
        loadList();
        onClickListener();
    }

    private void onClickListener() {
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (!recyclerView.canScrollVertically(1)&& mCardView.getVisibility() != View.VISIBLE) {
                    slideUp(mCardView);
                    mCardView.setVisibility(View.VISIBLE);
//                    ViewUtil.setVisible(mTotalAmountLayout);
                }
            }
        });
    }

    private void loadList() {
        APIInterface apiInterface = APIClient.getClient().create(APIInterface.class);
        Call<ListResponse> call = apiInterface.getList();
        call.enqueue(new Callback<ListResponse>() {
            @Override
            public void onResponse(Call<ListResponse> call, Response<ListResponse> response) {
                if (response.isSuccessful() && response.body() != null){
                    addRecyclerView(response.body().getContactList());
                }
            }

            @Override
            public void onFailure(Call<ListResponse> call, Throwable t) {

            }
        });
    }

    private void addRecyclerView(List<ListModel> contactList) {
        if (contactList != null) {
            mRecyclerView.setHasFixedSize(false);
            mRecyclerView.setNestedScrollingEnabled(false);
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
            ListAdapter adapter = new ListAdapter(contactList,MainActivity.this);
            mRecyclerView.setAdapter(adapter);
            onRecyclerViewScroll();
        }
    }

    private void onRecyclerViewScroll() {
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (dy > 0 && mCardView.getVisibility() == View.VISIBLE) {
                    slideDown(mCardView);
                    mCardView.setVisibility(View.GONE);
                } else if (dy < 0 && mCardView.getVisibility() != View.VISIBLE) {
                    slideUp(mCardView);
                    mCardView.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    public void slideUp(View view){
        view.setVisibility(View.VISIBLE);
        TranslateAnimation animate = new TranslateAnimation(
                0,
                0,
                view.getHeight(),
                0);
        animate.setDuration(500);
        animate.setFillAfter(true);
        view.startAnimation(animate);
    }

    public void slideDown(View view){
        TranslateAnimation animate = new TranslateAnimation(
                0,
                0,
                0,
                view.getHeight());
        animate.setDuration(500);
        animate.setFillAfter(true);
        view.startAnimation(animate);
    }
}
