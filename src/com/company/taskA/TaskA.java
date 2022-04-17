package com.company.taskA;

import java.util.Arrays;
import java.util.Random;

public class TaskA {
    public void TaskA(){
        Random random = new Random();
        int[] arr = new int[5];
        int min = 0;
        int max = 5;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt((max - min + 1) + min);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count = arr[i];
            }
        }
        if (count > 0) {
            System.out.println("Есть " + count);
        } else System.out.println("No");
    }
}
