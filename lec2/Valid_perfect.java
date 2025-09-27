package lec2;

public class Valid_perfect {
    public static void main(String[] args){
        int num =16;
        System.out.print(Perfect(num));

    }
    public static boolean Perfect(int num){
        if(num<2){
            return true;
        }
        int lo=0;
        int hi = num/2;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int square = mid*mid;
            if(square==num){
                return true;
            }else if(square<num){
                lo=mid+1;
            }else{
                hi = mid-1;
            }
        }
        return false;

    }

    
}
