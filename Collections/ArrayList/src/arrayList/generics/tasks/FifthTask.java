package arrayList.generics.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class FifthTask {
    public static void doubleValues(ArrayList<String> list){
        int leng = list.size();
        for(int i = 0; i < leng * 2; i+=2) list.add(i + 1, list.get(i));
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            list.add(scanner.nextLine());
        }

        doubleValues(list);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
