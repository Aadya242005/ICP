package lec4;

import java.util.*;

public class Permutation_in_str {
    public static void main(String[] args) {
        String s1 ="ab";
        String s2 = "eidbaoo"; 
        System.out.print(Permutation(s1,s2));
    }
    public static boolean Permutation(String s1, String s2){
         int m = s1.length();
        for(int i=0;i<=s2.length()-m;i++){
            String str = s2.substring(i,i+m);
            if(ispermutation(s1,str)){
                return true;
            }
        }
        return false;
    }
    public static boolean ispermutation(String s1, String s2){
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
                      
    }
    
}
