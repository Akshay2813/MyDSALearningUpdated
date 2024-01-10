package gfg;

public class ImplementStrstr {
	
	public static  int strstr(String s, String x)  //GeeksForGeekas   For
    {
		int m= s.length();
		int n= x.length();
		
		for(int i=0; i<= m-n ; i++)
		{
			boolean isBool=true;
			for(int j=0;j<n;j++)
			{
				if(x.charAt(j) != s.charAt(j+i))
				{
					isBool = false;;
					break;
				}
			}
			if(isBool == true)
			{
				return i;
			}
		}
		
		return -1;
	    
		
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(strstr("GeeksForGeeks","For"));
		
		//ababaaaaaa abaa
		
		//System.out.println(strstr("ababaaaaaa","abaa"));

	}

}
