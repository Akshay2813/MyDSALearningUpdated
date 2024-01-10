package gfg;

import java.util.Arrays;

public class RemoveSpaces {

	//gives time Limit exceeed in gfg
	/*
	public static String modify(String S)
    {
        // your code here
        
        String [] strArr = S.split(" ");
        String ans="";
        for(int i=0; i<strArr.length;i++)
        {
        	ans=ans+strArr[i];
        }
        return ans;
       
    }
    */
	
	public static String modify(String S)
	{
		String ans="";
		
		
		for(int i=0; i<S.length();i++)
		{
			if(S.charAt(i) != ' ')
			{
				ans=ans+S.charAt(i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.print(modify("   ab   dfr  fg"));
//		
//		char ch ='c';
//		String s="ss";
		
		
		
//		Character.isAlphabetic(ch);
//		Character.isDigit(ch);
		
		int[] iarr= {1,2,3};
		System.out.print(Arrays.toString(iarr));
		
		char[] ch= {'a', 'b'};
		System.out.print(Arrays.toString(ch));
		
	
		

		

	}

}
