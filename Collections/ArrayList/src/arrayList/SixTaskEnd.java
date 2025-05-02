package arrayList;

import arrayList.sixtaskend.Human;

public class SixTaskEnd {
    public static void main(String[] args) {
        Human papa = new Human("Gianni", true, 38);
        Human son = new Human("Yuki", true, 12, papa);
        System.out.println(son.toString());
        Human mother = new Human("Aia", false, 29);
        Human daughter = new Human("Heien", true, 10, mother);
        System.out.println(daughter.toString());
    }
}
