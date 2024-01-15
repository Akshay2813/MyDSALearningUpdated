package com.homework.question;

public class H_13_toalOccurence {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,2,2,3,3,4,5,5,5};
		
		int first = H_13_FirstOccurence.firstOccur(arr, 2);
		int last=H_13_LastOccurence.lastOccurence(arr, 2);
		int total = last-first+1;
		System.out.print("total ocurence = " +total);
	}

}
