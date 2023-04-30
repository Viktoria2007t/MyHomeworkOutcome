package com.example.myhomeworkoutcome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Description_rabbits extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_rabbits);



        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }
    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {

        animals.add( new Animal("Степан и Шишичка", " Кролики Ризен - млекопитающие из семейства зайцевых.\n" +
                "Быстрый ответ\n" +
                "Кролики породы Ризен могут достигать веса в 14 кг, но чаще – 10-11 кг. Тело до 75 см в длину, обхват грудины – 40-45 см. Телосложение массивное, костяк крепкий. Лапы сильные, передние прямые. Голова большая, щеки немного отвисают, тем более у взрослых и пожилых особей. Уши до 20 см, стоячие, но нередко наклоняются в бок.\n" +
                "Шерсть густая, очень мягкая, средней длины (4 см). Окрас разнообразный: голубой, черный, белый, желтый, золотой, агути и др.",
                R.drawable.rabbits,"Возрас:2 месяца"));


    }


    // обработка нажатия кнопки
    public void onClickO(View view) {
        Intent intent = new Intent(this, MyRabbitsActivity.class);
        startActivity(intent);
    }
}