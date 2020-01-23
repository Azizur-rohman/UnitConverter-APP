package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void temperature(View view) {
        Intent intent = new Intent(MainActivity.this,FcActivity.class);
        startActivity(intent);

    }


    public void currency(View view) {
        Intent intent = new Intent(MainActivity.this,cuActivity.class);
        startActivity(intent);
    }

    public void length(View view) {
        Intent intent = new Intent(MainActivity.this,LeActivity.class);
        startActivity(intent);
    }

    public void area(View view) {
        Intent intent = new Intent(MainActivity.this,ArActivity.class);
        startActivity(intent);
    }

    public void weight(View view) {
        Intent intent = new Intent(MainActivity.this,WeActivity.class);
        startActivity(intent);
    }

    public void time(View view) {
        Intent intent = new Intent(MainActivity.this,TiActivity.class);
        startActivity(intent);
    }




}
