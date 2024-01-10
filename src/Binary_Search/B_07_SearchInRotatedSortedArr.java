package Binary_Search;

public class B_07_SearchInRotatedSortedArr {

	public static int binarySearch(int[] arr,int start, int end, int target)
	{
		int mid = start + (end-start)/2;
		while(start<=end)
		{
			if(arr[mid]==target)
			{
				return mid;
			}
			if(target < arr[mid])
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
			
			mid=start+ (end-start)/2;
		}
		
		return -1;
	}
	
	public static int searchInRotatingSortedArr(int[] arr, int target)
	{
		int ans=-1;
		int pivotIndex= B_06_PivotElementInArr.findPivotElementInArr(arr);
		System.out.println(pivotIndex);
		if(target >=arr[pivotIndex])
		{
			System.out.println("Inside if");
			ans =binarySearch(arr,0,pivotIndex,target);
		}
		else
		{	
			System.out.println("Inside else");
			ans=binarySearch(arr,pivotIndex+1,arr.length-1,target);
		}
		return ans;
	}
	public static void main(String[] args) {
		//int[] arr= {9,10,2,4,6,8};
		//int[] arr = {4,5,6,7,0,1,2};
		int[] arr = {1,3};
		int target=1;
		System.out.println("tageet elelemt found at index = "+searchInRotatingSortedArr(arr,target));
	}
}
