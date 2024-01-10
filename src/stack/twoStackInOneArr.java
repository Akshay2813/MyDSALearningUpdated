package stack;

public class twoStackInOneArr {

	static int size;
	static int top1;
	static int top2;
	static int[] arr;

	twoStackInOneArr(int size) {

		arr = new int[size];
		this.size = size;
		top1 = -1;
		top2 = size;
	}

	public static void push1(int data) {
		
		//if space not avlaiable
		
		if(top2-top1==1){
			System.out.println("Stack1 is Overflow");
		}
		else {
			top1=top1+1;
			arr[top1]=data;
		//if space is available
		}
	}

	public static void push2(int data) {
		
		if(top2-top1==1){
			System.out.println("Stack2 is Overflow");
		}
		else {
			top2=top2-1;
			arr[top2]=data;
		//if space is available
		}
	}
	
	public static void pop1()
	{
		if(top1==-1)
		{
			System.out.println("Stack1 is UnderFlow");
		}
		else
		{
			top1=top1-1;
		}
		
	}
	public static void pop2()
	{
		if(top2==size)
		{
			System.out.println("Stack2 is UnderFlow");
		}
		else
		{
			top2=top1+1;
		}
	}

	public static void main(String[] args)
	{
		twoStackInOneArr s=new twoStackInOneArr(5);
		
		s.push1(10);
		s.push1(10);
		s.push1(10);
		s.push2(10);
		s.push2(10);
		s.push2(10);
	}
}
