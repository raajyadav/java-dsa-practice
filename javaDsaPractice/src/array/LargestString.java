package array;

public class LargestString {

	public static void main(String[] args) {
		
		String[] str = {"Raj","Nitesh","Tauleshwar"};
		String big = str[0];
		
		for(String s: str) {
			if(s.length() > big.length() )
				big = s;
		}
		System.out.println(big);
	}
}
