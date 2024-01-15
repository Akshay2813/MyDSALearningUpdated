package com.homework.question;

import java.util.Collections;

public class H_09_arrSum {
	
	public static String twoArrSum(int[] a,int[] b)
	{
		int carry=0;
		String sum="";
		int i=a.length-1;
		int j=b.length-1;
//		List<Integer> li = new ArrayList();
		while(i>=0 && j>=0)
		{
			
			int temp =a[i]+b[j]+carry;  //0
//			System.out.println(a[i]+" "+ a[j] + "= " + temp);
			int digit=temp%10;  //0 0
			carry=temp/10;  //0 0
//			li.add(digit); //0 0 
			sum=digit+sum;
			i--;
			j--;
		}
		
		while(i>=0)
		{
			int temp=a[i]+carry;
			int digit=temp%10;
			carry=temp/10;
//			li.add(digit); //0 0 
			sum=digit+sum;
			i--;
		}
		while(j>=0)
		{
			int temp=a[i]+carry;
			int digit=temp%10;
			carry=temp/10;
//			li.add(digit); //0 0 
			sum=digit+sum;
			j--;
		}
		while(carry !=0)
		{
			int digit=carry%10;
//			li.add(digit); 
			sum=digit+sum;
			carry=carry/10;
		}
//		Collections.reverse(li);
//		System.out.print(li);
		System.out.print(sum);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,0,0};
		int[] b = {9,0,0};
	String sum =twoArrSum(a,b);
//
		String s= "1234";
		
		
	
	
//		Collections.reverse(s);
		
	}

}
