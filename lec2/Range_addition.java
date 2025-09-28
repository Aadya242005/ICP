package lec2;

import java.util.Arrays;

public class Range_addition {
    public static void main(String[] args) {
        int[][] updates = {{1,3,2}, {2,4,3}, {0,2,-2}};
        int length = 5;
        System.out.println(Arrays.toString(Range(updates, length)));
    }
       
    public static int[] Range(int[][] updates, int length) {
        int[] arr = new int[length];
        
       
        for (int[] update : updates) {
            int i = update[0];
            int j = update[1];
            int curr = update[2];
            arr[i] += curr;
            if (j + 1 < length) {
                arr[j + 1] -= curr; 
            }
        }


        for (int i = 1; i < length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }
}
