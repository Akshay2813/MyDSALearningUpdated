package com.homework.question;

import java.util.Arrays;

public class H_08_SprialPrintMatrix {

	/*
	 * Normal Matrix 1 2 3 4 5 6 7 8 9
	 * 
	 */

	/*
	 * Spiral Matrix outward to inward
	 */

	public static void spiralPrintMatrix(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		
		int total_elt=row*col;
		
		int firstRow=0;
		int firstCol=0;
		int lastRow=row-1;
		int lastCol=col-1;

//		System.out.print(row + "--" + col);
		
		int count =0;
		while(count<total_elt)
		{
			//print first row
			for(int i=firstCol;i<=lastCol && count <total_elt;i++)
			{
				System.out.print(arr[firstRow][i] + " ");
				count++;	
			}   
			firstRow++;
			
			//print last col
			for(int i=firstRow; i<=lastRow && count <total_elt ;i++)
			{
				System.out.print(arr[i][lastCol]+" ");
				count++;
			}
			lastCol--;
			
			//print last row
			
			for(int i=lastCol;i>=firstCol&& count <total_elt ;i--)
			{
				System.out.print(arr[lastRow][i]+" ");
				count++;
			}
			lastRow--;
			//print first col
			
			for(int i=lastRow;i>=firstRow && count <total_elt;i--)
			{
				System.out.print(arr[i][firstCol]+" ");
				count++;
			}
			firstCol++;
		}
		

		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		System.out.println(Arrays.toString(nums[0]));
//		System.out.println(Arrays.toString(nums[1]));
//		System.out.println(Arrays.toString(nums[2]));

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

//
//		for(int i=0;i<nums.length;i++)
//		{
//			for(int j=0; j<nums.length;j++)
//			{
//				System.out.print(nums[j][i]+ " ");
//			}
//			System.out.println();
//		}

		spiralPrintMatrix(nums);

	}

}
