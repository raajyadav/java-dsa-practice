package string;

public class MaxRepString {
	public static void main(String[] args) {
		String str = "abbcccdddd@@@@@";
		char maxRepetedChar = maxRepetedChar(str);
		System.out.println("Maximum character is : "+maxRepetedChar);
	}

	public static char maxRepetedChar(String str) {
		
		int[] arr = new int[257];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}
		
		int max = -1;
		char c = ' ';
		
		for(int i = 0;i<str.length();i++) {
			if(max < arr[str.charAt(i)]) {
				max = arr[str.charAt(i)];
				c = str.charAt(i);
			}
		}
		return c;
		
		
	}
}
