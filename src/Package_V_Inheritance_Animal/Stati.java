package Package_V_Inheritance_Animal;

public class Stati {
	
	Stati()
	{
		System.out.println("Constrcutor executed");
	}
	
	static {
		
		System.out.println("Static block executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stati s1 = new Stati();
		Stati s2 = new Stati();

	}

}
