package demo;

public class mountainArr {
	
	public static int elementInMountainArr(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		int mid=start+(end-start)/2;
		
		while(start<end)
		{
			if(arr[mid]<arr[mid+1])
			{
				start=mid+1;	
			}
			else
			{
				end=mid;
			}
			mid=start+(end-start)/2;
		}
		return mid;
		
	}

	public static void main(String[] args) {
		
		int[] arr= {0,9,10,11,5,2};
		
		System.out.println(elementInMountainArr(arr));

	}

}
