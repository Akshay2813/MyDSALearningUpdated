package recurssion;

public class R_11_IsArrSorted {

	public static boolean isArrSortedRecursive(int[] arr, int start)
	{
		if(start >=arr.length-1)
		{
			return true;
		}
		if(arr[start]>arr[start+1])
	    {
	        return false;
	    }
		return isArrSortedRecursive(arr,start+1);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,11};
		System.out.print(isArrSortedRecursive(arr,0));

	}

}
