package com.example.hip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_next(view v)
    {
        Intent intent= new Intent(MainActivity.this,hip.class);
        startActivity(intent);
    }
}