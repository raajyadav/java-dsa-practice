package string;

public class LargestPalindromicSubstringLength {

	public static void main(String[] args) {
		String s = "cdabcbabb";
		System.out.println(getLargestPalindromicSubstringLenght(s));
	}
	public static int getLargestPalindromicSubstringLenght(String s) {
		int maxLen = 0;
		for(int i=0;i<s.length();i++) {
			int oddSize = expandAroundCentre(s,i,i);
			int evenSize = expandAroundCentre(s,i,i+1);
			
			int max = oddSize > evenSize?oddSize : evenSize;
			
			if(max > maxLen) {
				maxLen = max;
			}
	
		}
		return maxLen;
	
	}
	public static int expandAroundCentre(String s, int start , int end) {
		
		while(start >= 0 && end <s.length() && s.charAt(start) == s.charAt(end)) {
			
			start--;
			end++;
		}
		return end-start-1;
	}
}
