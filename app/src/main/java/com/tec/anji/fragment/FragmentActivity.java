package com.tec.anji.fragment;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tec.anji.R;

public class FragmentActivity extends AppCompatActivity implements AFragment.IMessage {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        textView = findViewById(R.id.fl_tv);

        getSupportFragmentManager().beginTransaction().
                add(R.id.fl_frag_change, AFragment.newInstance("我是参数"), "a")
                .commitAllowingStateLoss();
    }

    @Override
    public void onChange(String text) {
        textView.setText(text);
    }
}
