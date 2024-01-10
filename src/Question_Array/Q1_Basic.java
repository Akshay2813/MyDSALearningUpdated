package Question_Array;

public class Q1_Basic {

	public static void main(String[] args) {
		
		int[] arr;
		arr= new int[3];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		int[] arr1= new int[3];

		arr[0]=11;
		arr[1]=12;
		arr[2]=13;
		
		int[] arr3 = {1,2,3,4,5,6};
		

		int[] a=  new int[26];
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
		char[] b=  new char[26];
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
		
		
		System.out.println(arr);  // address
		
		System.out.println(arr[0]);  //access element
		
		System.out.println(arr.length);   //length of arr
		
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println("Element present at index " + i +" = "+ arr3[i]);
		}
		
		for(int i: arr3)
		{
			System.out.print(i + " ");
		}

	}

}
