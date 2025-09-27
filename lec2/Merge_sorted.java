package lec2;

public class Merge_sorted {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int m = 3;  
        int n = 3;  

        int i = m - 1;       
        int j = n - 1;       
        int k = m + n - 1;   

        while (i >= 0 && j >= 0) {
            if (arr1[i] < arr2[j]) {
                arr1[k] = arr2[j];
                j--;
            } else {
                arr1[k] = arr1[i];
                i--;
            }
            k--;
        }

        while (j >= 0) {
            arr1[k] = arr2[j];
            j--;
            k--;
        }


        for (int val=0;val<arr1.length;val++) {
            System.out.print(val + " ");
        }
    }
}
