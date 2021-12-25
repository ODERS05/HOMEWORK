package com.company;

public class Margarita extends Pizza{
    private boolean isMeat;
    public Margarita(int price, double weight, boolean isMeat){
        super(price, weight);
        this.isMeat = isMeat;
    }
    @Override
    public String toString() {
        return "Маргарита: " + (isMeat? "c мясом ": "без мяса" + super.toString());

    }
    public boolean isMeat() {
        return isMeat;
    }

    public void setMeat(boolean meat) {
        isMeat = meat;
    }
}
