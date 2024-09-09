package org.example;
import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        Student John = new Student("John", "Doe", 23);
        Student Jane = new Student("Jane", "Doe", 22);
        Student Jack = new Student("Jack", "Doe", 21);
        students.add(John);
        students.add(Jane);
        students.add(Jack);

        School newSchool = new School();
        newSchool.students = students;
        System.out.println(newSchool.students);

        newSchool.removeStudent(John);
        System.out.println(newSchool.students);
        System.out.println(newSchool.findStudentById(21));

    }
}