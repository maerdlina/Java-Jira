package arrayList.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Fourth {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        // Добавляем в начало (индекс 0)
        for (int i = 0; i < 10; i++) {
            list.add(0, reader.readLine()); // Ключевое отличие!
        }

        // Итоговый вывод
        for (String s : list) {
            System.out.println(s);
        }
    }
}
