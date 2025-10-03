package lec6;
import java.util.*;
public class Combinations {
    public static void main(String[] args) {
        int n =4;
        int k =2;
        List<List<Integer>> res = Combinations(1,n,k,  new ArrayList<>());
        System.out.print(res);
    }
    public static List<List<Integer>> Combinations(int idx,int n , int k, List<Integer> ans){
        List<List<Integer>>ll = new ArrayList<>();

        if(ans.size()==k){
            ll.add(new ArrayList<>(ans));
            return ll;
        }
        if(idx>n){
            return ll;
        }

        ans.add(idx);
        ll.addAll(Combinations(idx + 1, n, k, ans));
        ans.remove(ans.size() - 1); // backtrack

   
        ll.addAll(Combinations(idx + 1, n, k, ans));
        return ll;

    }
}
