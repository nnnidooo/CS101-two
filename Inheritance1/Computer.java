package Inheritance1;

public class Computer {
    private String model;
    private int GB;
    private boolean isOn;

    //Constructer
    public Computer(String model, int GB, boolean isOn){
        this.model = model;
        this.GB = GB;
        this.isOn = isOn;
    }

    public void start(){
        System.out.println("The computer is starting");
    }
    public void stop(){
        System.out.println("The computer is shutting down now");
    }

    public String getModel() {
        return model;
    }

    public int getGB() {
        return GB;
    }

    public boolean getIsOn() {
        return isOn;
    }
}
