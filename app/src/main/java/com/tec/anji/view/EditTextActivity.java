package com.tec.anji.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;
import com.tec.anji.R;

public class EditTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        // 登录
        Button btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(view -> Toast.makeText(EditTextActivity.this, "登录成功!", Toast.LENGTH_LONG).show());
    }
}
