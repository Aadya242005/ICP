package lec3;

public class Count_negative {
    public static void main(String[] args) {
        int[][] arr = {{4,3,2,-1},{3,2,1,-1},{1,2,-1,-2},{-1,-1,-2,3}};
        System.out.print(countNegatives(arr));    
    }
    public static int countNegatives(int[][] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<0){
                    count++;

                }
            }
        }
        return count;
        
    }  
}
