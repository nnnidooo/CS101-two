import Inheritance1.Laptop;
import Inheritance1.SmartPhone;
import Interface1.Burger;
import Interface1.FastFood;
import Interface1.Pizza;
import Interface1.Sandwich;
import Modelling.School;
import Modelling.Teacher;
import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Inheritance 1
    Laptop laptop = new Laptop("Air",16, true);
    SmartPhone smartPhone = new SmartPhone("Iphone", 64, false );
    }

    School school=new School();
    Teacher teacher1 = new Teacher("Anne","English");

    Pizza margharita = new Pizza("Margharita","Pizaria",546);
    Burger cheese = new Burger("Cheese burger", "Macdonald's", 436);

    Sandwich toast = new Sandwich("FrenchToast", "O'Snacks", 589);



}
