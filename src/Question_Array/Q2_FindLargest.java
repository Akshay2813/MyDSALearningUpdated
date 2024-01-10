package Question_Array;

public class Q2_FindLargest {
	
	public static int MaxNumInArray(int[] arr)
	{
		int MaxValue = Integer.MIN_VALUE; 
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>MaxValue)
			{
				MaxValue=arr[i];
			}
		}
		
		return MaxValue;
	}

	public static void main(String[] args) {
		int[] arr = {30,10,100,20,40,50};
		
		// Integer.MAX_VALUE;  Integer.MIN_VALUE; 
		
		
		System.out.println("Maximum number in array = " + MaxNumInArray(arr));
		

	}

}
