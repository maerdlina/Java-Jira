package sImpleArray.fourthHead.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {
    public static int[] initializeArray() throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader((System.in)));

        int[] arr = new int[20];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(read.readLine());
        }
        return arr;
    }

    public static int max(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) throws IOException {
        int[] arr = initializeArray();
        System.out.println(max(arr));
    }
}
