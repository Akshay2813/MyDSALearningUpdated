package basic;


class Parent{
	public void m1(int... x)
	{
		System.out.println("Parent Class Method");
	}
}
class Child extends Parent{
	public void m1(int x)
	{
		System.out.println("Child Class Method");
	}
}
public class OverLoading {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.m1(0);   //parent
		
		Child c = new Child();
		c.m1(0);  //child
		Parent p1 = new Child();
		p1.m1(0);  // Parent

	}

}
