package AnimalSystem.src.main.java.org.system;

import org.system.animals.Owl;
import org.system.subtype.Bird;
import org.system.subtype.CatLike;

public class Main {
    public static void main(String[] args) {
        Bird owl = new Owl();
        System.out.println(owl.getDiet());
        System.out.println(owl.getType());
        owl.hunt();
    }
}