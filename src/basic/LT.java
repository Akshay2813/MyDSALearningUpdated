package basic;

public class LT {
	
	//String s1="Hello how are you Akshay Shelke";
	//Print vowels and its count
	
	public static void m1(String s)
	{
		s=s.toLowerCase();
		int count=0;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o'
					|| s.charAt(i)=='u' )
				
			{
				System.out.print(s.charAt(i));
				count=count+1;
			}
		}
		System.out.println();
		System.out.print(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello how are you Akshay Shelke";
		m1(s1);

	

	}

}
