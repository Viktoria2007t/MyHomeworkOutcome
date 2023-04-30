package com.example.myhomeworkoutcome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MyDogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dog);
    }

    // обработка нажатия кнопки
    public void onClickH(View view) {
        Intent intent = new Intent(this, Description_dog.class);
        startActivity(intent);
    }


    // обработка нажатия кнопки
    public void onClickB(View view) {
        Intent intent = new Intent(this, MyCatActivity.class);
        startActivity(intent);
    }
}