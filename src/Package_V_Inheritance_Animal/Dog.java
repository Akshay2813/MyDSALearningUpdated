package Package_V_Inheritance_Animal;

public class Dog extends Animal{
	public String name;
	Dog()
	{
		System.out.println("Dog Default Constructor called automatically");
	}
	Dog(int age,String name)
	{
		super(age);
		this.name=name;
		System.out.println("Dog Parmaterized Constructor called automatically");
	}
}
