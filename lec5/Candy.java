package lec5;
public class Candy{
    public static void main(String[] args){
        int[] arr = {0,2,4,3,2,1,1,3,5,6,4,0,0};
        System.out.print(Candy_assign(arr));

    }
    public static int Candy_assign(int[] arr){
        int n = arr.length;
        int[]left = new int[n];
        left[0]=1;
        int[] right = new int[n];
        right[n-1] = 1;

        for(int i=1;i<left.length;i++){
            if(arr[i-1]<arr[i]){
                left[i]=left[i-1]+1;
            }else{
                left[i]=1;
            }

        }
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                right[i]=right[i+1]+1;
            }else{
                right[i]=1;
            }
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+Math.max(left[i] ,right[i]);

        }
        
        return sum;
    }
}