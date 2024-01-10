package gfg;

public class SecondLarget {

	public static int print2largest(int arr[], int n) {
//		int largest=Integer.MIN_VALUE;
//		int secondLargest=Integer.MIN_VALUE;
		int largest=-1;
		int secondLargest=-1;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>=largest)
			{
				secondLargest=largest;
				largest = arr[i];
			}
			else if(arr[i]>secondLargest && arr[i]<largest)
			{
				secondLargest=arr[i];
			}
		}
        return secondLargest;
    }
	public static void main(String[] args) {


	}

}
