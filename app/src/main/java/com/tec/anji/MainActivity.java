package com.tec.anji;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import com.tec.anji.view.ButtonActivity;
import com.tec.anji.view.EditTextActivity;
import com.tec.anji.view.RadioButtonActivity;
import com.tec.anji.view.TextViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TextView
        Button btnTextView = findViewById(R.id.btn_textView);
        btnTextView.setOnClickListener(view -> startActivity(TextViewActivity.class));
        // Button
        Button btnButton = findViewById(R.id.btn_button);
        btnButton.setOnClickListener(view -> startActivity(ButtonActivity.class));
        // EditText
        Button btnEditText = findViewById(R.id.btn_editText);
        btnEditText.setOnClickListener(view -> startActivity(EditTextActivity.class));
        // RadioButton
        Button btnRadioButton = findViewById(R.id.btn_radioButton);
        btnRadioButton.setOnClickListener(view -> startActivity(RadioButtonActivity.class));
    }

    private void startActivity(Class<? extends Context> cls) {
        Intent intent = new Intent(MainActivity.this, cls);
        startActivity(intent);
    }
}
