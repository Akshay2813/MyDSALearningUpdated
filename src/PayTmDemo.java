

//


//
public class PayTmDemo {
	
	public static void arrQue(int[] arr)
	{
		int len= arr.length;
		int temp= arr[len-1];
		int start= arr[0];
		for(int i=0; i<arr.length-1;i++)
		{	
			arr[i]=arr[i+1];	
		}
		arr[0]=temp;
		arr[len-1]=start;
		
		//print my ans
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

	public static void main(String[] args) {
		//[3:38 PM] Neha Narang
		//[1,2,3,4,5] o/p: [5,1,2,3,4]
		
		int[] arr = new int[] {1,2,3,4,5};
		
		arrQue(arr);
		
		
		
		
		

	}

}
