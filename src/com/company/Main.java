package com.company;

import com.company.Maps.AnimalPlace;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//    Создайте класс Pet и его наследников Cat, Dog, Parrot.
//Создайте отображение из домашних животных, где в качестве ключа выступает тип животного Cat, Dog, Parrot, а в качестве значения список Pet.
//Добавьте в отображение разных животных. Создайте метод выводящий на консоль все ключи отображения.
        AnimalPlace animalPlace = new AnimalPlace(new HashMap<>(),new HashMap<>(),new HashMap<>());
        animalPlace.showAllPets();
    }
}
