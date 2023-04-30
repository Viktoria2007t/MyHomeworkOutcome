package com.example.myhomeworkoutcome;

public class Animal {

    // поля сущности
    private String name; // поле названия животного
    private String animalDescription; // поле описания животного
    private int animalResource; // поле ресурса животного
    private String age; // поле численности популяции

    // конструктор
    public Animal(String name, String animalDescription, int animalResource, String age) {
        this.name = name;
        this.animalDescription = animalDescription;
        this.animalResource = animalResource;
        this.age =age;
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalDescription() {
        return animalDescription;
    }

    public void setAnimalDescription(String animalDescription) {
        this.animalDescription = animalDescription;
    }

    public int getAnimalResource() {
        return animalResource;
    }

    public void setAnimalResource(int animalResource) {
        this.animalResource = animalResource;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }



}

