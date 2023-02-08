package Inheritance1;

public class Laptop extends Computer {
    private int battery;

     public Laptop(String model, int GB, boolean isOn) {
         super(model, GB, isOn);
         this.battery = battery;
     }

     //getter
     public int getBattery() {
         return battery;
     }

    public void showBattery(){
        System.out.println("Battery life " + battery + " percentage %");
    }


 }
