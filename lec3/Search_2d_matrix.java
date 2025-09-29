package lec3;

public class Search_2d_matrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int target = 3;

        System.out.println(search(arr, target));
    }

    public static boolean search(int[][] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false; 
    }
}
