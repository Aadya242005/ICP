package lec2;
import java.util.*;

public class Merge_interval {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(arr);
        System.out.println(Arrays.deepToString(result));  // ✅ Pretty print
    }

    public static int[][] merge(int[][] arr){
        if (arr.length <= 1) {
            return arr;
        }

        Arrays.sort(arr, Comparator.comparingInt(i -> i[0]));
        List<int[]> result = new ArrayList<>();

        int[] newInterval = arr[0];
        result.add(newInterval);

        for (int[] interval : arr) {
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
