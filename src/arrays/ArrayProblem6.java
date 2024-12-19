package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArrayProblem6 {

	public List<Integer> findMajority1(int[] nums) {
		List<Integer> li = new ArrayList<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
		int lim;
		if (li.size() > 2) {
			lim = li.size() / 3;
		} else {
			return li;
		}
		Set<Integer> s = new TreeSet<Integer>(li);

		for (Iterator<Integer> iterator = s.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if (Collections.frequency(li, integer) < lim) {
				iterator.remove();
			}
		}

		if (li.size() != s.size() && (!s.isEmpty())) {
			li.clear();
			li.addAll(s);
			return li;
		}
		li.clear();
		return li;
	}

	public List<Integer> findMajority(int[] arr) {

		int n = arr.length;
		HashMap<Integer, Integer> freq = new HashMap<>();
		List<Integer> res = new ArrayList<>();

		// find frequency of each number
		for (int ele : arr)
			freq.put(ele, freq.getOrDefault(ele, 0) + 1);

		// Iterate over each key-value pair in the hash map
		for (Map.Entry<Integer, Integer> it : freq.entrySet()) {
			int ele = it.getKey();
			int cnt = it.getValue();

			// Add the element to the result, if its frequency
			// is greater than floor(n/3)
			if (cnt > n / 3)
				res.add(ele);
		}

		if (res.size() == 2 && res.get(0) > res.get(1)) {
			int temp = res.get(0);
			res.set(0, res.get(1));
			res.set(1, temp);
		}
		return res;

	}

	public static void main(String[] args) {
		ArrayProblem6 arrayProblem6 = new ArrayProblem6();
//		int arr[] = { 2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6, 8, 8, 8, 8, 9, 9, 9, 9 };
//		int arr[] = { 1, 2, 3, 4 };
		int arr[] = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6};
		List<Integer> li = arrayProblem6.findMajority(arr);
		System.out.println(li);
	}
}
