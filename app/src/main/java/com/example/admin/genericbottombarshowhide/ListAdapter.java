package com.example.admin.genericbottombarshowhide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder>{
    private List<ListModel> listModels;
    private Activity activity;

    public ListAdapter(List<ListModel> listModels, Activity activity) {
        this.listModels = listModels;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.child_list, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder listViewHolder, int i) {
        ListModel listModel = listModels.get(i);
        String name = listModel.getName();
        listViewHolder.mName.setText(name);
    }

    @Override
    public int getItemCount() {
        return listModels.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        private TextView mName;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.childName);
        }
    }
}
