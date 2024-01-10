package Question_Array;

public class R11_Right_rotate_By_One_Place {

	public static void rotateArrRightByOne(int[] arr)
	{
		int i=0;
		while(i<arr.length)
		{
			//swap(arr[i],arr[arr.length-1])
			
			int temp=arr[i];
			arr[i]=arr[arr.length-1];
			arr[arr.length-1]=temp;
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
		
		rotateArrRightByOne(arr);
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		

	}

}
