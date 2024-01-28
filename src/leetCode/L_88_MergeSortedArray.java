package leetCode;

import java.util.Arrays;

public class L_88_MergeSortedArray {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];
                i--;
                k--;
            }
            else
            {
                nums1[k]=nums2[j];
                j--;
                k--;
            }
             
        }

        while(j>=0)
        {
            nums1[k]=nums2[j];
                j--;
                k--; 
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
