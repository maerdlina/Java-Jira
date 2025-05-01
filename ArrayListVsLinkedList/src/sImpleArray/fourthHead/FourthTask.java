package sImpleArray.fourthHead;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourthTask {
    public static void main(String[] args) throws IOException {
        int[] nums = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) nums[i] = Integer.parseInt(reader.readLine());
        for(int i = 0; i < 10 / 2; i++){
            int copy = nums[i];
            nums[i] = nums[9 - i];
            nums[9 - i] = copy;
        }
        for (int i = 0; i < 10; i++) System.out.println(nums[i]);
    }
}
