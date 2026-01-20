package array;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
//		
//		Example 1:
//
//			Input: nums = [1,1,0,1,1,1]
//			Output: 3
//			Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
		
		int[] nums = {1,1,0,1,1,1,1};
		int maxOne =  findMaxConsecutiveOnes(nums);
        System.out.println(maxOne);
		
	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		int tempCount = 0, finalCount = 0;
		
		for(int n:nums) {
			if(n == 1)
				tempCount++;
			else {
				if(tempCount > finalCount)
					finalCount = tempCount;
				tempCount = 0;
			}
			
		}
		if(tempCount > finalCount)
		  finalCount = tempCount;
	
		return finalCount;
	}
}
