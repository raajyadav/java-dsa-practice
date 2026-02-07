package flowControl;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: {
			System.out.println("Samosa");
			break;
		}
		case 2:{
			System.out.println("Mango");
			break;
		}
		case 3:{
			System.out.println("Burger");
			break;
		}
		default :{
			System.out.println("No thing is in the list");
		}
		}
	}
}
