package basic;

public class Thought {
	
	public static void m1(String s)
	{
		String[] arr = s.split(" "); // this  20, 35, .5 
		double sum=0;
		for(int i=0; i<arr.length;i++)
		{
//			boolean b=Character.isDigit(arr[i]);
			
		
			String temp=arr[i].replace(",", "");
			double num = Integer.parseInt(arr[i]);
			sum=sum+num;
			
			
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is sample text with numbers 20, 35, .5, -455, 0.45 and 20.45.
		
		String s = "This is sample text with numbers 20, 35, .5, -455, 0.45 and 20.45.";
		m1(s);

	}

}
