package leetcode75;

public class ReverseVowelsOfString345 {

	public static void main(String[] args) {

		ReverseVowelsOfString345 r = new ReverseVowelsOfString345();

		String s = "aeioupvUOIEA";

		System.out.println(r.reverseVowels(s));
	}

	public String reverseVowels(String s) {

		char[] c = s.toCharArray();

		int i = 0, j = c.length - 1;

		while (i < j) {
			System.out.println(i + " " + j);
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'A' || c[i] == 'E'
					|| c[i] == 'I' || c[i] == 'O' || c[i] == 'U') {
				System.out.println(c[i]);
				if (c[j] == 'a' || c[j] == 'e' || c[j] == 'i' || c[j] == 'o' || c[j] == 'u' || c[j] == 'A'
						|| c[j] == 'E' || c[j] == 'I' || c[j] == 'O' || c[j] == 'U') {
					System.out.println(c[j]);
					char t = c[i];
					c[i] = c[j];
					c[j] = t;
				} else {
					j--;
					continue;
				}

				i++;
				j--;

			} else {
				i++;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int j2 = 0; j2 < c.length; j2++) {
			sb.append(c[j2]);
		}

		return sb.toString();
	}

	boolean isVowel(char c) {
		// alternatively, we can just check
		// return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
		// c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public String reverseVowels1(String s) {
		// `l` is the left pointer to track the vowel character
		// `r` is the right pointer to track the vowel character
		int n = s.length(), l = 0, r = n - 1;
		char[] ca = s.toCharArray();
		while (l < r) {
			// find the index of the first vowel in the given range
			while (l < r && !isVowel(ca[l]))
				l++;
			// find the index of last vowel in the given range
			while (r > l && !isVowel(ca[r]))
				r--;
			// swap ca[l] and ca[r]
			{
				char tmp = ca[l];
				ca[l] = ca[r];
				ca[r] = tmp;
			}
			// since we've processed the character s[l],
			// we move the left pointer to the right
			l += 1;
			// since we've processed the character s[r],
			// we move the right pointer to the left
			r -= 1;
		}
		return new String(ca);
	}

}
