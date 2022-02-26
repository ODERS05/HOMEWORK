package com.company.Maps;

import com.company.Animal.Cat;
import com.company.Animal.Dog;
import com.company.Animal.Parrot;
import com.company.Animal.Pet;

import java.util.Map;

public interface PetMaps {
    Map<Dog, Pet> addDog();
    Map<Cat, Pet> addCat();
    Map<Parrot, Pet> addParrot();
}
