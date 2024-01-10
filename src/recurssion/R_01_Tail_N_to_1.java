package recurssion;

public class R_01_Tail_N_to_1 {

	public static void print_n_to_1_recursively(int n)
	{
		//Base Condition
		if(n==0)
		{
			return;
		}
		//Process
		System.out.print(n + " ");
		
		//Recusive realation
		print_n_to_1_recursively(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		print_n_to_1_recursively(n);

	}

}
