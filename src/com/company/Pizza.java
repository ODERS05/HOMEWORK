package com.company;

public abstract class Pizza {
    private int price;
    private double weight;
    private static int idPizza;
    public Pizza(){

    }
    public Pizza(int price, double weight){
        this.price = price;
        this.weight = weight;
    }
    public void pizzaLabel(String type, int price, double weight, String specificity){
        System.out.println("Тип: " + type + "Цена: " + price + "Вес: "+ weight + "Предпочтения: "+ specificity);
    }
    public void cook(){
        idPizza++;
        System.out.println("Готовится пицца №" + idPizza + "!");
    }
    public void delivery(){
        System.out.println("Доставляется пицца: " + toString());
    }
    @Override
    public String toString() {
        return "цена = " + price +
                ", вес = " + weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getIdPizza() {
        return idPizza;
    }

    public static void setIdPizza(int idPizza) {
        Pizza.idPizza = idPizza;
    }
}
