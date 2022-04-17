package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Введите длину массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = 0, max = 100;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt((max - min + 1) + min);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int x = arr[j];
                    arr[j] = arr[i];
                    arr[i] = x;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}

