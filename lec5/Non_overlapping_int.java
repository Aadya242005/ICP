package lec5;

import java.util.Arrays;

public class Non_overlapping_int {
    public static void main(String[] args){
        int[][] arr = {{1,2},{2,3},{3,4},{1,3}};
        System.out.print(Overlap(arr));

    }
    public static int Overlap(int[][] arr){
        Arrays.sort(arr, (a,b)-> a[1]-b[1]);  //start
        int count =1;
        int end = arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>=end){
                count++;
                end = arr[i][1];
            }
            
        }
        return arr.length-count;

        
    }

}
