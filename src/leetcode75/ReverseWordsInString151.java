package leetcode75;

public class ReverseWordsInString151 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ReverseWordsInString151 r = new ReverseWordsInString151();

		String s1 = "the sky is blue";
		String s2 = "  hello world  ";
		String s3 = "a good   example";
		System.out.println(r.reverseWords(s3));
	}

	public String reverseWords(String s) {
		String[] str = s.trim().split("\\s+");

		StringBuilder sb = new StringBuilder();

		for (int i = str.length - 1; i > 0; i--) {
			sb.append(str[i].trim() + " ");
		}

		return sb.toString() + str[0];

	}
}
