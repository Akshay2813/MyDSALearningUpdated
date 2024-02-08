package basic;

public class OneNW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<3;i++)
		{	char ch='a';
			for(int j=0; j<i+1;j++)
			{
				char ch1 = (char) ((char) ch+j);
				System.out.print(ch1+ " ");
			}
			System.out.println();
		}

	}

}
