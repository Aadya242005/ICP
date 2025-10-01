package lec5;
import java.util.*;
public class Max_units {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,2},{3,1}};
        int trucksize = 4;
        System.out.print(Max(arr, trucksize));
    }
    public static int Max(int[][]arr ,int trucksize){
        int res =0;
        Arrays.sort(arr,(a,b) -> b[1]-a[1]);
        for(int i=0;i<arr.length;i++){
            int ans = Math.min(trucksize, (arr[i][0]));

            res+=ans*arr[i][1];
            trucksize-=ans;
            if(trucksize==0){
                break;
            }
        }
        return res;

    }
    
}
