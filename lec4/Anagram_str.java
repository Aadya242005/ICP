package lec4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram_str {
    String s = "cbaebabacd";
    String p = "abc";

    public static void main(String[] args) {
        
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        if (n < m) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

       
        for (int i = 0; i < m; i++) {
            char c = p.charAt(i);
            pCount[c - 'a']++;
        }

   
        for (int i = 0; i < n; i++) {
         
            char c = s.charAt(i);
            sCount[c - 'a']++;

   
            if (i >= m) {
                char out = s.charAt(i - m);
                sCount[out - 'a']--;
            }

            // compare arrays
            if (Arrays.equals(sCount, pCount)) {
                result.add(i - m + 1);
            }
        }

        return result;
    }
    
}
