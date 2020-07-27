package com.tec.anji.view.recycler;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tec.anji.R;

public class GridRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycler_view);

        RecyclerView recyclerView = findViewById(R.id.rv_3);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(new GridRecyclerViewAdapter(this, i -> Toast.makeText(this, "点击位置 = " + i, Toast.LENGTH_SHORT).show()));
    }
}
