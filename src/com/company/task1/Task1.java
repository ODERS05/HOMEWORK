package com.company.task1;

import java.util.Scanner;

public class Task1 {
    public void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        double sum = sc.nextDouble();
        double deposit = 0;
        if (sum >= 100){
            if (sum >= 200){
                deposit = sum * 0.1;
            } else {
                deposit = sum * 0.07;
            }
        }else {
            deposit = sum * 0.05;
        }
        sum += deposit;
        System.out.println("Сумма вклада с процентами: " + sum);
    }
}
