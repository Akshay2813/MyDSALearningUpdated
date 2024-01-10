package Question_Array;

public class Q7_Left_rotate_By_One_Place {

	public static void RotateArrLeftByOne(int[] arr)
	{
		int i=0;
		while(i<arr.length)
		{
			//swap(0,n-1-i)  swap(arr[0],arr[arr.length-1-i)
			//i++
			int temp=arr[0];
			arr[0]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			i=i+1;	
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
		
		System.out.println();
		
		RotateArrLeftByOne(arr);
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		
		

	}

}
