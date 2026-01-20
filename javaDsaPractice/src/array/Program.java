package array;

import java.util.Arrays;

//SWAP ALL ARRAY
//public static void main(String[] args) {
//	
//	int[] arr = {1,2,3,4};
//	
//	int start = 0;
//	int end = arr.length-1;
//	while(start < end) {
//		int temp = arr[start];
//		arr[start] = arr[end];
//		arr[end] = temp;
//	  start++;
//	  end--;
//	}
//	for(int n : arr) {
//		System.out.print(n+" ");
//	}
//}

//1.Access all even index elements from array.
public class Program {

//	public static void main(String[] args) {
//			
//		int[] a = {1,2,3,4,5,6};
//		
//		System.out.println("All even index elements are:");
//		
//		for(int i = 0; i < a.length;i++) {
//			if(i % 2 == 0) {
//				System.out.println(a[i]);
//			}
//				
//		}
//		
//		
//	}

//	2. Access all even elements from array.
//	public static void main(String[] args) {
//		
//		int[] a = {2,3,4,5,6,7,8};
//		
//		System.out.println("All even elements are:");
//		
////		for(int value : a) {
////			if(value % 2 == 0)
////				System.out.println(value);
////		}
//		
//		for(int i =0; i< a.length;i++) {
//			if(a[i] % 2 == 0)
//				System.out.println(a[i]);
//		}
//	}

//	3. count all even elements from array.
//	public static void main(String[] args) {
//		
//		int[] a = {12,33,22,55,33,55,30,28};
//		
//		int count = 0;
//		
//		System.out.print("Count of all even element: ");
//		
//		for(int i = 0; i < a.length; i++) {
//			if(a[i] % 2 ==0) 
//				count++;
//		}
//		System.out.println(count);
//	}

//	4. Access all elements of array from end.
//	
//	public static void main(String[] args) {
//		
//		int[] arr = {22,33,44,55,66};
//		
//		for(int i = arr.length-1 ; i >=0; i--) {
//		System.out.print(arr[i] +" ");
//		}
//	}

//	5. print and count all three-digit numbers from array.
//	public static void main(String[] args) {
//		
//		int[] arr = {11,22,338,332,23,22,444,533};
//		int count = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] < 999 && arr[i] > 99) {
//				count++;
//				System.out.print(arr[i] +" ");
//			}
//		
//		}
//		System.out.println();
//		System.out.println("Total number of three-digit are : "+count);
//		
//	}

//	6. Print sum of all elements from array.
//	public static void main(String[] args) {
//		
//		int[] arr = {10,20,30,40,50,50};
//		
//		int sum = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			sum = sum + arr[i];
//		}
//		System.out.println("Sum of array : "+sum);
//	}

//	7. Print Average of all elements from array.
//	public static void main(String[] args) {
//		
//		int[] arr = {10,20,30,40,50,60};
//		
//		int sum =0;
//		int avg = 0;
//		int count = 0;;
//		
//		for(int i = 0; i < arr.length; i++) {
//		  sum = sum + arr[i];
//		  count++;
//		}
//	    avg = sum/count;
//	    System.out.println(avg);
//	}

//	8. WAJP to print and count all the elements of array which are bigger than average value.
//	public static void main(String[] args) {
//		
//		int[] arr = {10,20,25,30,40,50,60};
//		
//		int sum = 0;
//		int count = 0;
//		int avg = 0;
//		
//		for(int i = 0; i< arr.length;i++) {
//			sum = sum + arr[i];
//		}
//		avg = sum/arr.length;
//		
//		for(int i =0; i<arr.length;i++) {
//			if(arr[i] > avg ) {
//				count++;
//				System.out.println(arr[i]);
//			}
//			
//		}
//		System.out.println("Total Count of element of array which is bigger than average value are : "+count);
//		
//
//	}

//	9. Print sum of all even elements from array.
//	public static void main(String[] args) {
//		
//		int[] arr = {10,15,20,25,30,2};
//		int sum = 0;
//		
//		for(int i = 0; i < arr.length;i++) {
//			if(arr[i] % 2 == 0)
//				sum = sum + arr[i];
//		}
//		System.out.println("Sum of All even number: "+sum);
//	}

//	10. Print sum of all odd elements from array.
//	public static void main(String[] args) {
//
//       int[] arr = {5,10,15,20,25};
//       int sum = 0;
//       
//       for(int i = 0; i < arr.length;i++ ) {
//    	   if(arr[i] % 2 == 1)
//    		   sum = sum + arr[i];
//       }
//       System.out.println("Sum of all odd element is : "+sum);
//       
//	}

//	1) WAJP to swap two arrays.
//	public static void main(String[] args) {
//		int[] a = {10,20,30,40};
//		int[] b = {50,60,70,80};
//		
//		
//		int[] temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.print("Element in array a are: ");
//		for(int n : a)
//			System.out.print(n+" ");
//		System.out.println();
//		System.out.print("Elements in array b are: ");
//		for(int n : b)
//			System.out.print(n+" ");
//	}

//	3) For the given array of Strings, print the length of all the Strings.
//	public static void main(String[] args) {
//		
//		String[] str = {"Raj", "Roshan","Kishan"};
//		
//		for(String a : str) {
//			System.out.println(a+" length is : "+a.length());
//		}
//		
//	}

//	4) For the given array of Strings, print the largest string.
//	public static void main(String[] args) {
//		
//		String[] str = {"Raj","Roshan", "Tauleshwar"};
//		String big = str[0];
//		for(String s : str) {
//		  if(s.length() > big.length())
//			  big = s;
//		}
//		System.out.println(big);
//	}

//	5) For the given array of Strings, print and count all the Strings which has even number of characters.
//	public static void main(String[] args) {
//		
//		String[] str = {"Raj", "Ramesh", "Tauleshwar", "Nik","Ravi"};
//		
//		int count = 0;
//		
//		for(String s : str) {
//			if(s.length() % 2 == 0) {
//				count++;
//				System.out.println(s);
//			}		
//		}
//		System.out.println("Total String which have even number : "+count);
//	}

//	6) WAJP for below requirements Sum except itself:
//	----------------------------
//	|  2  | 5  |  4  |  3 |  6 |
//	============================
//  | 18  | 15 |  16 | 17 | 14 |
//  ----------------------------
//	public static void main(String[] args) {
//		
//		int[] arr = {2,5,4,3,6};
//		
//		for(int n: arr) {
//			System.out.print(n+" ");
//		}
//		
//		int sum = 0;
//		for(int n: arr)
//			sum = sum + n;
//		
//		for(int i = 0; i< arr.length;i++) 
//			arr[i] = sum - arr[i];
//		
//		System.out.println();
//		
//		for(int n: arr) {
//			System.out.print(n+" ");
//		}
//	}

//Q:10) WAJP for below requirements:
//---------------------------------------------------------------
//      Original array:    |  2   |  5   |  4   |   3   |   6  |
//      ---------------------------------------------------------
//      resultant array:   |  360 |  144 |  180 |   240 |  120 |
//      ---------------------------------------------------------

//     public static void main(String[] args) {
//		
//    	 int[] arr = {2,5,4,3,6};
//    	 
//    	 for(int n: arr) {
//    		 System.out.print(n+" ");
//    	 }
//    	 
//    	 int product = 1;
//    
//    	 for(int n: arr) {
//    		 product = product * n;
//    	 }
//    	 
//    	 for(int i=0;i<arr.length;i++) {
//    		 arr[i] = product /arr[i];
//    	 }
//    	 
//    	 System.out.println();
//    	 for(int n : arr) {
//    		 System.err.print(n+" ");
//    	 }
//	}

//	Q:13) Max consecutive 1 in any array
//	------------------------------------------
//	| 6 | 1 | 1 | 1 | 7 | 7 | 1 | 1 | 1 | 1 |
//   ------------------------------------------
//   o/p: 4

//	public static void main(String[] args) {
//		
//		int[]  arr = {6,1,1,1,7,7,1,1,1,1,};
//		
//		int tempCount = 0 ;
//	    int finalCount = 0;
//	    
//	    for(int n: arr) {
//	    	if(n == 1)
//	    		tempCount++;
//	    	else {
//	    		if(tempCount > finalCount)
//	    			finalCount = tempCount;
//	    	tempCount = 0;	
//	    	}
//	    }
//	    if(tempCount > finalCount)
//	    	finalCount = tempCount;
//	    System.out.println(finalCount);
//		
//	}

//	Q:14) Max consecutive n in any array
//	------------------------------------------
//	| 6 | 1 | 1 | 1 | 7 | 7 | 1 | 7 | 1 | 1 |
//   ------------------------------------------
//	i/p : 7
//   o/p: 2

//	public static void main(String[] args) {
//		
//		int[] arr = {6,1,1,1,7,7,1,7,1,1};	
//		
//		int tempCount = 0; 
//		int maxCount = 0;
//		
//		for(int n : arr) {
//			if(n == 7)
//				tempCount++;
//			else {
//				if(tempCount > maxCount)
//					maxCount = tempCount;
//				tempCount = 0;
//			}
//		}
//		if(tempCount > maxCount)
//			maxCount = tempCount;
//		System.out.println(maxCount);
//	}
//	
//	Q:15) WAJP to swap two index values of the array.
//	---------------------------------------------------
//	Original array: 10 | 20 | 30 | 40 | 50 | 60 | 70 |
//	---------------------------------------------------
//	Swapped array:	10 | 60 | 30 | 40 | 50 | 20 | 70 |
//	---------------------------------------------------

//	public static void main(String[] args) {
//
//		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
//
//		System.out.print("Original Array: ");
//		for (int n : arr) {
//			System.out.print(n + " ");
//		}
//
//		int temp = arr[1];
//		arr[1] = arr[5];
//		arr[5] = temp;
//
//		System.out.println();
//		System.err.print("Swapped Array : ");
//		for (int n : arr) {
//			System.out.print(n + " ");
//		}
//	}

//	Q:16) WAJP to reverse each element of the array.
//	--------------------------------------------------
//	Original array: 10 | 20 | 30 | 40 | 50 | 60 | 70 |
//    --------------------------------------------------
//	Reversed array: 70 | 60 | 50 | 40 | 30 | 20 | 10 |
//	---------------------------------------------------

//	public static void main(String[] args) {
//	
//		int[] arr = {10,20,30,40,50,60,70};
//		
//		System.out.print("Original array: ");
//		for (int n : arr) {
//			System.out.print(n + " ");
//		}
//		
//		int start = 0;
//		int end = arr.length - 1;
//		
//		while(start < end) {
//			
//			int temp = arr[start];
//			 arr[start] = arr[end];
//			 arr[end] = temp;
//			 
//			 start++; end--;
//		}
//		
//		System.out.println();
//		System.out.print("Reverse array : ");
//		for(int n : arr) {
//			System.out.print(n+" ");
//		}
//	}

//	Q:17) WAJP to reverse 1st half and 2nd half elements of array.	
//	--------------------------------------------------
//	Original array: 10 | 20 | 30 | 40 | 50 | 60 | 70 |
//	----------------------------------------------------
//	Reversed array: 40 | 30 | 20 | 10 | 70 | 60 | 50 |
//	---------------------------------------------------
//	public static void main(String[] args) {
//		
//		int[] arr = {10,20,30,40,50,60,70};
//		
//		System.out.print("All elements are : ");
//		for(int n: arr) {
//			System.out.print(n+" ");
//		}
//		
//		int mid = arr.length/2;
//		reverse(arr, 0,mid);
//		reverse(arr, mid + 1, arr.length-1);
//		
//		System.out.print("\nReverse elements are : ");
//		for(int n : arr) {
//			System.out.print(n+" ");
//		}
//		
//	}
//	
//	public static void reverse(int[] arr , int start , int end) {
//		while(start < end) {
//			int temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp;
//			
//			start++; end --;
//		}
//	}

//	Q:18) WAJP to check array is a palindromic array or not. Return true or false accordingly.	
//	----------------------------------------------------
//	Original array : 10 | 20 | 30 | 40 | 30 | 20 | 10 |
//	--------------
//	Output: true	
//	---------------------------------------------------
//	Original array : 10 | 20 | 30 | 40 | 30 | 50 | 10 |
//	--------------
//	Output: false
//	--------------------------------------------------
//	
//	public static void main(String[] args) {
//		
//		int[] arr = {10,20,30,40,30,20,10};
//		
//		System.out.print("All elements are : ");
//		for(int n : arr) {
//			System.out.print(n+" ");
//		}
//		
//		boolean palindromic = isPalindromic(arr,0, arr.length-1 );
//		System.out.print("\n"+palindromic);
//		
//	}
//	
//	public static boolean isPalindromic(int[] arr, int start , int end ) {
//		
//		while(start < end) {
//			if(arr[start] != arr[end])
//				return false;
//		start++; end--;
//		}
//		return true;
//	}

//	Q:19) WAJP to check two arrays are palindromic array or not. Return true or false accordingly.
//  ---------------------------------------------------
//	1st array: 	10 | 20 | 30 | 40 | 80 | 70 | 25 |	
//	------------------------------------------------
//	2nd array:  25 | 70 | 80 | 40 | 30 | 20 | 10 |
//	-------------------------------------------------
//	Output: false
//	----------------------------------------------

//	public static void main(String[] args) {
//		
//		int[] arr1 = {10,20,30,40,80,70,25};
//		int[] arr2 = {25,70,80,40,30,20,10};
//		
//		System.out.print("1st array are : ");
//		for(int n : arr1) {
//			System.out.print(n+" ");
//		}
//		
//		System.out.println();
//		System.out.print("2nd array are : ");
//		for(int n: arr2) {
//			System.out.print(n+" ");
//		}
//		System.out.println();
//		
//		boolean palindromic = isPalindromic(arr1,arr2);
//	   if(palindromic)
//		   System.out.println("1st and 2nd array are palindrom");
//	   else 
//		  System.out.println("1st and 2nd array are not palindrom"); 
//	   
//	}
//		
//		public static boolean isPalindromic(int[] arr1, int[] arr2) {
//			if(arr1.length != arr2.length)
//				return false;
//			
//			int start = 0; 
//			int end =arr1.length-1;
//			
//			while(start < end) {
//				if(arr1[start] != arr2[end])
//					return false;
//	    	start++;
//			end--;
//			}
//		return true;	
//		}

//	Q:20) WAJP to rotate each element of an array by one position in right side.
//	----------------------------------------------------
//	Original array: 10 | 20 | 30 | 40 | 50 | 60 | 70 |
//	--------------------------------------------------
//	Rotated array:  70 | 10 | 20 | 30 | 40 | 50 | 60 |
//	--------------------------------------------------

//	public static void main(String[] args) {
//		
//		int[] arr = {10,20,30,40,50,60,70};
//		
//		System.out.print("Original array : ");
//		for(int n : arr) {
//			System.out.print(n+" ");
//		}
//		System.out.println();
//		rightRotate(arr);
//	}
//
//		public static void rightRotate(int[] arr) {
//			
//		       int temp = arr[arr.length-1];
//		       
//		       for(int i = arr.length-2; i>=0;i--) {
//		    	   arr[i+1] = arr[i];
//			}
//		    arr[0]=temp;   
//			
//			System.out.print("Rotate array is : ");
//			for(int n: arr) {
//				System.out.print(n+" ");
//			}
//		}

//	Q:23) WAJP to rotate each element of an array by one position in left side
//	--------------------------------------------------------
//	Original array: 10 | 20 | 30 | 40 | 50 | 60 | 70 |
//	--------------------------------------------------------
//	Rotated array:  20 | 30 | 40 | 50 | 60 | 70 | 10 |
//	--------------------------------------------------------

//	public static void main(String[] args) {
//	
//		int[] arr = {10,20,30,40,50,60,70};
//		
//		System.out.print("Original array: ");
//		for(int n: arr) {
//			System.out.print(n+" ");
//		}
//		
//		System.out.println();
//		rotateLeft(arr);
//	}
//	
//		public static void rotateLeft(int[] arr) {
//			
//			int temp = arr[0];
//			for(int i = 1; i<arr.length;i++) {
//				arr[i-1] = arr[i];
//			}
//			
//			arr[arr.length-1] = temp;
//			
//			System.out.print("Rotate array: ");
//			for(int n: arr) {
//				System.out.print(n+" ");
//			}
//			
//		}

//	Q:24) WAJP to rotate all the elements of array k position to its left
//    ---------------------------------------------- 
//	array[] = {1, 2, 3, 4, 5, 6, 7}
//	k = 2
//	Output: {3, 4, 5, 6, 7, 1, 2}
//    --------------------------------------------
//	public static void main(String[] args) {
//		
//		int[] arr = {1,2,3,4,5,6,7};
//		System.out.print("Original Array: ");
//		for(int n:arr) {
//			System.out.print(n+" ");
//		}
//		System.out.println();
//		rotateLeftPosition(arr,2);
//	}
//	
//	public static void rotateLeftPosition(int[] arr, int k) {
//		k=k%arr.length;
//		reverse(arr, 0, arr.length-1);
//		reverse(arr, 0, arr.length-k-1);
//		reverse(arr, arr.length-k, arr.length-1);
//		
//		System.out.print("Rotated Array: ");
//		for(int n: arr) {
//			System.out.print(n+" ");
//		}
//		
//	}
//	
//	public static void reverse(int[] arr , int start, int end) {
//		while(start < end) {
//			int temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp;
//		start++;  end--;	
//		}
//	
//	}

//	Q:26) WAJP to remove an element from the certain position of the array.
//	--------------------------------------------------
//	Original array: 10 | 20 | 30 | 40 | 50 | 60 | 70 |
//	--------------------------------------------------
//	Updated array:  10 | 20 | 40 | 50 | 60 | 70|
//	---------------------------------------------------

//	public static void main(String[] args) {
//		int[] arr = {10,20,30,40,50,60,70};
//		
//		System.out.print("Original array: ");
//		for(int n:arr) {
//			System.out.print(n+" ");
//		}
//		System.out.println();
//		System.out.print("Updated array: ");
//		int[] remove = remove(arr, 2);
//		for(int n:remove) {
//			System.out.print(n+" ");
//		}
//		
//	}
//	public static int[] remove(int[] a, int index) {
//		if(index > a.length)
//			return a;
//		
//		int[] b = new int[a.length-1];
//		for(int i=0;i<b.length;i++) {
//			if(i<index)
//				b[i]=a[i];
//			else
//				b[i] = a[i+1];
//		}
//		return b;
//		
//	}

//	Q:27) WAJP to insert an element at certain position of the array
//	------------------------------------------------------
//	Original array: 10 | 20 | 30 | 40 | 50 | 60 | 70 |
//	------------------------------------------------------
//	Updated array:  10 | 20 | 30 | 35 | 40 | 50 | 60 | 70 |
//	----------------------------------------------------------
//	public static void main(String[] args) {
//		
//		int[] arr = {10,20,30,40,50,60,70};
//		System.out.print("Original array: ");
//		for(int n:arr) {
//			System.out.print(n+" ");
//		}
//		System.out.println();
//		System.out.print("Updated array: ");
//		int[] insert = insert(arr, 3,35);
//		for(int n: insert) {
//			System.out.print(n+" ");
//		}
//	}
//	
//	public static int[] insert(int[] a, int index, int val) {
//		if(index > a.length)
//			return a;
//		
//		int[] b = new int[a.length+1];
//		b[index] = val;
//		
//		for(int i = 0; i<b.length;i++) {
//			if(i<index)
//				b[i] = a[i];
//			else if(i > index)
//				b[i] = a[i-1];
//		}
//		return b;
//	}

//	28) WAJP find missing element from a given array which has a missing element in a range of n.
//	-------------------------------------------------
//	N=7
//	i/p: [7, 4,3, 0, 5, 1, 6]
//	o/p: 2	
//	-------------------------------------------
//	public static void main(String[] args) {
//		int[] arr = {7,4,3,0,5,1,6};
//		System.out.print("Array : ");
//		for(int n:arr) {
//			System.out.print(n+" ");
//		}
//		System.out.println();
//		int missingNumber = missingNumber(arr);
//		System.out.println("Missing Number is : "+missingNumber);
//	}
//	public static int missingNumber(int[] arr) {
//		int sum = 0;
//		for(int n:arr)
//			sum+=n;
//		int n = arr.length;
//		return n*(n+1)/2-sum;
//	}

//	30) WAJP to check if an array is strictly increasing.
//	i/p: [2, 3, 7, 8, 9]
//	o/p: Array is strictly increasing
//	public static void main(String[] args) {
//		int[] arr = {2,3,7,8,9};
//		System.out.print("Array : ");
//		for(int n:arr) {
//			System.out.print(n+" ");
//		}
//		System.out.println();
//		boolean increasing = isIncreasing(arr);
//		if(increasing)
//		  System.out.print("Array is strictly increasing");
//		else 
//		  System.out.print("Array is not strictly increasing");
//		
//	}
//	
//	public static boolean isIncreasing(int[] arr) {
//		for(int i = 1; i<arr.length;i++) {
//			if(arr[i] <= arr[i-1])
//			return false;
//		}
//		return true;	
//		
//	}

//	31) WAJP to check whether a given array is in sorted order or not.
//	i/p: [2, 7, 7, 8, 9]
//	o/p: Array is sorted
//	public static void main(String[] args) {
//		int[] arr = {2,7,7,8,9};
//		System.out.print("Array : ");
//		for(int n:arr) {
//			System.out.print(n+" ");
//		}
//		System.out.println();
//		boolean sorted = isSorted(arr);
//		if(sorted)
//		  System.out.print("Array is sorted");
//		else 
//		  System.out.print("Array is not sorted");
//		
//		
//	}
//	
//	public static boolean isSorted(int[] arr) {
//		for(int i = 1; i<arr.length;i++) {
//			if(arr[i] < arr[i-1])
//				return false;
//		}
//		return true;
//	}

//	Q:32) WAJP to move all zeroes of an array to the end.
//	i/p: [7, 0, 2, 6, 0, 4]
//	o/p: [7, 2, 6, 4, 0, 0]

//	public static void main(String[] args) {
//		int[] arr = {7, 0, 2, 6, 0, 4};
//		int[] moveZeroes = moveZeroes(arr);
//		for(int n:moveZeroes) {
//			System.out.print(n+" ");
//		}
//		
//	}
//	public static int[] moveZeroes(int[] arr) {
//		for(int i=0, j=0; i<arr.length;i++) {
//			if(arr[i]!=0) {
//				if(i!=j) {
//					arr[j]=arr[i];
//					arr[i]=0;
//				}
//			j++;	
//			}
//		}
//		return arr;
//	}

//	Q:33) WAJP to shift all 0’s to left and all 1’s to the right(Without Sorting).
//    i/p: [0, 1, 1, 0, 0, 1, 0, 0]
//    o/p: [0, 0, 0, 0, 0, 1, 1, 1]

//	public static void main(String[] args) {
//		int[] arr = {0, 1, 1, 0, 0, 1, 0, 0};
//		int[] shiftZeroToLeft =  shiftZeroToLeftAndOneToRight(arr);
//		for(int x:shiftZeroToLeft) {
//			System.out.print(x+" ");
//		}
//		
//	}
//	
//	public static int[] shiftZeroToLeftAndOneToRight(int[] arr) {
//		int count0 = 0;
//		for(int x:arr) {
//			if(x==0)
//				count0++;
//		}
//		for(int i=0;i<arr.length;i++) {
//			if(i<count0)
//				arr[i] = 0;
//			else {
//				arr[i] = 1;
//			}
//		}
//		return arr;
//	}

//	Q:34) For the given array of 0’s, 1’s and 2’s Sort the elements(Without Sorting).
//    i/p: [0, 2, 0, 1, 2, 1, 0, 2]
//    o/p: [0, 0, 0, 1, 1, 2, 2, 2]

//	public static void main(String[] args) {
//		int[] arr = {0, 2, 0, 1, 2, 1, 0, 2};
//	    int[] sortElement = sortElement(arr);
//	    for(int x:sortElement) {
//	    	System.out.print(x+" ");
//	    }
//	}
//
//	public static int[] sortElement(int[] arr) {
//		int count0 = 0;
//		int count1 = 0;
//		for(int x:arr) {
//			if(x == 0)
//				count0++;
//			else if(x == 1)
//				count1++;
//			
//				
//		}
//		
//		for(int i = 0; i<arr.length;i++) {
//			if(i < count0)
//				arr[i] = 0;
//			else if( i < count0 + count1)
//				arr[i] = 1;
//			else
//				arr[i] = 2;
//		}
//		return arr;
//	}

//  Q:35) WAJP to print true if all the elements in two arrays are same otherwise print false.

//	USING PREDEFINED METHOD
//	public static void main(String[] args) {
//		int[] a = {1, 3, 5, 6, 7};
//		int[] b = {1, 3, 5, 6, 7};
//		compareTwoArray(a, b);
//	}
//	
//	public static void compareTwoArray(int[] a, int[] b) {
//	   if(Arrays.equals(a, b))
//		   System.out.println(true);
//	   else 
//		   System.out.println(false);
//	}

//	USING WITHOUT PREDEFINED METHOD
//	public static void main(String[] args) {
//		int[] a = { 1, 3, 5, 6, 7 };
//		int[] b = { 1, 3, 5, 6, 8 };
//		boolean compareTwoArray = compareTwoArray(a, b);
//		System.out.println(compareTwoArray);
//	}
//	
//	public static boolean compareTwoArray(int[] a, int[] b) {
//		
//		if(a.length != b.length)
//			return false;
//		
//		for(int i = 0; i< a.length;i++) {
//			if(a[i] != b[i])
//				return false;
//		}
//		return true;
//	}

//	Q:36) WAJP to print and count all the prime number elements from array

//	public static void main(String[] args) {
//		int[]  arr = {1,2,3,4,5,6,7,9,11,13};
//		printAndCountPrimeNumber(arr);
//	}
//	
//	public static void printAndCountPrimeNumber(int[] arr) {
//		int count=0;
//		for(int i = 0; i<arr.length;i++) {
//			if(isPrime(arr[i])) {
//				count++;
//				System.out.print(arr[i]+" ");
//			}
//			
//		}
//		System.out.println();
//		System.out.println("Total Prime Number are : "+count);
//	}
//	public static boolean isPrime(int n) {
//		if(n< 2)
//			return false;
//		else if(n == 2 || n == 3)
//			return true;
//		else if(n%2 == 0)
//			return false;
//		for(int i = 3; i*i <= n ;i+=2) {
//			if(n%i == 0)
//				return false;
//		}
//		return true;
//	}

//	Q:37) WAJP to get sum of all the prime number elements from array.
//	public static void main(String[] args) {
//		int[]  arr = {1,2,3,4,5,6,7,9,11,13};
//		printAndCountPrimeNumber(arr);
//	}
//	
//	public static void printAndCountPrimeNumber(int[] arr) {
//		int sum = 0;
//		for(int i = 0; i<arr.length;i++) {
//			if(isPrime(arr[i])) {
//				sum = sum + arr[i];
//				System.out.print(arr[i]+" ");
//			}
//			
//		}
//		System.out.println();
//		System.out.println("Total Prime Number are : "+sum);
//	}
//	public static boolean isPrime(int n) {
//		if(n< 2)
//			return false;
//		else if(n == 2 || n == 3)
//			return true;
//		else if(n%2 == 0)
//			return false;
//		for(int i = 3; i*i <= n ;i+=2) {
//			if(n%i == 0)
//				return false;
//		}
//		return true;
//	}

//	Q:38) WAJP to print and count all the palindrome number elements from array.
//	public static void main(String[] args) {
//		int[] arr = { 121, 232, 123, 443, 323, 555, 456 };
//		printAndCountPalindrome(arr);
//
//	}
//
//	public static void printAndCountPalindrome(int[] arr) {
//		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (isPalindrome(arr[i])) {
//				System.out.print(arr[i] + " ");
//				count++;
//			}
//
//		}
//		System.out.println();
//		System.out.println("Total palindrome number is: " + count);
//	}
//
//	public static boolean isPalindrome(int n) {
//		int original = n;
//		int reverse = 0;
//		while (n > 0) {
//			int digit = n % 10;
//			reverse = reverse * 10 + digit;
//			n = n / 10;
//		}
//		return original == reverse;
//	}

//	Q:87) WAJP to merge two arrays into a single array.
	/*
	 * i/p: arr1 = {1, 3, 5} arr2 = {2, 4, 6, 8, 10} merged: {1, 3, 5, 2, 4, 6, 8,
	 * 10}
	 */
//	
//	public static void main(String[] args) {
//		int[] arr1 = {1,3,5};
//		int[] arr2 = {2,4,6,8,10};
//		
//		int[] merged = merge(arr1, arr2);
//		for(int x: merged) {
//			System.out.print(x+" ");
//		}
//	}
//	
//	
//	public static int[] merge(int[] arr1, int[] arr2) {
//		
//		int[] merged = new int [arr1.length + arr2.length];
//		
//		int i = 0;
//		
//		for(int x:arr1)
//			merged[i++] = x;
//		for(int x:arr2)
//			merged[i++] = x;
//		
//		return merged;
//		
//	}

//	Q:87) WAJP to zigzag merge two arrays into a single array.
	/*
	 * i/p: arr1 = {20, 30, 50}
	 * arr2 = {2, 4, 6, 8, 10}
	 * merged: {20, 2, 30, 4, 50, 6, 8, 10}
	 */

//	public static void main(String[] args) {
//		int[] arr1 = {20,30,50};
//		int[] arr2 = {2,4,6,8,10};
//		
//		int[] zigZag = zigZagMerge(arr1, arr2);
//		for(int x:zigZag) {
//			System.out.print(x+" ");
//		}
//	}
//	
//	public static int[] zigZagMerge(int[] arr1, int[] arr2) {
//		
//		int[] merged = new int[arr1.length + arr2.length];
//		
//		int index1 = 0; 
//		int index2 = 0;
//		int index = 0;
//		
//		while(index1 < arr1.length && index2 < arr2.length) {
//			if(index % 2 == 0)
//				merged[index++] = arr1[index1++];
//			else
//				merged[index++] = arr2[index2++];
//		}
//		while(index1 < arr1.length)
//			merged[index++] = arr1[index1++];
//		while(index2 < arr2.length)
//			merged[index++] = arr2[index2++];
//		
//		return merged;
//	}

//	Q:88)Merge two sorted array in sorted manner.
	/*
	 * i/p: arr1 = {20, 30, 50, 60}
	 * arr2 = {2, 28, 32, 35, 42} 
	 * merged: {2, 20, 28, 30, 32, 35, 42, 50, 60}
	 */
	
//	public static void main(String[] args) {
//		int[] arr1 = {20,30,50,60};
//		int[] arr2 = {2,28,32,35,42};
//		
//		int[] sort = merge(arr1,arr2);
//		for(int x:sort) {
//			System.out.print(x+" ");
//		}
//	}
//
//	public static int[] merge(int[] arr1, int[] arr2) {
//
//		int[] merged = new int[arr1.length + arr2.length];
//
//		int index1 = 0;
//		int index2 = 0;
//		int index = 0;
//
//		while (index1 < arr1.length && index2 < arr2.length) {
//			if (arr1[index1] < arr2[index2])
//				merged[index++] = arr1[index1++];
//			else
//				merged[index++] = arr2[index2++];
//		}
//
//		while (index1 < arr1.length) {
//			merged[index++] = arr1[index1++];
//		}
//			
//		
//		while (index2 < arr2.length) {
//			merged[index++] = arr2[index2++];
//		}
//			
//		
//		return merged;
//
//	}
	
//	Q:89) Merge Sorted Array
	
	public static void main(String[] args) {
		
		int[] arr = {3,2,1,8,12,10};
		divide(arr,0, arr.length-1);
	}

	public static void divide(int[] a, int si, int ei) {
		
		if(si < ei) {
			int mid = si + ei-si/2;
			divide(a, si, mid);
			divide(a, mid+1,ei);
			merge(a, si , mid,ei);
		}
	}
	
	public static int[] merge(int[] a, int si, int mid, int ei) {
		
		int[] merged = new int[ei-si+1];
		
		int index1 = si; int index2 = mid + 1; int index = 0;
		
		while(index1 <= mid && index2 <= ei) {
			if(a[index1] < a[index2])
				merged[index++] = a[index1++];
			else
				merged[index++] = a[index2++];
		}
		while(index1 < mid)
			merged[index++] = a[index1++];
		
		while(index2 < ei)
			merged[index++] = a[index2++];
		
		for(int i = si, j= 0; i<merged.length; i++, j++) {
			a[i] = merged[j];
		}
		
		return merged;
	}
}
