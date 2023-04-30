package com.example.myhomeworkoutcome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Description_fish extends AppCompatActivity {


    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_fish);


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

        animals.add( new Animal("Рыбки", " Тернеция — серебристая рыба с тремя чёрными поперечными полосами по бокам, одна из которых пересекает глаз. Самцы мельче самок, почти чёрные, имеют более заостренный спинной плавник. Есть вуалевая форма. Искусственно выведены цветные вариететы. Рыба мирная, стайная. Плавает на всех уровнях. Длина взрослых тернеций достигает около 3,5—4,5 см. Тело плоское, окраска тёмно-серебристая, поперек тела расположены три чёрные полосы. ",
                R.drawable.fish, "Возраст:2года"));

    }
    // обработка нажатия кнопки
    public void onClickT(View view) {
        Intent intent = new Intent(this, MyRabbitsActivity.class);
        startActivity(intent);
    }
}