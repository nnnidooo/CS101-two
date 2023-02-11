package Interface2;

import javax.xml.namespace.QName;

public class Motorcycle implements Vehicle {
    private String name;
    private boolean isFullyTanked;

    public Motorcycle(String name, boolean isFullyTanked){
        this.name= name;
        this.isFullyTanked=isFullyTanked;
    }


    @Override
    public void changeGear(int a) {

    }

    @Override
    public void speedUp(int a) {

    }

    @Override
    public void applyBrakes(int a) {

    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", isFullyTanked=" + isFullyTanked +
                '}';
    }
}
