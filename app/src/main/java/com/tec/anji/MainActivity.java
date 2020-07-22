package com.tec.anji;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import com.tec.anji.view.ButtonActivity;
import com.tec.anji.view.EditTextActivity;
import com.tec.anji.view.TextViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TextView
        Button btnTextView = findViewById(R.id.btn_textView);
        btnTextView.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
            startActivity(intent);
        });
        // Button
        Button btnButton = findViewById(R.id.btn_button);
        btnButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
            startActivity(intent);
        });
        // EditText
        Button btnEditText = findViewById(R.id.btn_editText);
        btnEditText.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, EditTextActivity.class);
            startActivity(intent);
        });
    }
}
