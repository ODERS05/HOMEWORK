package com.company.University.Student;

import java.util.List;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private List<Integer> subjectGrades;
    public Student(){

    }
    public Student(String name, int id, List<Integer> subjectGrades){
        this.name = name;
        this.id = id;
        this.subjectGrades = subjectGrades;
    }
    public int gradeAverage(){
        int sum = 0;
        for (Integer integer : subjectGrades) {
            sum+=integer;
        }
        return sum/subjectGrades.size();
    }
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(subjectGrades, student.subjectGrades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, subjectGrades);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getSubjectGrades() {
        return subjectGrades;
    }

    public void setSubjectGrades(List<Integer> grades) {
        this.subjectGrades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grades=" + subjectGrades +
                '}';
    }
}
