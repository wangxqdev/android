package com.tec.anji.jetpack.view;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.tec.anji.R;
import com.tec.anji.jetpack.MvvmViewModel;

public class MvvmActivity extends AppCompatActivity {

    private MvvmViewModel mvvmViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvm);

        TextView textView = findViewById(R.id.tv_1);
        ImageButton btnLike = findViewById(R.id.ib_like);
        ImageButton btnDislike = findViewById(R.id.ib_dislike);

        mvvmViewModel = new ViewModelProvider(this).get(MvvmViewModel.class);
        mvvmViewModel.getLikedNumber().observe(this, t -> textView.setText(String.valueOf(t)));

        btnLike.setOnClickListener(view -> mvvmViewModel.addLikedNumber(1));

        btnDislike.setOnClickListener(view -> mvvmViewModel.addLikedNumber(-1));
    }
}