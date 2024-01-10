package Binary_Search;

public class B_04_squareRoot {
	
	public static int squareRootUsingBinarySearch(int num)  //25
	{
		int start=0;									//0
		int end=num;									//25
		int mid=start + (end-start)/2;
		//12
		
		int ans=-1;
		while(start<=end) //  0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
		{
			if(mid*mid==num)
			{
				return mid;
			}
			if(mid*mid < num)
			{
				ans=mid;
				start=mid+1;
			}
			else if (mid*mid > num)
			{
				end=mid-1;  //11   //4
			}
			mid=start + (end-start)/2 ;  //6   
		}
		return ans;
	}

	public static void main(String[] args) {
		
		int num=82;
		int SqrtofNum= squareRootUsingBinarySearch( num);
		System.out.println(SqrtofNum);

	}

}
