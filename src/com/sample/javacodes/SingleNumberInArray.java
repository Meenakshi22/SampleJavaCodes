package com.sample.javacodes;

public class SingleNumberInArray {
	public int singleNumber(int[] nums) {
		int xor = 0;
		for (int i = 0; i < nums.length; i++) {
			xor = xor ^ nums[i];
		}
		return xor;
	}

	public static void main(String args[]) {
		int nums[] = { 4, 1, 2, 1, 2 };
		SingleNumberInArray obj = new SingleNumberInArray();
		int result = obj.singleNumber(nums);
		System.out.println(result);
	}

}

/*
 * Example 1:
 * 
 * Input: nums = [2,2,1] Output: 1 Example 2:
 * 
 * Input: nums = [4,1,2,1,2] Output: 4 Example 3:
 * 
 * Input: nums = [1] Output: 1
 */
//Since XOR of a number with itself results in 0, and 
//XOR of a number with 0 results in the number itself,
//we can use the XOR operation to find the single number efficiently.