package com.example.myhomeworkoutcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MyCatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cat);
    }


    // обработка нажатия кнопки
    public void onClickF(View view) {
        Intent intent = new Intent(this, Description_cat.class);
        startActivity(intent);
    }

    // обработка нажатия кнопки
    public void onClickC(View view) {
        Intent intent = new Intent(this, MyRabbitsActivity.class);
        startActivity(intent);
    }


    }


