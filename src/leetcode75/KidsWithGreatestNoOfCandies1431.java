package leetcode75;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNoOfCandies1431 {

	public static void main(String[] args) {
		KidsWithGreatestNoOfCandies1431 k = new KidsWithGreatestNoOfCandies1431();

		int[] candies = { 4, 2, 1, 1, 2 };
		int extraCandies = 1;

		System.out.println(k.kidsWithCandies(candies, extraCandies));

	}

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = 0;
		List<Boolean> b = new ArrayList<Boolean>();
		for (int i = 0; i < candies.length; i++) {
			if (max < candies[i])
				max = candies[i];
		}

		System.out.println(max);

		for (int i = 0; i < candies.length; i++) {
			b.add(i, candies[i] + extraCandies >= max);
		}

		return b;
	}

}
