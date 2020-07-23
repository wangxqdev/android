package com.tec.anji.view.grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.tec.anji.R;

public class MyGridViewAdapter extends BaseAdapter {

    private Context context;

    private LayoutInflater inflater;

    public MyGridViewAdapter(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (null == convertView) {
            convertView = inflater.inflate(R.layout.layout_grid_item, parent, false);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv_flower);
            holder.textView = convertView.findViewById(R.id.tv_flower);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Glide.with(context).load("https://dss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=3792304709,3802946211&fm=5").into(holder.imageView);
        holder.textView.setText(context.getString(R.string.tv_flower));
        return convertView;
    }

    private class ViewHolder {

        private ImageView imageView;

        private TextView textView;
    }
}
