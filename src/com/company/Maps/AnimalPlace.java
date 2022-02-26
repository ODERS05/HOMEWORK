package com.company.Maps;

import com.company.Animal.Cat;
import com.company.Animal.Dog;
import com.company.Animal.Parrot;
import com.company.Animal.Pet;

import java.util.Map;

public class AnimalPlace implements PetMaps{
    Map<Cat,Pet> catPetMap;
    private Map<Dog,Pet> dogPetMap;
    private Map<Parrot,Pet> parrotPetMap;
    public AnimalPlace(){

    }
    public AnimalPlace(Map<Cat,Pet> catPetMap, Map<Dog,Pet> dogPetMap, Map<Parrot,Pet> parrotPetMap){
        this.catPetMap = catPetMap;
        this.dogPetMap = dogPetMap;
        this.parrotPetMap = parrotPetMap;
    }
    @Override
    public Map<Dog, Pet> addDog() {
        dogPetMap.put(new Dog("Pete", 10), new Cat("Uwu", 2));
        dogPetMap.put(new Dog("Kevin", 10), new Parrot("Yumi", 23));
        dogPetMap.put(new Dog("Peter", 10), new Dog("Meow", 11));
        return dogPetMap;
    }

    @Override
    public Map<Cat, Pet> addCat() {
        catPetMap.put(new Cat("Bus", 2), new Dog("Koshoi", 2));
        catPetMap.put(new Cat("Bus", 2), new Parrot("Azret", 2));
        catPetMap.put(new Cat("Bus", 2), new Cat("Iskander", 2));
        return catPetMap;
    }

    @Override
    public Map<Parrot, Pet> addParrot() {
        parrotPetMap.put(new Parrot("Parrot", 12), new Parrot("Jame", 32));
        parrotPetMap.put(new Parrot("Qikert", 12), new Dog("Buster", 32));
        parrotPetMap.put(new Parrot("Sanji", 12), new Cat("Yekinder", 32));
        return parrotPetMap;
    }

    public void showAllPets(){
        System.out.println(addCat());
        System.out.println(addParrot());
        System.out.println(addDog());
    }
    public Map<Cat, Pet> getCatPetMap() {
        return catPetMap;
    }

    public void setCatPetMap(Map<Cat, Pet> catPetMap) {
        this.catPetMap = catPetMap;
    }

    public Map<Dog, Pet> getDogPetMap() {
        return dogPetMap;
    }

    public void setDogPetMap(Map<Dog, Pet> dogPetMap) {
        this.dogPetMap = dogPetMap;
    }

    public Map<Parrot, Pet> getParrotPetMap() {
        return parrotPetMap;
    }

    public void setParrotPetMap(Map<Parrot, Pet> parrotPetMap) {
        this.parrotPetMap = parrotPetMap;
    }
}
