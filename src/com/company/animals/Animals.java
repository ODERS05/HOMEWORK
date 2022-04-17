package com.company.animals;

public class Animals {
    private int age;
    private String name;
    private String breed;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
