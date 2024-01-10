package Question_Array;

public class Q5_UniqueElement {

	//Suppose in Array Element repeated two times except one element find that one element
	
	public static int FindUniqueElementInArr(int[] arr)
	{
		int element = 0;
		
		for(int i=0; i< arr.length;i++)
		{
			element= element ^ arr[i];
		}
		return element;
		
	}
	public static void main(String[] args) {
		
		int[] arr = {30,30,40,10,40,50,60,70,50,60,70};
		
		int element = FindUniqueElementInArr(arr);
		
		System.out.print(element);

	}

}
