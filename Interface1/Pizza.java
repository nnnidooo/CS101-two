package Interface1;

import java.util.ArrayList;

public class Pizza implements FastFood{

    private String name;
    private String brand;
    private int calories;
    private ArrayList<String> fastfood;


    public Pizza(String name, String brand, int calories){
        this.name=name;
        this.brand=brand;
        this.calories=calories;
        this.fastfood = fastfood;

    }
    @Override
    public String getname() {
        return null;
    }

    @Override
    public String getbrand() {
        return null;
    }

    @Override
    public int getcalories() {
        return 0;
    }

}
