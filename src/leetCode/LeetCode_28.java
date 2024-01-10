package leetCode;

public class LeetCode_28 {
	
	 public static int strStr(String haystack, String needle) {
		 int start=0;
		 int length=needle.length();
		 
		 for(int i=0;i<haystack.length();i++)
		 {
			 
			 
			int endIndex  = length+i;
			
			 if(endIndex < haystack.length()+1 && haystack.substring(i, endIndex).equals(needle))
			 {
				 return i;
			 }
		 }
		 
		 return -1;      
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String haystack="sadbutsad";
//		String needle="sad";
		
		String haystack="leetcode";
		String needle="code";
		
		int i=strStr(haystack,needle);
		
		System.out.print(i);

	}

}
