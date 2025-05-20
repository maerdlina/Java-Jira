package ToDoArrayList.src.main.java.org.anki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;

public class App
{
    public static void main( String[] args ) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Boolean createNotes = true;
        ArrayList<Note> notesList = new ArrayList<>();

        while(createNotes){
            System.out.println("Вы хотите создать заметку? Введите: true или false");
            createNotes = Boolean.parseBoolean(read.readLine().toLowerCase(Locale.ROOT));
            if(createNotes == true) {
                System.out.println("Введите сначала название, потом текст");
                Note note = new Note(read.readLine(), read.readLine());
                notesList.add(note);
            } else break;

            Boolean statusBool = true;
            while(statusBool){
                System.out.println("Вы хотите поменять статус задачи по индексу?");
                statusBool = Boolean.parseBoolean(read.readLine().toLowerCase(Locale.ROOT));
                if(statusBool == false) break;
                else{
                    System.out.println("Введите индекс");
                    Integer index = Integer.parseInt(read.readLine()) - 1;
                    System.out.println("Введите значение статуса: true - done, false - not done:");
                    notesList.get(index).changeStatus(Boolean.parseBoolean(read.readLine().toLowerCase(Locale.ROOT)));
                }

            }

        }
        for(Note s: notesList) System.out.println(s.toString());
    }
}
