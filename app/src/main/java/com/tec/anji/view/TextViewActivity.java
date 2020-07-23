package com.tec.anji.view;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tec.anji.R;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        // 中划线
        TextView tv4 = findViewById(R.id.tv_4);
        tv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        // 抗锯齿
        tv4.getPaint().setAntiAlias(true);
        // 下划线
        TextView tv5 = findViewById(R.id.tv_5);
        tv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
    }
}
