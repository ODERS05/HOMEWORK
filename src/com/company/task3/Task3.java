package com.company.task3;

import java.util.Scanner;

public class Task3 {
    public void task3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину стороны: ");
        int side = sc.nextInt();
        for (int i = 1; i < side; i++) {
            for (int j = 1; j < side; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
