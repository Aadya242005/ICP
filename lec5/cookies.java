package lec5;
public class cookies{
    public static void main (String[] args){
        int[] g = {1,2};
        int[] s = {1,2,3};
        System.out.print(Cookies(g,s));

    }
    public static int Cookies(int[]g, int[]s){
        int i =0;
        int j =0;
        int count=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                count++;
                j++;
                i++;
            }else{
                j++;
            }
        }
        return count;
    }
}