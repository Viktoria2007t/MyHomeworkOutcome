package com.example.myhomeworkoutcome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Description_dog extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_dog);



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

        animals.add( new Animal("Ярик", " Группа Терьеры. История йоркширских терьеров насчитывает более трехсот лет. Сначала их использовали для борьбы с крысами и мышами, а позже порода стала декоративной и в этом качестве приобрела необычайную популярность. Йорки унаследовали от терьеров выносливость, энергичность, приобрели красоту и изящество, присущие комнатным собакам. Отличительная особенность породы – длинная струящаяся шерсть, напоминающая женские волосы. Окрасы йориков разнообразны – серые, стальные, рыжие, коричневые, пестрые, однотонные. Собаки отличаются по размеру – стандарт, мини, микро (или супер-мини) ",
                R.drawable.dog, "Возраст:7лет"));


    }

    // обработка нажатия кнопки
    public void onClickL(View view) {
        Intent intent = new Intent(this, MyDogActivity.class);
        startActivity(intent);
    }
}