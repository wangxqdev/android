package com.tec.anji;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.tec.anji.fragment.FragmentActivity;
import com.tec.anji.jetpack.view.MvvmActivity;
import com.tec.anji.view.*;
import com.tec.anji.view.grid.GridViewActivity;
import com.tec.anji.view.list.ListViewActivity;
import com.tec.anji.view.recycler.GridRecyclerViewActivity;
import com.tec.anji.view.recycler.HorizontalRecyclerViewActivity;
import com.tec.anji.view.recycler.StaggeredRecyclerViewActivity;
import com.tec.anji.view.recycler.VerticalRecyclerViewActivity;

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
        // CheckBox
        Button btnCheckBox = findViewById(R.id.btn_checkBox);
        btnCheckBox.setOnClickListener(view -> startActivity(CheckBoxActivity.class));
        // ImageView
        Button btnImageView = findViewById(R.id.btn_imageView);
        btnImageView.setOnClickListener(view -> startActivity(ImageViewActivity.class));
        // ListView
        Button btnListView = findViewById(R.id.btn_listView);
        btnListView.setOnClickListener(view -> startActivity(ListViewActivity.class));
        // GridView
        Button btnGridView = findViewById(R.id.btn_gridView);
        btnGridView.setOnClickListener(view -> startActivity(GridViewActivity.class));
        // VerticalRecyclerView
        Button btnVerticalRecyclerView = findViewById(R.id.btn_verticalRecyclerView);
        btnVerticalRecyclerView.setOnClickListener(view -> startActivity(VerticalRecyclerViewActivity.class));
        // HorizontalRecyclerView
        Button btnHorizontalRecyclerView = findViewById(R.id.btn_horizontalRecyclerView);
        btnHorizontalRecyclerView.setOnClickListener(view -> startActivity(HorizontalRecyclerViewActivity.class));
        // GridRecyclerView
        Button btnGridRecyclerView = findViewById(R.id.btn_gridRecyclerView);
        btnGridRecyclerView.setOnClickListener(view -> startActivity(GridRecyclerViewActivity.class));
        // StaggeredRecyclerView
        Button btnStaggeredRecyclerView = findViewById(R.id.btn_staggeredRecyclerView);
        btnStaggeredRecyclerView.setOnClickListener(view -> startActivity(StaggeredRecyclerViewActivity.class));
        // WebView
        Button btnWebView = findViewById(R.id.btn_webView);
        btnWebView.setOnClickListener(view -> startActivity(WebViewActivity.class));
        // Toast
        Button btnToast = findViewById(R.id.btn_toast);
        btnToast.setOnClickListener(view -> startActivity(ToastActivity.class));
        // AlertDialog
        Button btnDialog = findViewById(R.id.btn_dialog);
        btnDialog.setOnClickListener(view -> startActivity(DialogActivity.class));
        // Fragment
        Button btnFragment = findViewById(R.id.btn_fragment);
        btnFragment.setOnClickListener(view -> startActivity(FragmentActivity.class));
        // Jetpack
        Button btnJetpack = findViewById(R.id.btn_mvvm);
        btnJetpack.setOnClickListener(view -> startActivity(MvvmActivity.class));
    }

    private void startActivity(Class<? extends Context> cls) {
        Intent intent = new Intent(MainActivity.this, cls);
        startActivity(intent);
    }
}
