package demo;

public class lastOccurence {

	public static int lastOccurennceIndex(int[] arr, int target)
	{
		int start=0;
		int end=arr.length-1;
		int mid= start + (end-start)/2;
		int ans=-1;
		
		while(start<=end)
		{
			if(arr[mid]==target)
			{
				ans=mid;
				start=mid+1;
			}
			if(target<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
			mid= start + (end-start)/2;
		}
		return ans;
	}
	public static void main(String[] args) {
		
		int[] arr= {1,1,1,1,1,2,2,3,3,3,3,3};
		
		System.out.print(lastOccurennceIndex(arr,3));
		

	}

}
