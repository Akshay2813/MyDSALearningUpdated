package Sorting;

public class S_03_InsertionSort {
	
	public static void insertionSort(int[] arr)
	{
		for(int round=1; round < arr.length;round++)
		{
			int value=arr[round];
			int j=round-1;
			for(;j>=0;j--)
			{
				if(arr[j]>value)
				{
					arr[j+1]=arr[j];
				}
				else
				{
					break;
				}
			}
			arr[j+1]=value;
			
		}
	}

	public static void main(String[] args) {
		int[] arr = {10,1,0,7,6,14,19};
		
		insertionSort(arr);
		for(int i=0; i< arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
