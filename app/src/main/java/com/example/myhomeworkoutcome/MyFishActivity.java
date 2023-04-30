package com.example.myhomeworkoutcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyFishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_fish);
    }

    // обработка нажатия кнопки
    public void onClickJ(View view) {
        Intent intent = new Intent(this, Description_fish.class);
        startActivity(intent);
    }



    // обработка нажатия кнопки
    public void onClickA(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT); // использование флага перемещения нужной активности на вершину стека
        //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // использование флага уничтожения всех активности кроме той которая требуется
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP); // использование флага перехода к нужной активности без перемещения данной активности в стеке
        startActivity(intent);
    }
}