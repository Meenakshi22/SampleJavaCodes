package com.sample.javacodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumbersInArray {
	 public List<Integer> findDisappearedNumbers(int[] nums) {
	        Set<Integer> set = new HashSet<>();
	        for(int val:nums)
	        {
	            set.add(val);
	        }
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i=1;i<=nums.length;i++)
	        {
	            if(!set.contains(i))
	            list.add(i);
	        }
	        return list;
	    }
	    public static void main(String args[])
	    {
	    	MissingNumbersInArray obj= new MissingNumbersInArray();
	        int nums[]={4,3,2,7,8,2,3,1};
	        List<Integer> list=obj.findDisappearedNumbers(nums);
	       System.out.println(list);
	    }

}

/*Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]*/