package ClassWork2_3;

import java.util.ArrayList;
import java.util.List;

public class MainClass2_3 {
    public static void main(String[] args) {
        System.out.println("Hello!");

        Lord lord1 = new LandLord();


        List list1 = new ArrayList();
        list1.add("Maze");
        list1.add(new Lord());
        list1.add(new LandLord());
        list1.add(new Baron());
        System.out.println(list1);

        for (Object l: list1) {
            try {//Выбрасываем исключение, если l не Lord. Также можно сделать через instanceof!
                System.out.println(l);
                ((Lord) l).ahoy();
            } catch (Exception e) {
                System.out.println(l + " is Not LORD!!!");
            }
        }
    }
}
