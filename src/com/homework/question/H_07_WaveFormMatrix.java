package com.homework.question;

import java.util.Arrays;

public class H_07_WaveFormMatrix {
	
	/* 
	 Normal Matrix
	1 2 3                       
	4 5 6 
	7 8 9 
	
	 */
	

	
	/* 
	 Wave Matrix
	1 4 7
	8 5 2
	3 6 9
	 first top to bottom then bottom to top and then top to bottom
	 */

	public static void printWaveMatrix(int[][] arr)
	{
		int row=arr.length;
		int col=arr[0].length;
		
//		System.out.print(row + "--" + col);
		
		for(int startCol=0; startCol<col; startCol++)
		{
//			System.out.print(row + "--" + col);

//			for even col print top to bottom
			if(startCol%2==0)
			{
				for(int i=0;i<row;i++)
				{
					System.out.print(arr[i][startCol]+" ");
				}
			}
			
//			//for odd col print bottom to top
			else
			{
				for(int i=row-1;i>=0;i--)
				{
					System.out.print(arr[i][startCol]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
//		System.out.println(Arrays.toString(nums[0]));
//		System.out.println(Arrays.toString(nums[1]));
//		System.out.println(Arrays.toString(nums[2]));
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0; j<nums.length;j++)
			{
				System.out.print(nums[i][j]+ " ");
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
		
		printWaveMatrix(nums);

		


	}

}
