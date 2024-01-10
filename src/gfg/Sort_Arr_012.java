package gfg;

public class Sort_Arr_012 {
	
	public static void sort012(int arr[], int n)
    {
		int zeroCount=0;
		int oneCount=0;
		int twoCount=0;
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				zeroCount++;
			}
			else if(arr[i]==1)
			{
				oneCount++;
			}
			else if(arr[i]==2)
			{
				twoCount++;
			}
		}
		int pos=0;
		while(zeroCount>0)
		{
			arr[pos]=0;
			zeroCount--;
			pos++;	
		}
		
		while(oneCount>0)
		{
			arr[pos]=1;
			oneCount--;
			pos++;	
		}
		while(twoCount>0)
		{
			arr[pos]=2;
			twoCount--;
			pos++;	
		}

		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sort012(new int[] {0,2,1,0,1,1,0,},7);

	}

}
