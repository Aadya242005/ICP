package lec2;

import java.util.Arrays;

public class Maximum_product {
    public static void main(String[] args) {
        int[]nums ={1,2,3,4};
        System.out.print(Product(nums));

        
    }
    public static int Product(int[]nums){
        Arrays.sort(nums);
        int n = nums.length;
        
     
        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int option2 = nums[0] * nums[1] * nums[n - 1];
        
        return Math.max(option1, option2);
    }
     
    
}
