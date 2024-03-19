package com.sample.javacodes;

public class StringPalindrome {
	 public boolean isPalindrome(String s) {
	        String s1=s.replaceAll("[^a-zA-Z]","");
	        String reverse="";
	        for(int i=s1.length()-1;i>=0;i--)
	            {
	                reverse+=s1.charAt(i);
	            }
	        if(s1.equalsIgnoreCase(reverse))
	        return true;
	        else return false;
	    }
	    public static void main(String args[])
	    {
	        String s="A man, a plan, a canal: Panama";
	        StringPalindrome obj=new StringPalindrome();
	        if(obj.isPalindrome(s))
	        System.out.println("Given String \""+s+"\" is a palindrome");
	        else
	        System.out.println("Given String \""+s+"\" is not a palindrome");
	    }
}

/*Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.*/