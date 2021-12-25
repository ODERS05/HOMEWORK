package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle[] circles = new Circle[10];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i + 1);
            circle.getCircleSquare(i);
            System.out.println(circle.toString());
        }
        System.out.println("Количество кругов площадь которых кратна 3: " + Circle.getCountOfDecisions());
    }
}
