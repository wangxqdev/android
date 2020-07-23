package com.tec.anji.view.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.tec.anji.R;

public class MyListViewAdapter extends BaseAdapter {

    private Context context;

    private LayoutInflater layoutInflater;

    public MyListViewAdapter(Context context) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
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
            convertView = layoutInflater.inflate(R.layout.layout_list_item, parent, false);
            holder = new ViewHolder();
            holder.ivLeft = convertView.findViewById(R.id.iv_left);
            holder.tvTitle = convertView.findViewById(R.id.tv_title);
            holder.tvTime = convertView.findViewById(R.id.tv_time);
            holder.tvContent = convertView.findViewById(R.id.tv_content);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        // 加载数据
        Glide.with(context).load("https://logo.baidu.com/images/logo.png").into(holder.ivLeft);
        holder.tvTitle.setText(context.getString(R.string.app_name));
        holder.tvTime.setText("2020/7/23");
        holder.tvContent.setText(context.getString(R.string.app_name));
        return convertView;
    }

    private class ViewHolder {

        private ImageView ivLeft;

        private TextView tvTitle;

        private TextView tvTime;

        private TextView tvContent;
    }
}
