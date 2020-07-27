package com.tec.anji.view.recycler;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tec.anji.R;

public class StaggeredRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staggered_recycler_view);

        RecyclerView recyclerView = findViewById(R.id.rv_4);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(new StaggeredRecyclerViewAdapter(this, i -> Toast.makeText(this, "点击位置 = " + i, Toast.LENGTH_SHORT).show()));
        recyclerView.addItemDecoration(new MyItemDecoration());
    }

    private class MyItemDecoration extends RecyclerView.ItemDecoration {

        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            int gap = getResources().getDimensionPixelOffset(R.dimen.divider_gap);
            outRect.set(gap, gap, gap, gap);
        }
    }
}
