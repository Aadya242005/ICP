package lec1;

public class FindTownJudge {

    public int findJudge(int n, int[][] trust) {
        int[] trustScore = new int[n + 1]; 

        for (int[] t : trust) {
            int a = t[0];
            int b = t[1];
            trustScore[a]--; 
            trustScore[b]++; 
        }

        for (int i = 1; i <= n; i++) {
            if (trustScore[i] == n - 1) {
                return i; 
            }
        }

        return -1; // no judge
    }

    
    public static void main(String[] args) {
        FindTownJudge sol = new FindTownJudge();
        int n = 3;
        int[][] trust = {{1, 3}, {2, 3}};
        System.out.println(sol.findJudge(n, trust)); 

        int n2 = 3;
        int[][] trust2 = {{1, 3}, {2, 3}, {3, 1}};
        System.out.println(sol.findJudge(n2, trust2)); 
    }
}
