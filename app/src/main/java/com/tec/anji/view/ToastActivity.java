package com.tec.anji.view;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.tec.anji.R;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        // 默认
        Button btnToast1 = findViewById(R.id.btn_toast_1);
        btnToast1.setOnClickListener(view -> Toast.makeText(ToastActivity.this.getApplicationContext(), btnToast1.getText(), Toast.LENGTH_SHORT).show());
        // 改变位置
        Button btnToast2 = findViewById(R.id.btn_toast_2);
        Toast toastCenter = Toast.makeText(getApplicationContext(), btnToast2.getText(), Toast.LENGTH_SHORT);
        toastCenter.setGravity(Gravity.CENTER, 0, 0);
        btnToast2.setOnClickListener(view -> toastCenter.show());
        // 自定义
        Button btnToast3 = findViewById(R.id.btn_toast_3);
        Toast toastCustom = new Toast(getApplicationContext());
        toastCustom.setView(LayoutInflater.from(this).inflate(R.layout.layout_toast, null));
        toastCustom.setDuration(Toast.LENGTH_SHORT);
        btnToast3.setOnClickListener(view -> toastCustom.show());
    }
}
