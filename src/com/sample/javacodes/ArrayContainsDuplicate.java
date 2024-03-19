package com.sample.javacodes;

import java.util.HashSet;

public class ArrayContainsDuplicate {
	//Finding duplicates using hash set since it does not allow duplicate objects
	public boolean containsDuplicateUsingHashset(int[] nums) {
		 HashSet<Integer> hs = new HashSet<Integer>();

	        for(int i=0;i<nums.length;i++)
	        {
	            if(hs.contains(nums[i]))
	            return true;
	            hs.add(nums[i]);
	        }
	        return false;
	}
	
	 public boolean containsDuplicate(int[] nums) {
	        for(int i=0;i<nums.length;i++)
	        {
	           for(int j=i+1;j<nums.length;j++)
	           {
	                while(nums[i]==nums[j])
	                return true;
	            }
	        }
	        return false;
	    }
	    public static void main(String args[])
	    {
	    	ArrayContainsDuplicate obj=new ArrayContainsDuplicate();
	        int nums[]={1,1,1,3,3,4,3,2,4,2};
	        boolean flag1=obj.containsDuplicateUsingHashset(nums);
	        boolean flag2=obj.containsDuplicate(nums);
	        System.out.println(flag1);
	        System.out.println(flag2);
	    }

}

/*Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true*/
