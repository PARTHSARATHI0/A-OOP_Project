package sis;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementImpl implements StudentManagement {
    private List<Student> students;

    public StudentManagementImpl() {
        this.students = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(int studentId) {
        students.removeIf(student -> student.getId() == studentId);
    }

    @Override
    public Student getStudent(int studentId) {
        return students.stream()
                .filter(student -> student.getId() == studentId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }
}
