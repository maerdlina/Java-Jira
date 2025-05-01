package arrayList.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class First {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) list.add(read.readLine());
        System.out.println("size: " + list.size());
        for(int i = 0; i < 5; i++) System.out.println(list.get(i));
    }

}
