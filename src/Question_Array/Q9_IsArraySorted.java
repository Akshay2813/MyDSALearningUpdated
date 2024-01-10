package Question_Array;

public class Q9_IsArraySorted {

	
	public static boolean arraySortedOrNot(int[] arr, int n) 
	{
		for(int i=0;i<arr.length-1;i++)
	
        {
            if(arr[i] > arr[i+1])
            {
                return false;
            }
        }
        
        return true;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,2,4,5,6};
		
		if (arraySortedOrNot(arr,arr.length))
		{
			System.out.print("Arrays is Sorted");
		}
		else
		{
			System.out.print("Arrays is NOT Sorted");
		}
		
		

	}

}
