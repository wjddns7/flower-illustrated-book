package com.example.dogam;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    public void cosmos(View view){
        Intent intent = new Intent(getApplicationContext(),cosmos.class);
        startActivity(intent);
        finish();
    }
    public void daisy(View view){
        Intent intent = new Intent(getApplicationContext(),daisy.class);
        startActivity(intent);
        finish();
    }
    public void sunflower(View view){
        Intent intent = new Intent(getApplicationContext(),sunflower.class);
        startActivity(intent);
        finish();
    }
    public void mistflower(View view){
        Intent intent = new Intent(getApplicationContext(),mistflower.class);
        startActivity(intent);
        finish();
    }
}