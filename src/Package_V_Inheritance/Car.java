package Package_V_Inheritance;

public class Car {
	Car()
	{
		System.out.println("Car Constrcutor called");
	}
	
	public void display(String CarName)
	{
		System.out.println("Car display method "+CarName);
	}
	
	public void testmethod(int i)
	{
		System.out.println("Car testmethod method ="+i);
	}
	
	
	 
	public static void main(String[] args) {
		Maruti m= new Maruti();
		
		m.display("Maruti800");
		m.testmethod(10);
//		Car m1= new Maruti();
//		
//		Car m2= new Car();
//		
		

}}

class Maruti extends Car{
	Maruti()
	{
		System.out.println("Maruti Constrcutor called");
	}
	
	public void display()
	{
		System.out.println("Maruti display method ");
	}
	
	public void testmethod(int i)
	{
		System.out.println("Maruti testmethod method ="+i);
	}
	
	
		
}
