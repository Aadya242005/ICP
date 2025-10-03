package lec6;
import java.util.*;
public class CombinationSumII {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(arr); 
        List<List<Integer>> res = Sum(arr, target, 0, 0, new ArrayList<>());
        System.out.println(res);
    }
    public static List<List<Integer>> Sum(int[] arr, int target, int idx,int sum, List<Integer>ans){
        List<List<Integer>> ll = new ArrayList<>();
        if(sum>target){
            return ll;
        }
        if(sum==target){
            ll.add(new ArrayList<>(ans));
            return ll;
        }
        if(idx>=arr.length){
            return ll;
        }
        ans.add(arr[idx]);
        ll.addAll(Sum(arr, target, idx+1,sum+arr[idx],ans));
        ans.remove(ans.size()-1);
        ll.addAll(Sum(arr, target, idx+1,sum,ans));

        return ll;
    }
    
}
