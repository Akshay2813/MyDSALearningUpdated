package com.gfg.sdebasicsheet;

import java.util.Arrays;

public class Anagram {

	/*
	 Given two strings a and b consisting of lowercase characters. 
	 The task is to check whether two given strings are an anagram of each other or not.
	 An anagram of a string is another string that contains the same characters, 
	 only the order of characters can be different. 
	 For example, act and tac are an anagram of each other.
	 */
	public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        
        char[] arr1= a.toCharArray();
        char[] arr2= b.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
 
       String s1= new String(arr1);
       String s2= new String(arr2);
     //  System.out.print(s1 + " ---" + s2);
        if(s1.equals(s2))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";
		String s2="dacb";
		System.out.print(isAnagram(s1,s2));

	}

}
