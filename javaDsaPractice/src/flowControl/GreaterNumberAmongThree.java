package flowControl;

public class GreaterNumberAmongThree {
	

	public static void main(String[] args) {
//		WAJP to print all are equal if all have	same value or print biggest of three numbers using if else statement.
		
		int a = 10;
		int b = 300;
		int c = 200;
		
		if(a == b && a == c) {
			System.out.println("All value are same");
		}else if(a>b && a>c) {
			System.out.println(a+" is biggest");
		}else if(b>c) {
			System.out.println(b+" is biggest");
		}else
			System.out.println(c+" is is biggest");
	}

}
