package arrayList.generics.tasks;

import java.util.ArrayList;

public class ThirdTask {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for(int i = 1; i <= list.size(); i+=2){
            list.add(i, "именно");
        }
        for(String s: list) System.out.println(s);
    }
}
