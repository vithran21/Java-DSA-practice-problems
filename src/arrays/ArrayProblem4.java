package arrays;

import java.util.Arrays;

public class ArrayProblem4 {

	static void rotateArr(int arr[], int d) {
		int n = arr.length;
		d = d % n; // Handle cases where d > n

		// Step 1: Reverse first d elements
		reverse(arr, 0, d - 1);
		// Step 2: Reverse remaining elements
		reverse(arr, d, n - 1);
		// Step 3: Reverse the whole array
		reverse(arr, 0, n - 1);
	}

	static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		rotateArr(arr, 3);
		System.out.println(Arrays.toString(arr));
	}

}
