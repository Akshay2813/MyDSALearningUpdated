package Sorting;

public class S_02_BubbleSort {

	public static void bubbleSort(int[] arr)
	{
		//for n size array we have to n-1 round  assume n=6 therefore we have 5 round
		for(int round=1;round <arr.length ; round++)  //1 2 3 4 5
		{
			//for each round we have to to n-round comparison
			//1st  round >> 5 comparision
			//2nd round >>4 comparision
			
			for(int j=0;j<arr.length-round;j++)   // for round 1 >> j =0 1 2 3 4 
			{
				if(arr[j] >arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {10,1,7,6,14,19};
		
		bubbleSort(arr);
		for(int i=0; i< arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
