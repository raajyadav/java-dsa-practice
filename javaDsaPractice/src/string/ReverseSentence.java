package string;

public class ReverseSentence {

	public static void main(String[] args) {
		String str = "Hello Java";
		String reverse = reverse(str);
		System.out.println(reverse);
	}
	public static String reverse(String str) {
		String rev = "";
		for(int i = 0; i<str.length();i++) {
			rev = str.charAt(i) + rev;
		}
		return rev;
	}
}
