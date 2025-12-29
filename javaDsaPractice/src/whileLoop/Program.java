package whileLoop;

import java.util.Scanner;

//1) Write a java program to take a user input and print each digits of the number one by one from right to left.
//public class Program {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		int n = sc.nextInt();
//		
//		while(n>0) {
//			int rem = n%10;
//			System.out.println(rem);
//		n=n/10;	
//		}
//	}
//	
//}

//2) Write a java program to take a user input and print each even digits of the number one by one.

//public class Program{
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		int n = sc.nextInt();
//		
//		while(n>0) {
//			int rem = n % 10;
//			  if(rem % 2 == 0) 
//				  System.out.println(rem);
//		 n=n/10;	
//		}
//	}
//}

//3) Write a java program to take a user input and print each odd digits of the number one by one.
//public class Program{
//
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter number");
//	int n = sc.nextInt();
//	
//	while(n>0) {
//		int rem = n % 10;
//		  if(rem % 2 == 1) 
//			  System.out.println(rem);
//	 n=n/10;	
//	}
//}
//}

//4) Write a java program to take a user input and print each digits of the number which are greater than or equals to 5 one by one.
//public class Program{
//
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter number");
//	int n = sc.nextInt();
//	
//	while(n>0) {
//		int rem = n % 10;
//		if(rem>=5)
//			System.out.println(rem);
//		n=n/10;
//	}
//   }
//}

//5)Write a java program to take a user input and print the biggest digit of the number.
//public class Program{
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		int n = sc.nextInt();
//		
//		int biggest = 0;
//		
//		while(n>0) {
//			int rem = n % 10;
//			if(rem > biggest)
//				biggest = rem;
//		n=n/10;		
//		}
//		System.out.println("Biggest Number is: "+biggest);
//	}
//}

//6) Write a java program to take a user input and print the difference of biggest digit and smallest digit of the number. 
//  public class Program{
//	  
//	  public static void main(String[] args) {
//		  Scanner sc = new Scanner(System.in);
//			System.out.println("Enter number");
//			int n = sc.nextInt();
//			int diff = getDifference(n);
//			System.out.println(diff);
//	  }			
//			
//	  
//	  public static int getDifference(int n) {
//			
//			int big = n % 10 ;
//			int small = n % 10;
//			while(n>0) {
//				int rem = n % 10;
//				if(rem > big)
//					big = rem;
//				if(rem < small)
//					small = rem;
//			n=n/10;		
//			}
//		   return big - small;
//			
//	}
//	  
//  }	  

//7) Write a java program to take a user input and count the total digit of the number.
//public class Program{
//
//public static void main(String[] args) {
//	  Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		int n = sc.nextInt();
//		int count = getCount(n);
//		System.out.println(count);
//}			
//		
//
//public static int getCount(int n) {
//     int count = 0;
//	while(n>0) {
//			int rem = n % 10;
//            count++;
//		n=n/10;		
//		}
//	   return count;
//		
//}
//
//}

//8) Write a java program to take a user input and print each digit of the number from left to right.
//public class Program{
//
//public static void main(String[] args) {
//	  Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		int n = sc.nextInt();
//		int count = getCount(n);
//		System.out.println(count);
//}			
//		
//
//
//		
//}
//
//}

//10) Write a java program to take a user input and print each digit of the number from left to right(Without using any inbuilt features)
//public class Program{
//
//public static void main(String[] args) {
//	  Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		int n = sc.nextInt();
//		int count = getZeroDigit(n);
//		System.out.println(count);
//}			
//		
//
//public static int getZeroDigit(int n) {
//   int count = 0;
//	while(n>0) {
//			int rem = n % 10;
//             if(rem == 0) 
//            	 count++;
//		n=n/10;		
//		}
//	   return count;
//		
//}
//
//}

//11) Write a java program to take a user input and count how many 3 has appeared in the number
//public class Program{
//
//    public static void main(String[] args) {
//	  Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		int n = sc.nextInt();
//		int count = getThree(n);
//		System.out.println(count);
//   }			
//		
//
//     public static int getThree(int n) {
//         int count = 0;
//	     while(n>0) {
//			  int rem = n % 10;
//              if(rem == 3) 
//            	 count++;
//		n=n/10;		
//		}
//	   return count;
//		
//    }
//
//}

//12) Write a java program to take a user input and count the even digits of the number.
//public class Program{
//
//    public static void main(String[] args) {
//	  Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		int n = sc.nextInt();
//		int count = getEvenNumber(n);
//		System.out.println(count);
//   }			
//		
//
//     public static int getEvenNumber(int n) {
//         int count = 0;
//	     while(n>0) {
//			  int rem = n % 10;
//              if(rem % 2 == 0) 
//            	 count++;
//		n=n/10;		
//		}
//	   return count;
//		
//    }
//
//}

//12) Write a java program to take a user input and count the even digits of the number.
//public class Program{
//
//  public static void main(String[] args) {
//	  Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		int n = sc.nextInt();
//		int count = getOddNumber(n);
//		System.out.println(count);
// }			
//		
//
//   public static int getOddNumber(int n) {
//       int count = 0;
//	     while(n>0) {
//			  int rem = n % 10;
//            if(rem % 2 == 1) 
//          	 count++;
//		n=n/10;		
//		}
//	   return count;
//		
//  }
//
//}

//13) Write a java program to take a user input and count the odd digits of the number.
//
//public class Program{
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//		int count = getOddDigit(n);
//		System.out.println("Odd Digit is: "+count);
//	}
//		
//		public static int getOddDigit(int n) {
//			int count = 0;
//		
//			while(n > 0) {
//				int rem = n % 10;
//				if(rem % 2 == 1) 
//					count++;
//				n/=10;	
//				}
//				return count;
//			}
//		
//	
//}

//14)Write a java program to take a user input and count all the digits of the number which are less than or equals to 5.
//  public class Program{
//	  
//	  public static void main(String[] args) {
//		  Scanner sc = new Scanner(System.in);
//		  System.out.println("Enter the Number");
//		  int n = sc.nextInt();
//		  int count = getDigit(n);
//		  System.out.println(count);
//		
//	}
//	  
//	  public static int getDigit(int n) {
//		  int count = 0;
//		  while(n>0) {
//			  int rem = n % 10;
//			  if(rem <= 5)
//				  count++;
//			 n/=10; 
//		  }
//		  return count;
//	  }
//  }

//15) Write a java program to take a user input and print the sum of each digit of the number
//  public class Program{
//	  
//	  public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Number:");
//		int n = sc.nextInt();
//		
//		int sum = getSum(n);
//		System.out.println("Sum of all digit is : "+sum);
//	}
//	  
//	  public static int getSum(int n) {
//		  int sum = 0;
//		  while(n > 0) {
//			  int rem = n % 10;
//			  sum = sum + rem;
//			n/=10;  
//		  }
//		  return sum;
//	  }
//  }

//16) Write a java program to take a user input and print the sum of each even digits of the number.
//public class Program{
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//		
//		int sum = getEvenNumberSum(n);
//		System.out.println("Even number sum is: "+sum);
//	}
//	
//	public static int getEvenNumberSum(int n) {
//		 int sum = 0;
//		 while(n > 0) {
//			 int rem = n % 10;
//			 if(rem % 2 == 0)
//				 sum = sum + rem;
//			n/=10; 
//		 }
//		 return sum;
//	}
//}

//17) Write a java program to take a user input and print the sum of each odd digits of the number.
// public class Program{
//	 
//	 public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//		
//		int sum = getOddNumberSum(n);
//		System.out.println("Sum of Odd Number is : "+sum);
//	}
//	 
//	 public static int getOddNumberSum(int n) {
//		  int sum = 0;
//		  while(n > 0) {
//			  int rem = n % 10;
//			  if(rem % 2 == 1)
//				  sum+=rem;
//			n/=10;  
//		  }
//		 return sum; 
//	 }
// }
 
// 18) Write a java program to take a user input and print the sum of each digits of the number which are less than or equals to

// public class Program{
//	
//	 	 public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the number");
//			int n = sc.nextInt();
//			
//		int sum = getSum(n);
//		System.out.println(sum);
//		}
//	 
//	 public static int getSum(int n) {
//		  int sum = 0;
//		  while(n > 0) {
//			  int rem = n % 10;
//			  if(rem <= 5)
//				  sum+=rem;
//			n/=10; 
//		  }
//		  return sum;
//	 }
// }

//19) Write a java program to take a user input and print the product of each digit of the number will be even or Odd.
//  public class Program{
//	  
//	  public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//		printDigit(n);
//	}
//	  
//	  public static void printDigit(int n) {
//		 int product = 1;
//		 while(n > 0) {
//			 int rem = n % 10;
//			 product=product*rem;
//		n/=10;	 
//		 }
//		 if(product % 2 == 0) {
//			 System.out.println("It will give Even Product");
//		 }else {
//			 System.out.println("It will give Odd Product");
//		 }
//		 
//	  }
//  }

//20) 

//21) Design a method which will accept a number and will return true if all the digits of the number is in increasing order.

//public class Program{
//	
//	public static void main(String[] args) {
//		  Scanner sc = new Scanner(System.in);
//			System.out.println("Enter number");
//			int n = sc.nextInt();
//			if(isIncreasingDigit(n))
//				System.out.println("Digit is Increasing Order");
//			else
//				System.out.println("Digit is Not in Increasing order");
//		
//	}
//	
//	public static boolean isIncreasingDigit(int n) {
//		int prev = n%10;
//		n/=10;
//		
//		while(n>0) {
//			int next = n%10;
//			if(next > prev)
//				return false;
//			prev = next;
//		n/=10;	
//		}
//		return true;
//	}
//}

//22) Design a method which will accept a number and will return true if all the digits of the number is in decreasing
//public class Program{
//	
//	public static void main(String[] args) {
//		  Scanner sc = new Scanner(System.in);
//			System.out.println("Enter number");
//			int n = sc.nextInt();
//			if(isIncreasingDigit(n))
//				System.out.println("Digit is Decreasing Order");
//			else
//				System.out.println("Digit is Not in Decreasing order");
//		
//	}
//	
//	public static boolean isIncreasingDigit(int n) {
//		int prev = n%10;
//		n/=10;
//		
//		while(n>0) {
//			int next = n%10;
//			if(next < prev)
//				return false;
//			prev = next;
//		n/=10;	
//		}
//		return true;
//	}
//}

//23)Design a method which will accept a number and will return true if it has different adjacent digits.
//public class Program{
//	
//	public static void main(String[] args) {
//		  Scanner sc = new Scanner(System.in);
//			System.out.println("Enter number");
//			int n = sc.nextInt();
//			if(isIncreasingDigit(n))
//				System.out.println("Digit has different adjacent digit");
//			else
//				System.out.println("Digit has not different adjacent digit");
//		
//	}
//	
//	public static boolean isIncreasingDigit(int n) {
//		int prev = n%10;
//		n/=10;
//		
//		while(n>0) {
//			int next = n%10;
//			if(next == prev)
//				return false;
//			prev = next;
//		n/=10;	
//		}
//		return true;
//	}
//}

//24) Add digit

//public class Program {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		int n = sc.nextInt();
//           int sum = addDigit(234);
//           System.out.println(sum);
//	}
//
//	
//	public static int addDigit(int n) {
//		while(n>9) {
//			 int sum = 0;
//			 while(n>0) {
//				 sum = sum + n%10;
//				 n/=10;
//			 }
//			 n = sum;
//		}
//		return n;
//	}
//}

//Q8) Write a java program to take a user input and print each digit of the number from left to right.
//public class Program1 {
//	
//	//Inbuild Method
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		int n = sc.nextInt();
//		 printDigitFromLeftToRight(n);
//	
//
//	}
//	
//	public static void printDigitFromLeftToRight(int n) {
//		    int count = (n+"").length();
//		    
//		    while(count > 0) {
//		    	int digit = (n/ (int)Math.pow(10, count-1)) % 10;
//		    	System.out.println(digit);
//		    	count--;
//		    }
//		    
//	}
//}

//public class Program {
//	
//	//User defined Method
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		int n = sc.nextInt();
//		 printDigitFromLeftToRight(n);
//	
//
//	}
//	
//	
//	
//	public static void printDigitFromLeftToRight(int n) {
//	
//		    
//	}
//}

//26) Write a java program to take a user input and print the factorial of each digits of the number.

//public class Program{
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any number: ");
//		int n = sc.nextInt();
//		
//		printFactorialOfEachDigit( n);
//		
//	}
//	
//	public static void printFactorialOfEachDigit(int n) {
//		
//	   int product = 1;	
//	   int fact = 1;
//	   int i = 1;
//	   while(n > 0) {
//		   int rem = n % 10;
//		     while(rem >= i) {
//		    	  fact = fact * i;
//		    	  i++;
//		     }
//		   System.out.println(rem+"! = "+fact);
//	
//		n/=10;
//	   }
//	   
//	}
//}


//Q) Write a java program to print LCM 

//public class Program{
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 1st number");	
//		int n1 = sc.nextInt();
//		System.out.println("Enter 2nd number");
//		int n2 = sc.nextInt();
//		System.out.println("Enter 3rd number");
//		int n3 = sc.nextInt();
//		int lcm = getLCM(n1,n2,n3);
//		System.out.println(lcm);
//	}
//	
//	public static int getLCM(int a, int b, int c) {
//		int big = (a>b && a>c)?a:(b>c?b:c);
//		for(int i = big; ;i+=big) {
//			if(i%a == 0 && i % b == 0 && i%c == 0)
//				return i;
//		}
//	}
//	
//}

//Q) Write a java program to print HCF 

public class Program{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");	
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int n2 = sc.nextInt();
		System.out.println("Enter 3rd number");
		int n3 = sc.nextInt();
		int hcf = getHCF(n1,n2,n3);
		System.out.println(hcf);
	}
	
	public static int getHCF(int a, int b, int c) {
		int small = (a<b && a<c)?a:(b<c?b:c);
		for(int i = small; ;i--) {
			if(a%i == 0 && b % i == 0 && c%i == 0)
				return i;
		}
	}
	
}
