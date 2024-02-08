package basic;

public class QWER {
	
	public static int hammingWeight(int n) {
        int count=0;
        int temp=n;
        while(temp!=0)
        {
            int digit=temp%10;
            if(digit==1)
            {
                count++;
            }
            temp=temp/10;
        }
        return count;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(hammingWeight(1011));

	}

}
