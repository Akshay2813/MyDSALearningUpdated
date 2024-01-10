package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*oblem: User can enter 5 input numbers and 
 * summation of number cannot over 100. 
 * 
 * If user reach 100 after entering less than 5 numbers,
 *  user should not be able to enter any more inputs.*/
public class Test {
	
	public static void removAllNumandSpcialChr(String s)
	{
		String ans="";
		for (int i = 0; i < s.length(); i++) 
		{
			
			//boolean b1 = Character.isDigit(s.charAt(i));
			boolean b1 = Character.isAlphabetic(s.charAt(i));
			
			if (b1==true ) 
			{
              ans=ans+ s.substring(i, i + 1);
			}
		}
	    System.out.println(ans);	
    }
   //Given string str, the task is to print the last character of each word in the string.
	
	public static void printLastCharofEachWord(String s)
	{
		String[] arr= s.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i].charAt(arr[i].length()-1)+" ");
		}
		
	}

   
	
	public static void m1()
	{
		int[] arr= new int[3];
		
		List li= Arrays.asList(arr);
		System.out.print(li.size());
		
		Collections.sort(li);
		
		Object[] a=li.toArray();
	
		
		
		
	}
	
	public static void userInput()
	{
		int inputNum;
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i=0; i<5;i++)
		{
			if(sum <= 100)
			{
				System.out.println("ENter input");
				inputNum=sc.nextInt();
				sum=sum+inputNum;
				if (sum==100)
				{
					
					break;
				}

			}
			
			else
			{
				System.out.println("Reached limit > 100");
			}
		}
		
		System.out.println("DOne");
		
	}

//	Print the first and last character of each word in a String

	public static void printFirstAndLastChar(String s)
	{
		String[] temp=s.split(" ");
		
		System.out.println(Arrays.toString(temp));
		
		for(int i=0; i<temp.length;i++)
		{
			String ans="";
			char first=temp[i].charAt(0);
//			System.out.println(first);
			char last=temp[i].charAt(temp[i].length()-1);
			ans=ans+first+last;
			System.out.print(ans+" ");

		}
	}
	
	//Find the Nth occurrence of a character in the given String
	public static void findNthOccurrence(String s, char ch)
	{}

	public static void main(String[] args) {	
//		System.out.print("Hello");
		
//		userInput();
//		removAllNumandSpcialChr("/*A12%^k12S^%&*()$@H#@178AY");
		//25, 35, 30, 20
		//25, 35, 30, 10
		//20, 20, 20, 15, 20
		
	    String str = "Geeks for Geeks";

//	    printLastCharofEachWord(str);
		
//		printFirstAndLastChar(str);
	    
	    char[] ch = {'a','b','c'};
	    System.out.println(Arrays.toString(ch));
	    System.out.println(ch.toString());
	    System.out.print(new String(ch));


	}

}
