package lec1;

import java.util.HashSet;
// Brute force
/*public class Fruitsell {
    public int totalFruit(int[] arr) {
        int n = arr.length;
        int maxfruit =0;
        
        for(int i=0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            int count=0;
            for(int j=i;j<n;j++){
                set.add(arr[j]);
                if(set.size()>2){
                    break;
                }
                count++;
            }
            maxfruit = Math.max(maxfruit,count);
        }
        return maxfruit;   
    }
}
*/    

    