package com.company;

import com.company.university.Group;
import com.company.university.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        Group group = new Group();
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        int point;
        do {
            System.out.println("1.Добавление студента");
            System.out.println("2.Поиск по названию");
            System.out.println("3.Просмотр всех учеников");
            point = sc.nextInt();
            switch (point) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = sc.next();
                    System.out.print("Введите возраст: ");
                    int age = sc.nextInt();
                    System.out.print("Введите id: ");
                    int groupId = sc.nextInt();
                    student = new Student(name, age, groupId);
                    group.addNewStudent(student);
                    break;
                case 2:
                    System.out.println(student.getName());
                    System.out.print("Введите имя: ");
                    String name1 = sc.next();
                    group.searchByName(name1);
                    break;
                case 3:
                    group.showAllStudents();
                    break;
            }
        } while (point != 0);
    }
}
