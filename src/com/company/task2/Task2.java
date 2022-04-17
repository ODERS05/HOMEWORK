package com.company.task2;

import java.util.Scanner;

public class Task2 {
    public void task2() {
        Scanner sc = new Scanner(System.in);
        int point;
        System.out.println("Введите номер операции: ");
        do {
            System.out.println("1.Сложение");
            System.out.println("2.Вычитание");
            System.out.println("3.Умножение");
            System.out.println("0.Завершение программмы");
            point = sc.nextInt();
            switch (point) {
                case 1:
                    System.out.println("Вы выбрали сложение");
                    break;
                case 2:
                    System.out.println("Вы выбрали вычитание");
                    break;
                case 3:
                    System.out.println("Вы выбрали умножение");
                    break;
            }
            if (point > 3) {
                System.out.println("Ой что-то не так попробуй снова");
            }
        }while (point != 0);
    }
}
