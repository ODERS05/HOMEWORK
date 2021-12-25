package com.company;

public class LaFinta extends Pizza{
    private boolean isMushroom;
    public LaFinta(int price, double weight, boolean isMushroom){
        super(price, weight);
        this.isMushroom = isMushroom;
    }


    @Override
    public String toString() {
        return "Ла финта: " + (isMushroom ? "с грибами" : "без грибов") + ", " + super.toString();

    }
    public boolean isMushroom() {
        return isMushroom;
    }

    public void setMushroom(boolean mushroom) {
        isMushroom = mushroom;
    }
}
