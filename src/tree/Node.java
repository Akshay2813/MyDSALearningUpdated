//package tree;
//
//import java.util.Scanner;
//
//class Node {
//	int data;
//	Node left;
//	Node right;
//	
//	Node(int data)
//	{
//		this.data=data;
//		left=null;
//		right=null;
//				
//	}
//	
//	public static void main(String[] args)
//	{
//		Node root=null;
//		root = Tree.buildTree();
//		System.out.print("Done");
//		
//	}
//}
//
//class Tree
//{
//	public static Node buildTree()
//	{
//		
//		Scanner sc = new Scanner(System.in);		
//		System.out.println("Enter data");
//		int data = sc.nextInt();
//		
//		//Base Condition
//		if(data == -1)
//		{
//			return null;
//		}
//		//Create Node
//		Node root = new Node(data);
//		
//		//Create left Node
//		System.out.println("Enter LEFT part of " + data + " Node" );
//
//		root.left = buildTree();
//		
//		//Create left Node
//		System.out.println("Enter RIGHT part of " + data + " Node" );
//
//		root.right = buildTree();
//		
//		return root;
//	}
//	
//}
