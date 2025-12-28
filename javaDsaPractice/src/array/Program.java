package array;

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
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60,70};
		System.out.print("Original array: ");
		for(int n:arr) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.print("Updated array: ");
		int[] insert = insert(arr, 3,35);
		for(int n: insert) {
			System.out.print(n+" ");
		}
	}
	
	public static int[] insert(int[] a, int index, int val) {
		if(index > a.length)
			return a;
		
		int[] b = new int[a.length+1];
		b[index] = val;
		
		for(int i = 0; i<b.length;i++) {
			if(i<index)
				b[i] = a[i];
			else if(i > index)
				b[i] = a[i-1];
		}
		return b;
	}
		
		
}
