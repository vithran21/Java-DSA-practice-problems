package arrays;

public class ArrayProblem2 {
	// Java Program to move all zeros to end using one traversal

	// Function which pushes all zeros to end of array
	static void pushZerosToEnd(int[] arr) {

		// Pointer to track the position for next non-zero element
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			// If the current element is non-zero
			if (arr[i] != 0) {

				// Swap the current element with the 0 at index 'count'
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;

				// Move 'count' pointer to the next position
				count++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
		pushZerosToEnd(arr);
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
//Solution 2

//class ArrayProblem2 {
//
// // Function which pushes all zeros to end of an array
// static void pushZerosToEnd(int[] arr) {
//     
//     // Count of non-zero elements
//     int count = 0;  
//
//     // If the element is non-zero, replace the element at
//     // index 'count' with this element and increment count
//     for (int i = 0; i < arr.length; i++) {
//    	 System.out.println("count "+count);
//         if (arr[i] != 0)
//             arr[count++] = arr[i];
//         
//         System.out.println(arr[i]);
//     }
//
//     // Now all non-zero elements have been shifted to
//     // the front. Make all elements 0 from count to end.
//     while (count < arr.length)
//         arr[count++] = 0;
// }
//
// public static void main(String[] args) {
//     int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
//     pushZerosToEnd(arr);
//     for (int num : arr) {
//         System.out.print(num + " ");
//     }
// }
//}