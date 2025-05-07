package arrayList.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Third {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int minMain = 2147483647;
        for(int i = 0; i < 5; i++) {
            list.add(read.readLine());
            if(minMain > list.get(i).length()) minMain = list.get(i).length();
        }
        for(int i = 0; i < 5; i++) {
            if(minMain == list.get(i).length()) System.out.println(list.get(i));
        }
    }
}
