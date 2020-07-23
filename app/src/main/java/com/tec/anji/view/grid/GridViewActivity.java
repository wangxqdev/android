package com.tec.anji.view.grid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import com.tec.anji.R;

public class GridViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        GridView gridView = findViewById(R.id.gv_1);
        gridView.setAdapter(new MyGridViewAdapter(this));
    }
}
