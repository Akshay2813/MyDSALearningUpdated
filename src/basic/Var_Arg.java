package basic;

public class Var_Arg {

	public static void m1(int... x)
	{}
	
	public static void m2(int[] x)
	{}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1(1,2,3);
		m1(new int[] {1,2,3});
		
//		m2(1,2);

	}

}
