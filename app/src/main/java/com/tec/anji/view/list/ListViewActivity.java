package com.tec.anji.view.list;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.tec.anji.R;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView listView = findViewById(R.id.lv_1);
        listView.setAdapter(new MyListViewAdapter(this));
        // 事件监听
        listView.setOnItemLongClickListener((parent, view, position, id) -> {
            Toast.makeText(ListViewActivity.this, "位置: " + position, Toast.LENGTH_SHORT).show();
            // true: 阻止事件传播
            return true;
        });
    }
}
