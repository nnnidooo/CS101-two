package Modelling;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<SchoolClass> classes;
    private List<Employee> employees;

    public School(){
        this.classes = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<SchoolClass> getClasses() {
        return classes;
    }
}
