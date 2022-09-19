package com.example.dogam;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import com.example.dogam.databinding.ActivityDaisyBinding;

public class daisy extends AppCompatActivity {

    private ActivityDaisyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDaisyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());

    }
    public void pre(View view){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
    }
}