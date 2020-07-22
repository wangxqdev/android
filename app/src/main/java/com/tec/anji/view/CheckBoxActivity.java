package com.tec.anji.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.Toast;
import com.tec.anji.R;

public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        CheckBox cb1 = findViewById(R.id.cb_1);
        CheckBox cb2 = findViewById(R.id.cb_2);
        CheckBox cb3 = findViewById(R.id.cb_3);
        // 监听事件
        setOnCheckedChangeListener(cb1);
        setOnCheckedChangeListener(cb2);
        setOnCheckedChangeListener(cb3);
    }

    private void setOnCheckedChangeListener(CheckBox checkBox) {
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> Toast.makeText(CheckBoxActivity.this, checkBox.getText().toString(), Toast.LENGTH_SHORT).show());
    }
}
