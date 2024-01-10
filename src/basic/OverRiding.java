package basic;


class Paren{
	public void m1(int x)
	{
		System.out.println("Parent Class Method");
	}
}
class Chil extends Paren{
	public void m1(int x)
	{
		System.out.println("Child Class Method");
	}
}
public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paren p = new Paren();
		p.m1(0);   //parent
		
		Chil c = new Chil();
		c.m1(0);  //child
		Paren p1 = new Chil();
		p1.m1(0);  // Child


	}

}
