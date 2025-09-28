package lec2;
import java.util.*;
public class Sort_char {
    public static void main(String[] args) {
        String s = "tree";
        System.out.print(FrequencySort(s));
        
    }
    public static String FrequencySort(String s){
        StringBuilder sb = new StringBuilder();
        List<Character>[] arr = new ArrayList[s.length() +1];
        Map<Character, Integer>map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);

        }
        map.keySet().forEach(
            c ->{
                if(arr[map.get(c)]==null){
                    arr[map.get(c)]=new ArrayList();
                }
            
                arr[map.get(c)].add(c);
            }
        );
        for(int i=arr.length;i>0;i--){
            if(arr[i]==null){
                for(Character c : arr[i]){
                    for(int j=0;j<i;j++){
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
    
}
