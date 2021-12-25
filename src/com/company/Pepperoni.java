package com.company;

public class Pepperoni extends Pizza{
    private boolean isSpicy;
    public Pepperoni(){

    }
    public Pepperoni(int price, double weight, boolean isSpicy){
        super(price, weight);
        this.isSpicy = isSpicy;
    }
    @Override
    public String toString() {
        return "Пеперони: " + ": " + (isSpicy ? "острое" : "не острое") + ", " + super.toString();
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

}
