package leetcode75;

public class IncreasingTripletSusequence334 {

	public static void main(String[] args) {
		IncreasingTripletSusequence334 i = new IncreasingTripletSusequence334();

		int[] nums = { 20, 100, 10, 12, 5, 13 };

		System.out.println(i.increasingTriplet1(nums));
	}

	// if consecutive three
	public boolean increasingTriplet(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] < nums[i + 1] && nums[i + 1] < nums[i + 2]) {
				return true;
			}
		}

		return false;
	}

	// any three increasing values
	public boolean increasingTriplet1(int[] nums) {
		if (nums == null || nums.length < 3) {
			return false;
		}
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;

		for (int num : nums) {
			if (num <= a) {
				a = num;
			} else if (num <= b) {
				b = num;
			} else {
				return true;
			}
		}

		return false;
	}
}
