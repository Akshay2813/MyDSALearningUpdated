package gfg;

public class element_that_appears_once_in_sorted_array {

	public static  int findOnce(int arr[], int n)
    {
        // Complete this function
        int ans=arr[0];
        for(int i=1; i<n;i++)
        {
            ans=ans^arr[i];
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
		
		System.out.print(findOnce(arr, arr.length));


	}

}
