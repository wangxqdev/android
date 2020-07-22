package com.tec.anji.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.tec.anji.R;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }

    public void showToast(View view) {
        Toast.makeText(this, "btn4被点击了", Toast.LENGTH_LONG).show();
    }
}
