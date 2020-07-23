package com.tec.anji.view;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.tec.anji.R;

public class RadioButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        // 事件监听
        RadioGroup rg2 = findViewById(R.id.rg_2);
        rg2.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton radioButton = findViewById(checkedId);
            Toast.makeText(RadioButtonActivity.this, radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
        });
    }
}
