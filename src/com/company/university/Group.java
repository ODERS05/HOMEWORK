package com.company.university;

import java.util.Arrays;

public class Group {
    private String name;
    private int groupId;
    private Student[] students = new Student[5];

    public Group(){
    }
    public Group(int groupId, String name, int age){
        this.groupId = groupId;
        this.name = name;
    }
    public void addNewStudent(Student student){
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                students[i] = student;
                if (student == null){
                    System.out.println("Нет мест");
                    break;
                }
                break;
            }
        }
    }
    public void searchByName(String name){
        for (Student student: students) {
            if(student.getName().equals(name)){
                System.out.println(student);
                break;
            }else {
                System.out.println("Такого нет");
                break;
            }
        }
    }
    public void showAllStudents(){
        for (Student s : students) {
            if (s != null){
                System.out.println(s);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", groupId=" + groupId +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
