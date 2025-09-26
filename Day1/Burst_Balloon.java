package lec1;
import java.util.Arrays;
import java.util.Comparator;

public class Burst_Balloon {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

       
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

        int count = 1; 
        int prevEnd = points[0][1]; 

        for (int i = 1; i < points.length; i++) {
            int currStart = points[i][0];

  
            if (currStart > prevEnd) {
                count++;
                prevEnd = points[i][1];
            }
    
        }

        return count;
    }

    public static void main(String[] args) {
        Burst_Balloon solver = new Burst_Balloon();
        int[][] points = {
            {10, 16},
            {2, 8},
            {1, 6},
            {7, 12}
        };
        int result = solver.findMinArrowShots(points);
        System.out.println("Minimum number of arrows needed: " + result);
    }
}
