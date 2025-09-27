package lec2;
import java.util.PriorityQueue;

public class Kthlarg {
    public static void main(String[] args) {
        int[] nums={3,2,1,5,6,4};
        int k =2;
        System.out.print(Largest(nums,k));

       
    }
    public static int Largest(int[] nums, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            minHeap.add(nums[i]);
        }
        if(minHeap.size()>=k){
            minHeap.poll();

        }
        return minHeap.peek();
    }

    
}
