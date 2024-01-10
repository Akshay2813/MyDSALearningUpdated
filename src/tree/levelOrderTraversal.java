package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node
{
	int data;
	Node left;
	Node right;
	
	Node(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
}

class Tree
{
	public static Node buildTree()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data");
		
		int data = sc.nextInt();
		
		if(data ==-1)
		{
			return null;
		}
		
		Node root = new Node(data);
		
		System.out.println("Enter LEFT part of " + data + " Node" );

		root.left = buildTree();
		
		//Create left Node
		System.out.println("Enter RIGHT part of " + data + " Node" );

		root.right = buildTree();
		
		return root;	
	}
	
	public static void levelOrderTraversal(Node root)
	{
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);
		
		while(!q.isEmpty())
		{
			//save front in temp
			Node temp = q.peek();
			
			//pop fornt
			q.poll();
			
			//print temp
			
			System.out.print(temp.data+" ");
			
			//child node
			if(temp.left != null)
			{
				q.add(temp.left);
			}
			if(temp.right != null)
			{
				q.add(temp.right);
			}
				
		}
		
	}
}

public class levelOrderTraversal {

	public static void main(String[] args) {
		
		Node root=null;
		
		root  = Tree.buildTree();
		Tree.levelOrderTraversal(root);
		

	}

}
