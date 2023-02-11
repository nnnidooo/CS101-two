import Inheritance1.Laptop;
import Inheritance1.SmartPhone;
import Interface1.Burger;
import Interface1.FastFood;
import Interface1.Pizza;
import Interface1.Sandwich;
import Interface2.Motorcycle;
import Modelling.School;
import Modelling.Teacher;
import Override.OldSchoolRap;
import Override.RapSong;
import Override.NewSchoolRap;

public class Main {
    public static void main(String[] args) {
        //Inheritance 1
        Laptop laptop = new Laptop("Air", 16, true);
        SmartPhone smartPhone = new SmartPhone("Iphone", 64, false);

        School school = new School();
        Teacher teacher1 = new Teacher("Anne", "English");


        FastFood [] menu = {
        new Pizza("Margharita", "Pizaria", 546),
        new Burger("Cheese burger", "Macdonald's", 436),
        new Sandwich("FrenchToast", "O'Snacks", 589),
        };

        for (int i = 0; i< menu.length; i++ ) {
            menu[i].getname();
            menu[i].getbrand();
            menu[i].getcalories();
        }


        Motorcycle BMW = new Motorcycle("Modelx4", false);
        Motorcycle Audi = new Motorcycle("Qw3", true);

        System.out.println(BMW);
        System.out.println(Audi);

        RapSong kanye = new RapSong();
        NewSchoolRap gilli = new NewSchoolRap();
        OldSchoolRap tupac = new OldSchoolRap();

        kanye.play();
        gilli.play();
        tupac.play();

    }
}