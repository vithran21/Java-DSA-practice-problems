package arrays;

public class ArrayProblem5 {

	void nextPermutation(int[] arr) {
		int l = arr.length;

		int pivot = -1;

		for (int i = 0; i < l - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				pivot = i;
			}
		}

		if (pivot == -1) {
			for (int i = 0; i < l / 2; i++) {
				int temp = arr[i];
				arr[i] = arr[l - i - 1];
				arr[l - i - 1] = temp;
			}
		} else {

			for (int i = l - 1; i > pivot; i--) {
				if (arr[i] > arr[pivot]) {
					int temp = arr[i];
					arr[i] = arr[pivot];
					arr[pivot] = temp;
					break;
				}
			}

			for (int i = pivot + 1, j = l - 1; i < j; i++, j--) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		}
	}

	public static void main(String[] args) {
//		int arr[] = { 2, 4, 1, 7, 5, 0 };
		int ar[] = { 3, 4, 2, 5, 1 };
		ArrayProblem5 p = new ArrayProblem5();
		p.nextPermutation(ar);

	}

}
