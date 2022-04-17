package com.company.TaskC;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskC {
    public void TaskC(){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = 0, max = 100;
        int count30 = 0, count60 = 0, count100 = 0;
        int sum30 = 0, sum60 = 0, sum100 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt((max - min + 1) + min);
        }
        System.out.println("Ваш массив = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 30){
                if (arr[i] > 60){
                    sum100 += arr[i];
                    count100++;
                } else {
                    count60++;
                    sum60 += arr[i];
                }
            } else {
                count30++;
                sum30 += arr[i];
            }
        }
        System.out.println("от 1 до 30 => " + (double) sum30/count30 + " ,количествo " + count30);
        System.out.println("от 31 до 60 => "+ (double) sum60/count60 + " ,количествo " + count60);
        System.out.println("от 61 до 100 => "+ (double) sum100/count100 + " ,количествo " + count100);
    }
}
