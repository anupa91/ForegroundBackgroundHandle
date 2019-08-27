package com.an.foregroundbackgroundhandle.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.an.foregroundbackgroundhandle.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Constants
    public static final String TAG = MainActivity.class.getSimpleName();

    // UI Components
    private Button mBtnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mBtnNext = findViewById(R.id.activity_main_btn_next);
        mBtnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.activity_main_btn_next:
                goToNextActivity();
                break;
            default:
                break;
        }
    }

    private void goToNextActivity() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
