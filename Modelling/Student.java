package Modelling;

import Modelling.Person;

public class Student extends Person {
    private int grade;

    public Student(String name, int grade) {
        super(name);
        this.grade=grade;
    }

    public int getGrade() {
        return grade;
    }
}
