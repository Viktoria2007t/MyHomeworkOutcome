package com.example.myhomeworkoutcome;


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
    // обработка нажатия кнопки
    public void onClickA(View view) {
        Intent intent = new Intent(this, MyDogActivity.class);
        startActivity(intent);
    }

    // обработка нажатия кнопки
    public void onClickB(View view) {
        Intent intent = new Intent(this, MyCatActivity.class);
        startActivity(intent);
    }
    // обработка нажатия кнопки
    public void onClickC(View view) {
        Intent intent = new Intent(this, MyRabbitsActivity.class);
        startActivity(intent);
    }
    // обработка нажатия кнопки
    public void onClickD(View view) {
        Intent intent = new Intent(this, MyFishActivity.class);
        startActivity(intent);
    }



}
