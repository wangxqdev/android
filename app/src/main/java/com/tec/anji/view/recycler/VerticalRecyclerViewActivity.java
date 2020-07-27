package com.tec.anji.view.recycler;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tec.anji.R;

public class VerticalRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical_recycler_view);

        RecyclerView view = findViewById(R.id.rv_1);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(new VerticalRecyclerViewAdapter(this, i -> Toast.makeText(this, "点击位置 = " + i, Toast.LENGTH_SHORT).show()));
        view.addItemDecoration(new MyItemDecoration());
    }

    private class MyItemDecoration extends RecyclerView.ItemDecoration {

        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0, 0, 0, getResources().getDimensionPixelOffset(R.dimen.divider_height));
        }
    }
}
