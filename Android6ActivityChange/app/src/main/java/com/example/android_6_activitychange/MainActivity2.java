package com.example.android_6_activitychange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void GOTOA(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
