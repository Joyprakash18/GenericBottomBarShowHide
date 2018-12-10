package com.example.admin.genericbottombarshowhide;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

public class RecyclerScrollListener extends RecyclerView.OnScrollListener {
    private OnItemScrollListener mListener;

    public interface OnItemScrollListener {

    }

    @Override
    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
        super.onScrollStateChanged(recyclerView, newState);
    }

    @Override
    public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
    }
}
