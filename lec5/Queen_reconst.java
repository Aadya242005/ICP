package lec5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Queen_reconst{
    public static void main(String[]args){
        int[][] arr = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        System.out.print(reconstruct(arr));

    }
     public static int[][] reconstruct(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1]; 
            } else {
                return b[0] - a[0]; 
            }
        });

        List<int[]> result = new LinkedList<>();
        for (int[] person : people) {
            result.add(person[1], person);  
        }

        return result.toArray(new int[people.length][]);
    }
}
