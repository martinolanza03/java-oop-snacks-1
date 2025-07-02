package com.register;

import com.student.Student;

public class StudentRegister {
    private Student[] students;
    private int studentsNumber;

    public StudentRegister() {
        this.students = new Student[5];
        this.studentsNumber = 0;
    }

    public void addStudents(Student student) {
        if (studentsNumber < students.length) {
            this.students[studentsNumber] = student;
            studentsNumber++;
        }
    }

    public void printStudents() {
        for (int i = 0; i < studentsNumber; i++) {
            System.out.println(students[i].totalStudent());
        }
    }
}
