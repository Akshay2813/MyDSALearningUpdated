package leetCode;


public class LeetCode_55 {
	
	 public int lengthOfLastWord(String s) {

	      String[] arr=s.split(" ");
	      int len=arr.length;
	      return arr[len-1].length();
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
