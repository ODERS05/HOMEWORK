package com.company;

public class Circle {
    private final double PI = 3.14;
    private int radius;
    private static int countOfDecisions;
    private double circleSquare;
    public Circle(){

    }

    public Circle(int radius){
        this.radius = radius;
        if ((this.radius * this.PI * 2) % 3 == 0){
            countOfDecisions++;
        }
    }
    public double getCircleSquare(int radius) {
        this.radius = radius;
        this.circleSquare = this.radius * this.PI * 2;
        return circleSquare;
    }


    public static int getCountOfDecisions() {
        return countOfDecisions;
    }

    public static void setCountOfDecisions(int countOfDecisions) {
        Circle.countOfDecisions = countOfDecisions;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle(" +
                "PI = " + PI +
                ", radius = " + radius +
                ", circleSquare = " + circleSquare +
                ')';
    }
}
