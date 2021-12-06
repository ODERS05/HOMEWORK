package com.company;

public class Raskladka {
    String type;

    public Raskladka(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString(){
        return type;
    }
}
