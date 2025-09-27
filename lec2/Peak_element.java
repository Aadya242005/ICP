package lec2;

public class Peak_element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(Peak(arr));
    }
    public static int Peak(int[]arr){
        int lo=0;
        int hi = arr.length-1;
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]<arr[mid+1]){
                lo = mid+1;
            }else{
                hi=mid;
            }
        }
        return lo;
    }
    
}
