package lec1;

public class Can_place_flower {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyPrev = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyNext = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                if (emptyPrev && emptyNext) {
                    flowerbed[i] = 1; // plant flower
                    n--;
                    if (n == 0) return true;
                }
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        Can_place_flower sol = new Can_place_flower();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        System.out.println(sol.canPlaceFlowers(flowerbed, n)); 
    }
}
