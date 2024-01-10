package queue;

public class DoubleQueue {
	
	
	static int size;
	static int front;
	static int rear;
	static int[] arr;
	DoubleQueue(int size)
	{
		this.size = size;
		arr = new int[size];
		front=-1;
		rear=-1;
	}
	public static void insertAtRear(int data)
	{
		//if Q is full
		if(front==0 && rear==size-1)
		{
			System.out.println("Q is full");
			return;
		}
		//if insertijg element first time means signle eleement
		else if(front==-1 && rear==-1)
		{
			front=front+1;
			rear=rear+1;
			arr[rear]=data;
			
		}
		
		//estblishing circular nature
		else if(rear==size-1 && front !=0)
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
	
	public static void insertAtFront(int data)
	{
		//if Q is full
		if(front==0 && rear==size-1)
				{
					System.out.println("Q is full");
					return;
				}
		//if insertijg element first time means signle eleement
		else if(front==-1 && rear==-1)
				{
					front=0;
					rear=0;
					arr[front]=data;
					
				}
				
				//estblishing circular nature
		else if(front==0 && rear !=size-1)
				{
					front=size-1;
					arr[front]=data;
				}
				
				//normal flow
		else
				{
					front=front-1;
					arr[front]=data;
				}	
	}
	
	public static void removeFromFront()
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
	
	public static void removeFromRear()
	{
		//if Q is empty 
		if(front==-1 && rear==-1)
					{
					System.out.print("Q is empty");
					}
		//if Q having single element
		else if(front==rear)
				{
					arr[rear]=-1;
					front=-1;
					rear=-1;
				}
		//establishing circular
		else if(rear==0)
				{
					rear=size-1;
				}
		else
				{
					rear=rear-1;
				}
	}

	public static void main(String[] args) {

	}

}
