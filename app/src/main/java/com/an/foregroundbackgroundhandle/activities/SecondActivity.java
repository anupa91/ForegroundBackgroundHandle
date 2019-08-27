package com.an.foregroundbackgroundhandle.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.an.foregroundbackgroundhandle.R;

public class SecondActivity extends AppCompatActivity {

    // Constants
    public static final String TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
