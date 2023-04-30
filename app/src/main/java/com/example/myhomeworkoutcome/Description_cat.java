package com.example.myhomeworkoutcome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Description_cat extends AppCompatActivity {
    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_cat2);



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

        animals.add( new Animal("Мурка", "Порода домашней кошечки - Британская короткошёрстная.крупная порода, имеющая массивное, коренастое телосложение. У представителей этой породы широкая грудная клетка и толстый хвост. Морда, уши, глаза и голова — имеют округлую форму. У кошки короткий широкий нос и массивная нижняя челюсть. Шерсть у британских короткошёрстных — короткая и густая, без пушистости, бывает более ста окрасов и имеет множество комбинаций пятен. ",
                R.drawable.cat,"Возраст:12лет"));


    }
    // обработка нажатия кнопки
    public void onClickM(View view) {
        Intent intent = new Intent(this, MyCatActivity.class);
        startActivity(intent);
    }
}