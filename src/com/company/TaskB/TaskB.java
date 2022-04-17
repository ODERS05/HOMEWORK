package com.company.TaskB;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskB {
    public void TaskB() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = 1, max = 12;
        int point;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt((max - min + 1) + min);
        }
        do {
            System.out.println();
            System.out.println("1.Просто массив");
            System.out.println("2.Массив и месяц");
            System.out.println("0.Чтобы завершить");
            point = sc.nextInt();
            switch (point) {
                case 1:
                    System.out.println(Arrays.toString(arr));
                    break;
                case 2:
                    System.out.println(Arrays.toString(arr));
                    for (int i = 0; i < arr.length; i++) {
                        switch (arr[i]) {
                            case 1:
                                System.out.print(" January");
                                break;
                            case 2:
                                System.out.print(" February");
                                break;
                            case 3:
                                System.out.print(" March");
                                break;
                            case 4:
                                System.out.print(" April");
                                break;
                            case 5:
                                System.out.print(" May");
                                break;
                            case 6:
                                System.out.print(" June");
                                break;
                            case 7:
                                System.out.print(" July");
                                break;
                            case 8:
                                System.out.print(" August");
                                break;
                            case 9:
                                System.out.print(" September");
                                break;
                            case 10:
                                System.out.print(" October");
                                break;
                            case 11:
                                System.out.print(" November");
                                break;
                            case 12:
                                System.out.print(" December");
                                break;
                        }
                    }
                    break;
            }
        } while (point != 0);
    }
}
