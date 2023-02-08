package Modelling;

import Modelling.Person;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass extends Person {
    private List<Student> students;

    public SchoolClass(String name){
        super(name);
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }
}
