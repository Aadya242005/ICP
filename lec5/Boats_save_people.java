package lec5;

import java.util.Arrays;

public class Boats_save_people {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people); 
        int i = 0, j = people.length - 1;
        int boats = 0;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;  
                j--;
            } else {
                j--;  
            }
            boats++; 
        }
        return boats;
    }

    public static void main(String[] args) {
        Boats_save_people sol = new Boats_save_people();
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        System.out.println(sol.numRescueBoats(people, limit)); 
    }
}
