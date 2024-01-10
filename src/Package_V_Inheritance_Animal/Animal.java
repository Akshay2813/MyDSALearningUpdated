package Package_V_Inheritance_Animal;

public class Animal {
	public int age;
	
	Animal()
	{
		System.out.println("Animal Default Constructor called automatically");
	}
	
	Animal(int age)
	{
		this.age=age;
		System.out.println("Animal Paramterized Constructor called automatically");
	}
}


