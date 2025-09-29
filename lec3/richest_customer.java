package lec3;

public class richest_customer {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{3,2,1}};
        System.out.print(maximumWealth(mat));
        
    }
     public static int maximumWealth(int[][] arr) {

        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=0;j<arr[0].length;j++){
                sum = sum+arr[i][j];
                max = Math.max(sum,max);

            }
        }
        return max;
     
    }
    
}
