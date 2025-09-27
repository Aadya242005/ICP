package lec2;

public class koko_eating {
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        int h =8;
        System.out.print(Koko(arr,h));
    }
    public static int Koko(int[]arr, int h){
        int lo=1;
        int hi = Integer.MIN_VALUE;
        int ans =-1;
       
        for(int i=0;i<arr.length;i++){
            if(arr[i]>hi){
                hi=arr[i];
            }
        }
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(isitpossible(arr,h,mid)){
                ans = mid;
                hi = mid-1;

            }else{
                lo = mid+1;
            }
        }
        return ans;
        
    }
    public static boolean isitpossible(int[]arr, int h, int mid){
        int count=0;
        for(int i=0;i<arr.length;i++){
            count+=Math.ceil(arr[i]/(double)mid);
        }
        if(count<=h){
            return true;
        }
        return false;

    }
}
