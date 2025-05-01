package sImpleArray.fourthHead;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondTask {
    public static void main(String[] args) throws IOException {
        String[] arr = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++) arr[i] = reader.readLine();
        for(int i = 9; i >= 0; i--) System.out.println(arr[i]);
    }
}
