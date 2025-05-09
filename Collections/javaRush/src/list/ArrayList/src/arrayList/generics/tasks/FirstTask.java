package arrayList.generics.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FirstTask {
    public static void printList(ArrayList<Integer> list){
        for(Integer i: list) System.out.println(i);
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> listDivideThree = new ArrayList<Integer>();
        ArrayList<Integer> listDivideTwo = new ArrayList<Integer>();
        ArrayList<Integer> listNotDivideThreeAndTwo = new ArrayList<Integer>();

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 20; i++) {
            int num = Integer.parseInt(read.readLine());

            boolean divBy3 = (num % 3 == 0);
            boolean divBy2 = (num % 2 == 0);

            if(divBy3) listDivideThree.add(num);
            if(divBy2) listDivideTwo.add(num);
            if(!divBy3 && !divBy2) listNotDivideThreeAndTwo.add(num);
        }

        System.out.println("Three:");
        printList(listDivideThree);
        System.out.println("Two:");
        printList(listDivideTwo);
        System.out.println("Another:");
        printList(listNotDivideThreeAndTwo);
    }
}
