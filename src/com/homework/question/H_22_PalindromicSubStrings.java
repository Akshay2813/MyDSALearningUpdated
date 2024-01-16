package com.homework.question;

public class H_22_PalindromicSubStrings {

	
	public static int expandAround(String s, int i, int j) //s,1,2
	{
		int count=0;
		while(i>=0 && j<s.length()  && s.charAt(i)==s.charAt(j))
		{
			count=count+1;
			i--;
			j++;
			
		}
		return count;
	}
	public static int count_PalindromicSubStrings(String s)
	{
		int count=0;
		
		for(int i=0; i<s.length();i++)
		{
			int evenAns=expandAround(s,i,i+1);  
			count=count+evenAns;
			int oddAns=expandAround(s,i,i);     
			count=count+oddAns;
			
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="abc"; //3
		String s="aba";
		
		System.out.print(count_PalindromicSubStrings(s));

	}

}
