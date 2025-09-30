package lec4;
import java.util.*;
public class Longest_substr {
    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.print(Substr(s));
    }
    public static int Substr(String s){
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            int count=0;
            HashSet<Character> set = new HashSet<>();
            for(int j=i;j<s.length();j++){
                Character str= s.charAt(j);
                if(set.contains(str)){
                    break;
                }
                set.add(str);
                count++;  
            }
            if(count>maxlen){
                maxlen = count;
            }
        }
        return maxlen;
    }
}
