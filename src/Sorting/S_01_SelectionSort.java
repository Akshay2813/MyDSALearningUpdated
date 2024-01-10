package Sorting;

public class S_01_SelectionSort {

	public static void selectionSort(int[] arr) 
	{
		int n= arr.length;  //6
		for(int i=0; i<n-1;i++)  //0 1 2 3 4 
		{
			int minIndex=i;
			for(int j=i+1; j<n;j++)  // 1 2 3 4 5 
			{
				if(arr[j] < arr[minIndex])
				{
					minIndex=j;
				}
				//swap current element arr[i] with minIndex element
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,9,8,5,11,12};
		
		selectionSort(arr);
		for(int i=0; i< arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
