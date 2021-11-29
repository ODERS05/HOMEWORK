package com.company;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    public void studentGirls() {
        System.out.print("Студентов ");
        int countStudent = sc.nextInt();
        System.out.println("Мальчиков ");
        int boys = sc.nextInt();
        if (boys < countStudent){
            int girls = countStudent - boys;
            System.out.println("Девочек " + girls);
        } else if (boys >  countStudent) System.out.println("Такого не может быть");
        else System.out.println("Девочек нет");

    }
    public void studentName(String name) {
        System.out.println("Имя преподователя " + name);
    }
}
