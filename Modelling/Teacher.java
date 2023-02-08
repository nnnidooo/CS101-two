package Modelling;

import Modelling.Employee;

public class Teacher extends Employee {
    private String subject;
    public Teacher(String name, String Subject){
        super(name,"Modelling.Teacher");
        this.subject=subject;
    }

    public String getSubject() {
        return subject;
    }
}
