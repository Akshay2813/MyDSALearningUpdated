package Question_Array;

public class Q3_SecondLargest {
	public static int SecondLargestNumInArray(int[] arr)
	{
		int MaxValue = Integer.MIN_VALUE;      
		int SecondMaxValue = Integer.MIN_VALUE;  
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>MaxValue)   
			{
				SecondMaxValue=MaxValue;   //0 30 
				MaxValue=arr[i];	   // 30 100
			}
			else if (arr[i] < MaxValue && arr[i] > SecondMaxValue )
			{
				SecondMaxValue=arr[i];  //10
			}
		}
		
		return SecondMaxValue;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {30,10,100,20,40,50,200,50,250,10,10};
		
		// Integer.MAX_VALUE;  Integer.MIN_VALUE; 
		
		
		System.out.println("Second largest number in array = " + SecondLargestNumInArray(arr));

	}

}
