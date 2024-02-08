package com.homework.question;

public class H_27_SubStringPresentorNot {
	
	public static boolean isSubStrPresent_m1(String s, String target)
	{
		if(s.contains(target)) {
			return true;
		}
		return false;
	}
	
	public static boolean isSubStrPresent_m2(String s, String target)
	{
		if(s.matches(".*"+target+".*")) {
			return true;
		}
		return false;
	}
	
	public static boolean isSubStrPresent_m3(String s, String target)
	{
		if(s.indexOf(target)!=-1)
		{
			return true;
		}
		return false;
	}
	
		
	public static boolean isSubStrPresent_m4(String s, String target)
	{
		int m=s.length(); //10
		int n=target.length(); //4
		
		for(int i=0;i<=m-n;i++) //i=0 i<=6 
		{
			if(s.substring(i, i+n).equals(target))  //0 4--------- 6 10
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="automation";
		
		String target = "tion";
		
		System.out.println(isSubStrPresent_m1(s,target));
		System.out.println(isSubStrPresent_m2(s,target));
		System.out.println(isSubStrPresent_m3(s,target));
		
		System.out.println(isSubStrPresent_m4(s,target));



	}

}
