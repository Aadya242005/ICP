package lec4;

public class Consecutive_ones {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        int result = longestOnes(nums, k);
        System.out.println(result);
    }

    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxwindow = 0;
        int zeros = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeros++;   

            // shrink window 
            while (zeros > k) {
                if (nums[left] == 0) zeros--;
                left++;
            }

        
            maxwindow = Math.max(maxwindow, right - left + 1);
        }

        return maxwindow;
    }
}
