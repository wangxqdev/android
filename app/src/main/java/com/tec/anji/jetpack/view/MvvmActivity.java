package com.tec.anji.jetpack.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.tec.anji.R;
import com.tec.anji.jetpack.MvvmViewModel;

public class MvvmActivity extends AppCompatActivity {

    private TextView textView;

    private Button button;

    private Button button2;

    private MvvmViewModel mvvmViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvm);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        mvvmViewModel = new ViewModelProvider(this).get(MvvmViewModel.class);
        textView.setText(String.valueOf(mvvmViewModel.getNumber()));

        button.setOnClickListener(view -> {
            mvvmViewModel.add(1);
            textView.setText(String.valueOf(mvvmViewModel.getNumber()));
        });

        button2.setOnClickListener(view -> {
            mvvmViewModel.add(2);
            textView.setText(String.valueOf(mvvmViewModel.getNumber()));
        });
    }
}