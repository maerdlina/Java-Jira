package arrayList.generics.tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class FourthTask  {
    public static void fix(ArrayList<String> list){
        ArrayList<String> end = new ArrayList<String>();
        Iterator<String> iter = list.iterator();

        while(iter.hasNext()){
            String word = iter.next();
            boolean hasL = word.contains("л");
            boolean hasR = word.contains("р");

            if(hasL & hasR) continue;
            else if(hasR) iter.remove();
            else if(hasL) end.add(word);
        }
        list.addAll(end);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза");
        list.add("лира");
        list.add("лоза");

        fix(list);
        for(String s: list) System.out.println(s);
    }
}

