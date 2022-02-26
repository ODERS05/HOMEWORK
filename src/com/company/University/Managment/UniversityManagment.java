package com.company.University.Managment;

import com.company.University.Group.Group;
import com.company.University.Student.Student;

import java.util.ArrayList;

public class UniversityManagment implements Managment{
    private ArrayList<Group> groups;
    private ArrayList<Student> students;
    @Override
    public ArrayList<Group> createListGroup() {
        return new ArrayList<>();
    }

    @Override
    public ArrayList<Student> studentsForEnrollment() {
        return new ArrayList<>();
    }

    @Override
    public boolean addGroup(Group group) {
        return groups.add(group);
    }

    @Override
    public boolean addStudentToGroup(int groupId,Student student) {
        for (int i = 0; i < createListGroup().size(); i++) {
            if (createListGroup().get(i).getGroupId() == groupId){
                createListGroup().get(i).addStudent(student);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeStudentFromGroup(int groupId, Student student) {
        for (int i = 0; i < groups.size(); i++) {
            if (groups.get(i).getGroupId() == groupId) {
                for (Student student1 : groups.get(i).getStudents()) {
                    if (student.equals(student1)) {
                        return groups.get(i).getStudents().remove(student);
                    }
                }
            }
        }
        return false;
    }
    public void showAllGroups(){
        System.out.println(groups);
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
