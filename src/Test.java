import java.util.Arrays;

public class Test {
	
	public static void m1(String s)
	{
		String[] arr=s.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()%2==0)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}

	//Given a String, the task is to insert another 
	//string in between the given String at a particular specified index in Java.

	public static void m2(String s, int index, String insertedString)
	{
		String ans="";
		String temp="";
		for(int i=0; i<s.length();i++)
		{
			ans=ans+s.charAt(i);
//			temp=s.charAt(s.length()-1-i)+ temp;
			
			if(i==index)
			{
				ans=ans+insertedString;
			}
		}
		
		System.out.println(ans+temp);
	}
	
	//Java Program to Sort String using sort() method

	public static void m3(String s)
	{
		char[] ch=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		Arrays.sort(ch);
		
		String p=new String(ch);
		
		System.out.println(p);
	}
	
	//geeksforgeeks sort  in built fucnttion
	
	public static void m4(String s)
	{
		char[] ch = s.toCharArray();
		System.out.println(Arrays.toString(ch));

		  int i = 0;
	      while (i < ch.length)
	      {
	            int j = i + 1;
	            while (j < ch.length) {
	                if (ch[j] < ch[i]) {
	                    // Comparing the characters one by one
	                    char temp = ch[i];
	                    ch[i] = ch[j];
	                    ch[j] = temp;
	                }
	                j += 1;
	            }
	            i += 1;
	       }
		
		System.out.println(Arrays.toString(ch));
		
	}
	//5 4 3 2
	
	//4 5 3 2
	//
	//2 3 4 5
	public static void m5(int[] arr)
	{
		System.out.println(Arrays.toString(arr));

		int i = 0;
	    while (i < arr.length)
	      {
	            int j = i + 1;
	            while (j < arr.length) {
	                if (arr[j] < arr[i]) {
	                    // Comparing the characters one by one
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	    			System.out.println(Arrays.toString(arr));

	                
	                j += 1;
	            }
    			System.out.println("After i"+ Arrays.toString(arr));

	            i += 1;
	       }
			System.out.println(Arrays.toString(arr));
	}
	
	
	public static void selectionSort(int[] arr)
	{
		System.out.println("Before Sort" +Arrays.toString(arr));

		for(int i=0;i<arr.length-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
			}
			//we will minIndex i.e. minium element and now we have Swap minIndex element with cxurrent index element
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		System.out.println("After Sort"+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		
//		m1("i am Geeks for Geeks and a Geek");
		//m2("GeeksGeeks",4,"for");
		
//		m4("geeksforgeeks");
//		m5(new int[] {5,4,3,2,1});
//		m5(new int[] {5,4,2,1,7,6});
		
		selectionSort(new int[] {5,4,3,2,1});
	
	

	}

}
