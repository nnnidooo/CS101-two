package Modelling;

import Modelling.Person;

public class Employee extends Person {
    private String position;
    public Employee(String name, String position){
        super(name);
        this.position=position;
    }
    public String getPosition(){
        return position;
    }


}
