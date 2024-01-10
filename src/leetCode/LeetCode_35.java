package leetCode;

public class LeetCode_35 {
	public int searchInsert(int[] nums, int target) {

	      int start=0;

	      int end=nums.length -1;

	      int mid = start+ (end-start)/2;
	        System.out.println(start + " " + end +" "+ mid);


	      while(start<=end)
	      {
	        if(nums[mid]==target)
	        {
	          return mid;
	        }
	        if(nums[mid]<target)
	        {
	          start=mid+1;
	        }
	        else
	        {
	          end=mid-1;
	        }
	        mid = start+ (end-start)/2;
	        System.out.println(start + " " + end +" "+ mid);
	      } 
	      return mid;
	    }
	
	public static void main(String[] args)
	{
		int[] nums= {1,3,5,6};
		int target=2;
		
		LeetCode_35 l = new LeetCode_35();
		l.searchInsert(nums,target);
		
	}

}
