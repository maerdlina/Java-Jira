package sImpleArray.fourthHead;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirdTask {
    public static void main(String[] args) throws IOException {
        String[] strokes = new String[10];
        int[] nums = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++) strokes[i] = reader.readLine();
        for(int j = 0; j < 10; j++) {
            nums[j] = strokes[j].length();
            System.out.println(nums[j]);
        }
    }
}
