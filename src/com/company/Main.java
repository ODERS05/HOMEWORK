package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Display display = new Display(124, "JAPAN", "Matrica123");
        Computer computer = new Computer(display);
        User user = new User();
        user.setPassword("123456qwe");
        user.setAge(16);
        user.setFirstName("Koshoi");
        user.setLogin("ODERS05");
        computer.setColor("Red");
        computer.setMarka("Lenovo");
        System.out.println(display);
        System.out.println("----------------------");
        System.out.println(computer);
        System.out.println("----------------------");
        System.out.print(user);
        System.out.println(user.logic(true));
    }
}

