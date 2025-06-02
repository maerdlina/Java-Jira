package practice;

/*
Практика: обработать список чисел (найти четные, умножить на 2)
* */

import java.util.ArrayList;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args){
        ArrayList<Integer> arrayNum = new ArrayList<>();
        for(int i = 0; i < 20; i++) arrayNum.add(i);
        arrayNum.stream()
                .filter(a -> {
//                    System.out.println("filter: " + a);
                    return a % 2 == 0;
                })
                .map(a1 -> {
//                    System.out.println("map: " + a1 * 2);
                    return a1*2;
                })
                .forEach(a2 -> System.out.println("result: " + a2));
    }

}
