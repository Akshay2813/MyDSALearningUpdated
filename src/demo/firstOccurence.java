package demo;

public class firstOccurence {

	public static int firstOccurennceIndex(int[] arr, int target)
	{
		int start=0;
		int end=arr.length-1;
		int mid= start + (end-start)/2;
		int ans=-1;
		
		while(start<=end)
		{
			
			if(target==arr[mid])
			{
				ans=mid;
				end=mid-1;
			}
			if(target<arr[mid])
			{
				end=mid-1;
			}
			else if(target >arr[mid])
			{
				start=mid+1;
			}
			mid= start + (end-start)/2;
		}
		return ans;
	}
	public static void main(String[] args) {
		
		int[] arr= {1,1,1,1,1,2,2,3,3,3,3,3};
		
		System.out.print(firstOccurennceIndex(arr,3));

	}
}
