package array;

public class PrintAndCountEvenString {

	public static void main(String[] args) {
		String[] str = {"Raj", "Nitesh", "Kishan"};
		int count = printAndCountEvenString(str);
		System.out.println("Total even String: "+count);
	}
	
	public static int printAndCountEvenString(String[] str) {
		int count = 0;
		for(String s :str) {
			if(s.length() % 2 == 0) {
				count++;
			System.out.println(s);
			}
		}
		return count;
	}
}
