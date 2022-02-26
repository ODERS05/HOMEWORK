package com.company.University.Managment;

import com.company.University.Group.Group;
import com.company.University.Student.Student;

import java.util.ArrayList;

public interface Managment {
    //1) Добавление новой группы (При создании Группы, проинициализируйте поле students пустым списком(new ArrayList()))
//2) Добавление нового студента и его оценок в группу по номеру группы
//3) Удаление студента из группы по номеру группы и объекту студент
//4) Перевод группы на следующий курс, всех студентов у которых средний балл < 61, удалить из группы и перевести в список на отчисление
//5) Записать в файл всех студентов на отчисление
    ArrayList<Group> createListGroup();
    ArrayList<Student> studentsForEnrollment();
    boolean addGroup(Group group);
    boolean addStudentToGroup(int groupId,Student student);
    boolean removeStudentFromGroup(int groupId,Student student);
}
