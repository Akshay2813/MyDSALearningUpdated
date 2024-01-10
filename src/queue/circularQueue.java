package queue;

public class circularQueue {
	
	
	static int size;
	static int front;
	static int rear;
	static int[] arr;
	circularQueue(int size)
	{
		this.size = size;
		arr = new int[size];
		front=-1;
		rear=-1;
	}
	
	public static void InsertElement(int data)
	{
		//if Q is full
		if(front==0 && rear==size-1)
		{
			System.out.println("Q is Full, can't insert element");
		}
		//if inserting first element
		else if(front==-1 && rear==-1)
		{
			front=front+1;
			rear=rear+1;
			arr[rear]=data;
		}
		//establisihing cicular nature
		else if(front !=0 && rear==size-1)
		{
			rear=0;
			arr[rear]=data;
		}
		//normal flow
		else
		{
			rear=rear+1;
			arr[rear]=data;
		}
		
	}

	public static void removeElement()
	{
		//if Q is empty 
		if(front==-1 && rear==-1)
		{
			System.out.print("Q is empty");
		}
		//if Q having single element
		else if(front==rear)
		{
			arr[front]=-1;
			front=-1;
			rear=-1;
		}
		//establishing circular
		else if(front==size-1)
		{
			front=0;
		}
		else
		{
			front=front+1;
		}
		
	}
	public static void main(String[] args) {

		circularQueue q= new circularQueue(5);
		q.InsertElement(10);
		q.InsertElement(20);
		q.InsertElement(30);
		q.InsertElement(40);
		q.InsertElement(50);
		//q.InsertElement(10);
		q.removeElement();
		q.removeElement();
		q.removeElement();
		q.removeElement();
		q.removeElement();
		//q.removeElement();
		q.InsertElement(50);



	}

}
