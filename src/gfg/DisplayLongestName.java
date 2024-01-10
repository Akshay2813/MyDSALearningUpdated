package gfg;

public class DisplayLongestName {
	
	public static String longest(String names[], int n) {
        
        int maxLen=Integer.MIN_VALUE;
        String ans="";
        
        for(int i=0; i<names.length;i++)
        {
//        	System.out.print(names[i].length() + " ");
            if( names[i].length()  > maxLen)
            {
                maxLen=names[i].length();
                ans=names[i];
            }
           
        }
        
        return ans;
	}

	public static void main(String[] args) {

		String[] names = { "Geek", "Geeks", "Geeksfo", "GeeksforGeek", "GeeksforGeeks" };
		
		
		System.out.println(longest(names,5));
		
	}

}
