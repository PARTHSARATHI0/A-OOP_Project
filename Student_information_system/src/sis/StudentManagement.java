package sis;

import java.util.List;

public interface StudentManagement {
    void addStudent(Student student);
    void removeStudent(int studentId);
    Student getStudent(int studentId);
    List<Student> getAllStudents();
}
