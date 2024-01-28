package basic;

public class Variable {

	
	int instance_var;
	static char static_var;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variable v = new Variable();
		int local_var;
		System.out.println ("default_instance_var = " + v.instance_var);
		
		System.out.print("default_static_var = "+Variable.static_var);

	}

}
