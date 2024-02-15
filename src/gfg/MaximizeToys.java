package gfg;

import java.util.Arrays;

public class MaximizeToys {

	public static int toyCount(int N, int K, int arr[])
    {
        // code here
        Arrays.sort(arr);
        //1 5 10 12 111 200 1000
        int count=0;
        for(int i=0; i<arr.length;i++)
        {
            if(K>0 && K>=arr[i])
            {
                K=K-arr[i]; //49 44 34  22
                count++; //1 2 3 4
            }
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 7 ;
		int	K = 50;
		int arr[] = {1, 12, 5, 111, 200, 1000, 10};
		System.out.print(toyCount(N,K,arr));
	}

}
