package basic;

public class Flow {
	
	Flow()
	{
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	static
	{
		
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		
//		Flow f=new Flow();
		
		System.out.println("Main Method");

	}

}
