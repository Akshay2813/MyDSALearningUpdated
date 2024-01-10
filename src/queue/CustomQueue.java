package queue;

public class CustomQueue {
	static int size;
	static int front;
	static int rear;
	static int[] arr;
	CustomQueue(int size)
	{
		arr=new int[size];
		this.size=size;
		front=0;
		rear=0;
	}
	
	public static void addElement(int element)
	{
		
		if(rear==size)
		{
			//if queue is full we can NOT add element
			System.out.println("Queue is full, we can not add more ellement");
		}
		else {
			
			//else queue is empty we can add element
			arr[rear]=element;
			rear=rear+1;
		}
	}
	public static void RemoveElement()

	{
		//if queue is empty
		if(front==rear)
		{
			//if queue is empty we can NOT have  element to remove
			System.out.println("Queue is empty, we can not have element to remove");
		}
		else 
		{
			//else we have element to remove
			arr[front]=-1;
			front=front+1;
			if(front==rear)
			{
				front=0;
				rear=0;
			}
		}
	}
	
	public static int getFrontElement()
	{
		
		if(front==rear)
		{
			//if queue is empty we can NOT have to get 
			System.out.println("Queue is empty, we can not have element ");
			return -1;
		}
		else 
		{
		//else queue is not empty
			return arr[front];
		}
		
	}
	
	public static boolean isQEmpty()
	{
		if(front==rear)
		{
			return true;
		}
		else
		{
			return false;
		}

		
	}
	public static int getSize()
	{
		return rear-front;
	}
	public static void main(String[] args) {
		
		CustomQueue q= new CustomQueue(5);
		
		q.addElement(10);
		q.addElement(20);
		q.addElement(30);
		q.addElement(40);
		//q.addElement(50);
		
		//q.addElement(10);
		
		System.out.println(isQEmpty());
		System.out.println("size="+q.getSize());

		
		while(! q.isQEmpty())
		{
			System.out.print(q.getFrontElement()+" ");
			
			q.RemoveElement();
			
		}
		System.out.println();
		System.out.println(isQEmpty());
		
		System.out.println(q.getFrontElement());
		
		System.out.println("size="+q.getSize());

		

	}

}
