package recurssion;

public class R_06_PrintElementInArr {

	public static void PrintElementInArrRecursively(int[] arr, int i)
	{
		if(i>=arr.length)
		{
			return;
		}
		System.out.print(arr[i]+" ");
		PrintElementInArrRecursively(arr,i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,3,5,7,8,9};
		PrintElementInArrRecursively(arr,0);

	}

}
