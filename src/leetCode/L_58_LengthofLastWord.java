package leetCode;

public class L_58_LengthofLastWord {

	public static int lengthOfLastWord(String s) {

		int count = 0;
		int i = s.length() - 1;
		
		//to find last space so that we can stop there 
		while (s.charAt(i) == ' ') {
			i = i - 1;
		}
		for (int j = 0; j < i + 1; j++) {
			if (s.charAt(j) != ' ') {
				count++;
			} else {
				count = 0;
			}
		}
		return count;

	}
	 public int lengthOfLastWord_inBuiltFunction(String s) {

	      String[] arr=s.split(" ");
	      int len=arr.length;
		  return arr[len-1].length();
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello World     ";
		
		int l = lengthOfLastWord(s);
		
		System.out.print(l);
		

	}

}
