package leetCode;

import java.util.Arrays;

public class L_88_MergeSortedArray {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=0;
        int j=0;
        int k=0;
        
       
        while(i<m && j<n)
        {
            
            if(nums1[i]<nums2[j])
            {
            	System.out.println("i++" + nums1[i]);
                nums1[k]=nums1[i];
                i++;
                k++;
            }
            else
            {
                nums1[k]=nums2[j];
                j++;
                k++;
            }
             
        }

        while(i<m)
        {
           
          
                nums1[k]=nums1[i];
                i++;
                k++; 
        }

         while(j<n)
         {
            
            nums1[k]=nums2[j];
               j++;
               k++; 
         }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,2,3,0,0,0};
		int[] arr2= {2,5,6};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		merge(arr1,3,arr2,3);
		System.out.println(Arrays.toString(arr1));
		
	}

}
