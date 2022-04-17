package com.company.university;
public class Student {
    private String name;
    private int age;
    private int groupId;

    public Student(){

    }
    public Student(String name, int age, int groupId) {
        this.groupId = groupId;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", groupId=" + groupId +
                '}';
    }
}
