package leetcode75;

import java.util.Arrays;

public class ProductOfArrayExceptSelf238 {

	public static void main(String[] args) {
		ProductOfArrayExceptSelf238 p = new ProductOfArrayExceptSelf238();

		int[] nums = {-1,1,0,-3,3};
		
		System.out.println(Arrays.toString(p.productExceptSelf(nums)));

	}

	//brute force - two loops
	public int[] productExceptSelf(int[] nums) {

		int[] n = new int[nums.length];

		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(nums));

		for (int i = 0, j = 0; i < n.length; i++, j = 0) {
			n[i] = 1;
			System.out.println("if" + i);
			while (j < n.length) {
				System.out.println("while" + j);
				if (i == j) {
					j++;
					continue;
				}
				n[i] *= nums[j];
				j++;
			}
			System.out.println(n[i] + "  " + nums[i]);
		}

		return n;
	}
	
	//O(n) time complexity
	public int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}
