package flowControl;
import java.util.Scanner;
public class AlphabetCheck2 {
	
	public static void main(String[] args) {
//		WAJP to take a character input and print it is upper case, lower case or other alphabet using if else statement.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch =sc.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println(ch+" is Uppercase");
		}else if(ch >= 'a' && ch <= 'z' ) {
			System.out.println(ch+" is lowercase");
		}else if (ch > '0' && ch <= '9'){
			System.out.println(ch+" is Digit");
		}else
			System.out.println(ch+" is Special Character");
	}

}
