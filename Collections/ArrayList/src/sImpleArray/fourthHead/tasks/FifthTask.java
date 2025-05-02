package sImpleArray.fourthHead.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FifthTask {
    public static void main(String[] args) throws IOException {
        int[] nums = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) nums[i] = Integer.parseInt(reader.readLine());

        int[] numsF = new int[10];
        int[] numsS = new int[10];
        for(int i = 0; i < 20; i++){
            if(i < 20 / 2) numsF[i] = nums[i];
            else numsS[i - 20/2] = nums[i];
        }

        for (int i = 0; i < 10; i++) System.out.println(numsS[i]);
    }
}
