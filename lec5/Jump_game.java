package lec5;
public class Jump_game{
    public static void main(String[] args) {
        int[] arr= {3,2,1,0,1,4};
        System.out.print(Jump(arr));
        
    }
    public static boolean Jump(int[]arr){
        int far =0;
        for(int i=0;i<arr.length;i++){
            if(i>far){
                return false;
            }
            far = Math.max(far, (i+arr[i]));
        }
        return true;

    }

}