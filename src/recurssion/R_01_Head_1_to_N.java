package recurssion;

public class R_01_Head_1_to_N {

	public static void print1_to_n_recursively(int n)
	{
		//Base condition
		if(n==0)
		{
			return;
		}
		//Recursive relation
		print1_to_n_recursively(n-1);
		
		//process
		System.out.print( n + " ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		print1_to_n_recursively(n);

	}

}
