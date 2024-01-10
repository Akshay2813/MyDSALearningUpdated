package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Given an array of integers heights representing the histogram's 
//bar height where the width of each bar is 1, return the area of the 
//largest rectangle in the histogram.


public class LeetCode_74 {

	public static int[] nextSmallerIndex(int[] arr)
	{
		int[] ansArr=new int[arr.length];
		
		Stack<Integer> s=new Stack<>();
		s.push(-1);
		
		for(int i=arr.length-1;i>=0;i--)
		{
			int current=arr[i];
			
			while(s.peek() !=-1 && arr[s.peek()]>=current)   //s.peek()//here we assment index is saved into arr	 
			{
				s.pop();
			}
			ansArr[i]=s.peek();
			s.push(i);
		}
		
		return ansArr;
	}
	
	

	public static int[] prevSmallerIndex(int[] arr)
	{
		int[] ansArr=new int[arr.length];
		
		Stack<Integer> s=new Stack<>();
		s.push(-1);
		
		for(int i=0;i<arr.length;i++)
		{
			int current=arr[i];
			
			while(s.peek() !=-1 && arr[s.peek()]>=current)   //s.peek()//here we assment index is saved into arr	 
			{
				s.pop();
			}
			ansArr[i]=s.peek();
			s.push(i);
		}
		
		return ansArr;
	}
	
	public static int largestRectangleArea(int[] heights) {
		
		int largestArea=0;
		
		int[] nextSmallerIndex= nextSmallerIndex(heights);
		int[] prevSmallerIndex= prevSmallerIndex(heights);
		int inputsize=heights.length;
		for(int i=0;i< heights.length;i++)
		{
			
			int height=heights[i];
			if(nextSmallerIndex[i]==-1)
			{
				nextSmallerIndex[i]=inputsize;
			}
			int width=nextSmallerIndex[i]-prevSmallerIndex[i]-1;
			int area=height*width;
			largestArea=Math.max(largestArea, area);
			
		}
		
		
		
		//find width and width= nextpreviousIndex-previousIndex - 1
		return largestArea;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] heights = {2,1,5,6,2,3};
		
		int area=largestRectangleArea(heights);
		
		System.out.print("Largest Area of Histogram is= " + area);
		
		
		
//		int[] ansArr1= nextSmallerIndex(heights);
//		int[] ansArr2= prevSmallerIndex(heights);
//
//		for(int i=0;i<ansArr1.length;i++)
//		{
//		System.out.print(ansArr1[i]+" ");
//		}
//		for(int i=0;i<ansArr2.length;i++)
//		{
//		System.out.print(ansArr2[i]+" ");
//		}
	}

}
