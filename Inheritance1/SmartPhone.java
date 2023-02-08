package Inheritance1;

public class SmartPhone extends Computer {

    private String brand;
    public SmartPhone(String model, int GB, boolean isOn) {
        super(model, GB, isOn);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    public void restart(){
        System.out.println("Restart this smartphone now!");
    }

}
