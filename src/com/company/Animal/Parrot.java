package com.company.Animal;

public class Parrot extends  Pet{
    public Parrot() {
    }

    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}

