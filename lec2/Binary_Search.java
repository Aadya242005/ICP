package lec2;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr ={-1,0,3,5,9,12};
        int target = 9;
        System.out.print(Binary_Search(arr,target));

    }
    public static int Binary_Search(int[] arr, int target){
        int lo=0;
        int hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
           
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
     
        return -1;

    }
    
}
