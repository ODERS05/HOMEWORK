package com.company.taskB;

public class Course {
    private CourseEnum name;
    private String creationDate;
    private static int id;
    private String teacherFio;

    public CourseEnum getName() {
        return name;
    }

    public void setName(CourseEnum name) {
        this.name = name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Course.id = id;
    }

    public String getTeacherFio() {
        return teacherFio;
    }

    public void setTeacherFio(String teacherFio) {
        this.teacherFio = teacherFio;
    }
}
