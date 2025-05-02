package arrayList.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Fifth {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        for(int i = 0; i < 13; i++){
            String last = list.remove(list.size() - 1); // Удаляем именно последний
            list.add(0, last);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
