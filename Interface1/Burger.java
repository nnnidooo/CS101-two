package Interface1;

public class Burger implements FastFood {

    @Override
    public String name() {
        return "Cheese Burger";
    }

    @Override
    public String brand() {
        return "MacDonald's";
    }

    @Override
    public int calories() {
        return 500;
    }
}
