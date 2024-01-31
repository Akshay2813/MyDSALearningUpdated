package com.learning.keyconcept;

import java.util.Arrays;

public class Practical_2 {

	public static void m1(int[] arr) {
		
		System.out.println("Anomus arr= " +Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array Declaration
		
		int[] arr;
		
		//arr Creation
		
		arr = new int[5];
		
		//element assignemnt arr intialization
		
		arr[0]=11;
		arr[1]=12;
		arr[2]=13;
		arr[3]=14;
		arr[4]=15;
		
		
		//print arr
		System.out.println(Arrays.toString(arr));
		
		//print length of arr
		System.out.println("Length of Arr = " +arr.length);
		
		
		
		System.out.println(arr); //claasName@HashCode_In_HexaDecimalForm   [I@3f99bd52
		
		
		//Arr Declaration, creation ,initliazation in one line
		
		int[] arr_1 = {11,12,13,14,15};
		
		
		//Anonymous arr paasing
		
		m1(new int[] {1,2,3,4});
		
		
		//element size byte short int char
		
		byte b=3;
		int[] arr_2=new int[b];
		
		short s=5;
		int[] arr_3=new int[s];
		
		char ch ='a';
		int[] arr_4=new int[ch];
		
		System.out.println(arr_4.length);
		
		int i=5;
		int[] arr_5=new int[i];



	}

}
