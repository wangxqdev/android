package com.tec.anji.view.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.tec.anji.R;

public class LinearRecyclerViewAdapter extends RecyclerView.Adapter<LinearRecyclerViewAdapter.ViewHolder> {

    private Context context;

    private OnClickListener onClickListener;

    LinearRecyclerViewAdapter(Context context, OnClickListener onClickListener) {
        this.context = context;
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_linear_recycler_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.textView.setText(context.getString(R.string.app_name));
        viewHolder.itemView.setOnClickListener(view -> onClickListener.onClick(i));
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textView = itemView.findViewById(R.id.tv_linear);
        }
    }

    interface OnClickListener {

        void onClick(int position);
    }
}
