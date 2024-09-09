package org.example;

import java.util.List;

public class School {
    public List<Student> students;
    public void showStudents() {
        System.out.println(students);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }
    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }
}
