package basic;

public class MergeArray {
	
	public static int[] mergeTwoSortedArr( int[] arr1, int[] arr2)
	  {
	    int length_1=arr1.length;
	    int length_2=arr2.length;
//	    System.out.println(length_1);
//	    System.out.println(length_2);

	    
	    int[] arr = new int[length_1 + length_2];
	    
	    int i=0; 
	    int j=0;
	    int k=0;

	    while(i < length_1 && j< length_2)
	    {
	      if(arr1[i] <  arr2[j])
	      {
	    	System.out.println("Chec1 arr1 < arr2");
	        arr[k]=arr1[i];
	        i++;
	        k++;
	      }
	      else
	      {
		    	System.out.println("Chec1 arr1 > arr2");

	        arr[k]=arr2[j];
	        j++;
	        k++;
	      }
	    }

	  while(i < length_1)
	  {
	    System.out.println("Chec1  arr1");

	    arr[k]=arr1[i];
	    i++;
	    k++;

	  }
	  while(j < length_2)
	  {
		System.out.println("Chec1  arr2");
	    arr[k]=arr2[j];
	    j++;
	    k++;
	  }

	  return arr;

	  }
	public static void main(String[] args)
	{
	   int[] arr1= {3,4};
	   int[] arr2={};
	   
	  int[] arr =mergeTwoSortedArr(arr1,arr2);
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.print(arr[i]+"  ");
	  }
	   

	}


}
