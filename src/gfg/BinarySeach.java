package gfg;

public class BinarySeach {

	
	public static int binarysearch(int arr[], int n, int k) {
		int start=0;
		int end=arr.length-1;
		int mid = start + (end-start)/2;
		
		while(start<=end)
		{
			if(arr[mid]==k)
			{
				return mid;
			}
			else if(arr[mid]< k)
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
			mid=start+ (end-start)/2;
		}
		return -1;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 20 ,30 ,40 ,50 };
		int l=arr.length;
		int target = 20;
		System.out.print(binarysearch(arr, l,target));

	}

}
