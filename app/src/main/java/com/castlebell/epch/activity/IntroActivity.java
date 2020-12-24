package com.castlebell.epch.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.castlebell.epch.R;

public class IntroActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        startActivity(new Intent(IntroActivity.this,NavigationActivity.class));
        finish();
    }

}