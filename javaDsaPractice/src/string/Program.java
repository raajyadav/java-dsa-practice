package string;

public class Program {

// 	public static void printLetters(String str) {
//		for(int i=0;i<str.length();i++) {
//			System.out.print(str.charAt(i)+" ");
//		}
//		System.out.println();
//	}
//	
//	public static void main(String[] args) {
//		
//		//Length
////		String fullName = "Raj Yadav";
////		System.out.println(fullName.length());
//		
//		//Concatination
//		String firstName = "Raj";
//		String lastName = "Yadav";
//		String fullName = firstName + " "+ lastName;
////		System.out.println(fullName);
//		System.out.println(fullName.charAt(2));
//		
//		printLetters(fullName);
//		printLetters(firstName);
//		
//		
//	}
	
//	Q:1) Pallindrome
//	public static void main(String[] args) {
//		String str = "madam";
//		System.out.println(isPalindrome(str));
//	}
//	
//	public static boolean isPalindrome(String str) {
//		int n = str.length();
//		for(int i=0;i<str.length()/2;i++) {
//			if(str.charAt(i) != str.charAt(n-1-i))
//				return false;
//		}
//		return true;
//	}
	
	
	
//	Q:2) Given a route containing 4 direction (E,W,N,S) . find the shortest path to reach destinatio.
//    "WNEENESENNN"
	
//	public static void main(String[] args) {
//		
//		String path  = "WNEENESENNN";
//		float shortestPath = getShortestPath(path);
//		System.out.println(shortestPath);
//		
//	}
//	
//	public static float getShortestPath(String path) {
//		int x = 0; 
//		int y = 0;
//		
//		for(int i = 0; i<path.length();i++) {
//			char dir = path.charAt(i);
//			
//			//SOUTH
//			if(dir == 'S') {
//				 y--;
//			}
//			//NORTH
//			else if(dir == 'N') {
//				y++;
//			}
//			else if(dir == 'W') {
//				x--;
//			}
//			else {
//				x++;
//			}
//		}
//		int X2 = x*x;
//		int Y2 = y*y;
//		return (float) Math.sqrt(X2 + Y2);
//		
//		
//	}
	
//	Q:3) differece between == and equals 
//	public static void main(String[] args) {
//		
//		String s1 = "Ram";
//		String s2 = "Ram";
//		String s3 = new String("Ram");
//		
//		// == check reference not value
//		if(s1 == s2 ) {
//			System.out.println("Strings are equal");
//		}else {
//			System.out.println("Strings are not equal");
//		}
//		
//		if(s1 == s3) {
//			System.out.println("Strings are equal");
//		}else {
//			System.out.println("Strings are not equal");
//		}
//		
//		//equals check value not refference
//		if(s1.equals(s3)) {
//			System.out.println("Strings are equal");
//		}else{
//			System.out.println("Strings are equal");
//		}
//	}
	
//	Q:4) Substring
	
//	public static void main(String[] args) {
//		String str = "HelloWorld";
//		String substring = substring(str,0,5);
//		System.out.println(substring);//user defined
////		System.out.println(str.substring(0,5)); //predifined
//		
//	}
//	public static String substring(String str, int startIndex, int endIndex) {
//		String substr = "";
//		for(int i = startIndex ; i < endIndex;i++) {
//			substr += str.charAt(i);
//		}
//		return substr;
//	}

//	Q:5) Print largest String
//	public static void main(String[] args) {
//		String fruits[] = {"Apple","Banana","Orange"};
//		String largest = fruits[0];
//		for(int i = 0 ;i<fruits.length;i++) {
//			if(largest.compareToIgnoreCase(fruits[i])<0) {
//				largest = fruits[i];
//			}
//		}
//		System.out.println(largest);
//	}
}
