package string;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s = "programming";
		String result = removeDuplicate( s);
		System.out.println(result);
	}

	public static String removeDuplicate(String s) {
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (result.indexOf(ch) == -1) {
				result = result + ch;
			}
		}
		return result;
	}
}
