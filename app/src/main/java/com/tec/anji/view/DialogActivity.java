package com.tec.anji.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.tec.anji.R;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        // 默认
        Button btnDialog1 = findViewById(R.id.btn_dialog_1);
        btnDialog1.setOnClickListener(view -> {
            AlertDialog dialog1 = new AlertDialog.Builder(DialogActivity.this)
                    .setTitle("请回答")
                    .setIcon(R.drawable.user)
                    .setMessage("你觉得课程如何?")
                    .setPositiveButton("棒", (dialog, which) -> Toast.makeText(getApplicationContext(), "你很诚实", Toast.LENGTH_SHORT).show())
                    .setNegativeButton("不好", (dialog, which) -> Toast.makeText(getApplicationContext(), "睁眼说瞎话", Toast.LENGTH_SHORT).show())
                    .setNeutralButton("还行", (dialog, which) -> Toast.makeText(getApplicationContext(), "你再瞅瞅~", Toast.LENGTH_SHORT).show())
                    .create();
            dialog1.show();
        });
        // 单选1
        Button btnDialog2 = findViewById(R.id.btn_dialog_2);
        btnDialog2.setOnClickListener(view -> {
            String[] items = new String[]{"女", "男"};
            AlertDialog dialog2 = new AlertDialog.Builder(DialogActivity.this)
                    .setTitle("请选择性别")
                    .setItems(items, (dialog, which) -> {
                        Toast.makeText(getApplicationContext(), items[which], Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }).create();
            dialog2.show();
        });
        // 单选2
        Button btnDialog3 = findViewById(R.id.btn_dialog_3);
        btnDialog3.setOnClickListener(view -> {
            String[] items = new String[]{"女", "男"};
            AlertDialog dialog3 = new AlertDialog.Builder(DialogActivity.this)
                    .setTitle("请选择性别")
                    .setSingleChoiceItems(items, 0, (dialog, which) -> {
                        Toast.makeText(getApplicationContext(), items[which], Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }).create();
            dialog3.show();
        });
        // 多选
        Button btnDialog4 = findViewById(R.id.btn_dialog_4);
        btnDialog4.setOnClickListener(view -> {
            String[] items = new String[]{"唱", "跳", "RAP"};
            boolean[] checkedItems = new boolean[]{false, false, true};
            AlertDialog dialog4 = new AlertDialog.Builder(DialogActivity.this)
                    .setTitle("请选择兴趣")
                    .setMultiChoiceItems(items, checkedItems, (dialog, which, isChecked) -> Toast.makeText(getApplicationContext(), items[which] + ":" + isChecked, Toast.LENGTH_SHORT).show())
                    .setPositiveButton("确认", (dialog, which) -> dialog.dismiss())
                    .create();
            dialog4.show();
        });
        // 自定义
        Button btnDialog5 = findViewById(R.id.btn_dialog_5);
        btnDialog5.setOnClickListener(view -> {
            AlertDialog dialog5 = new AlertDialog.Builder(DialogActivity.this)
                    .setTitle("登录界面")
                    .create();
            View loginView = getLayoutInflater().inflate(R.layout.layout_login, null);
            Button btnLogin = loginView.findViewById(R.id.btn_login);
            btnLogin.setOnClickListener(v -> {
                Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_SHORT).show();
                dialog5.dismiss();
            });
            dialog5.setView(loginView);
            dialog5.show();
        });
    }
}
