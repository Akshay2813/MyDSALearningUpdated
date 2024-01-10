package Binary_Search;

public class B_06_PivotElementInArr {

	//condition / given  we have rotated plus sorted array and there is no duplicate element
	//example arr= {2,4,6,8,9,10} >> arr= {10,2,4,6,8,9}   or {9,10,2,4,6,8}
	
	public static int findPivotElementInArr(int[] arr)
	{
		//9 10 2 4 6 8 
		//line A  9 10
		//line B 2 4 6 8
		int start=0;
		int end=arr.length-1;
		int mid = start + (end-start)/2;
		while(start<=end)
		    {
		        if(start==end)
		        {
		            return start;
		        }
		        if(mid <= end && arr[mid] > arr[mid+1])
		        {
		            return mid;
		        }
		        if(mid-1 >=start && arr[mid-1] > arr[mid])
		        {
		            return mid-1;
		        }
		        if(arr[start] > arr[mid])
		        {
		        	//means we are on line B as arr[start] is always more than all elelemnt of line B
					// and our pivot is on line 1 so we have to move to left
		            end=mid-1;
		        }
		        else
		        {
		        	//means we are on line A and we have to move to right
		            start=mid+1;
		        }
		        mid=start+(end-start)/2;
		    }
		      return -1;
		}
		//line A
		//line B
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,10,2,4,6,8};
		int pivotindex= findPivotElementInArr(arr); 
		System.out.println("pivot elelemt in given sorted+rotating array occur at index = "+pivotindex);
		System.out.println("peak elelemt in given  sorted+rotating array is = " +arr[pivotindex]);
		

	}

}
