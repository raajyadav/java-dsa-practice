package string;

public class LargestPalindromicSubstring {
	
	public static void main(String[] args) {
		String s = "cdabcbabb";
		System.out.println(getLargestPalindromicSubstringLenght(s));
	}
	public static String getLargestPalindromicSubstringLenght(String s) {
		int maxLen = 0, start = 0, end =0;
		for(int i=0;i<s.length();i++) {
			int oddSize = expandAroundCentre(s,i,i);
			int evenSize = expandAroundCentre(s,i,i+1);
			
			int max = oddSize > evenSize?oddSize : evenSize;
			
			if(max > maxLen) {
				maxLen = max;
			    start = i-(max-1)/2;
			    end = i + max/2;	
			}
	
		}
//		return maxLen;
		return s.substring(start,end+1);
	}
	public static int expandAroundCentre(String s, int start , int end) {
		
		while(start >= 0 && end <s.length() && s.charAt(start) == s.charAt(end)) {
			
			start--;
			end++;
		}
		return end-start-1;
	}
}
