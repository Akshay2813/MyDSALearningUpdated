package gfg;

import java.util.Arrays;

public class Atleasttwogreaterelements {

	public static long findLargestElement(long a[], long n)
    {
        long largest=Integer.MIN_VALUE; 
        
        for(int i=0; i<n ;i++)
        {
        	if(a[i]>largest)
        	{
        		largest=a[i];
        	}
        }
        return largest;
    }
    
     public static long findSecondLargestElement(long a[], long n)
    {
        long largest=Integer.MIN_VALUE; 
	    long secondLargest=Integer.MIN_VALUE; 
	    
	    for(int i=0; i<n ;i++)
        {
	    	if(a[i]>=largest)
	    	{
	    		secondLargest=largest;  //-1
	    		largest=a[i];           //30
	    	}
	    	else if(a[i]<largest && a[i] > secondLargest )
	    	{
	    		secondLargest=a[i];   //10
	    	}
	    		
        }
        return secondLargest;
    }
    public static long[] findElements( long a[], long n)
    {
    	long[] ans = new long[a.length];
    	
    	long largest=findLargestElement(a,n);
    	long secondLargest=findSecondLargestElement(a,n);
    	

    	for(int i=0;i<n;i++)
    	{
    		if(a[i] != largest  && a[i] != secondLargest)
    		{
    			ans[i]=a[i];
    		}
    		else
    		{
    			ans[i]=-1;
    		}
    	}
    	Arrays.sort(ans);
    	ans = Arrays.copyOfRange(ans, 2, ans.length); 
    	return ans;
    }
	
	public static void main(String[] args) {

		long[] arr = {30,10,100,20,40,50};
		
		System.out.println(findLargestElement(arr,arr.length));
		
		System.out.println(findSecondLargestElement(arr, arr.length));
		
		long[] ans = findElements(arr,arr.length);
		
		//Arrays.sort(ans);
		for(int i=0; i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
		

	}

}
