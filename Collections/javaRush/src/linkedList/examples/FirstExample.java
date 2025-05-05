package linkedList.examples;

import java.util.LinkedList;

/* URLs: 1. LinkedList в Java - https://javarush.com/groups/posts/1938-linkedlist
2. Что «под капотом» у LinkedList? - https://habr.com/ru/articles/337558/
3.
 */

public class FirstExample {
    public static void main(String[] args) {

        String str1 = new String("Hello World!");
        String str2 = new String("My name is Earl");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Moscow");

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str3);
        earlBio.add(1, str2);
        earlBio.add(str4);

        System.out.println(earlBio);

    }
}
