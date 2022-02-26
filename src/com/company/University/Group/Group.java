package com.company.University.Group;

import com.company.University.Student.Student;

import java.util.Objects;
import java.util.Set;

public class Group {
    private GroupType groupType;
    private String groupName;
    private int groupId;
    private Set<Student> students;
    public Group(){

    }
    public Group(String groupName, int groupId, Set<Student> students, GroupType groupType){
        this.groupName = groupName;
        this.groupId = groupId;
        this.students = students;
        this.groupType = groupType;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return groupId == group.groupId && groupType == group.groupType && Objects.equals(groupName, group.groupName) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupType, groupName, groupId, students);
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public GroupType getGroupType() {
        return groupType;
    }

    public void setGroupType(GroupType groupType) {
        this.groupType = groupType;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupType=" + groupType +
                ", groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", students=" + students +
                '}';
    }
}
