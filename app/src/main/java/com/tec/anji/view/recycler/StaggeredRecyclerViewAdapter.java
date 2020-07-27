package com.tec.anji.view.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.tec.anji.R;

public class StaggeredRecyclerViewAdapter extends RecyclerView.Adapter<StaggeredRecyclerViewAdapter.ViewHolder> {

    private Context context;

    private OnClickListener onClickListener;

    StaggeredRecyclerViewAdapter(Context context, OnClickListener onClickListener) {
        this.context = context;
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_staggered_recycler_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        if (i % 2 != 0) {
            viewHolder.imageView.setImageResource(R.drawable.image1);
        } else {
            viewHolder.imageView.setImageResource(R.drawable.image2);
        }
        viewHolder.imageView.setOnClickListener(view -> onClickListener.onClick(i));
    }

    @Override
    public int getItemCount() {
        return 80;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.iv_staggered);
        }
    }

    interface OnClickListener {

        void onClick(int position);
    }
}
