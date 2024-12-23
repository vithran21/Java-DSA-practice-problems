package leetcode75;

import java.util.Arrays;

public class CanPlaceFlowers605 {

	public static void main(String[] args) {

		CanPlaceFlowers605 c = new CanPlaceFlowers605();

		int[] fb = { 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0};
		int n = 2;

		System.out.println(c.canPlaceFlowers(fb, n));
		System.out.println(Arrays.toString(fb));
	}

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
