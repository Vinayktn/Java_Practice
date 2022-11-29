//Linked list creation and Traversal program

package Collections_Practice;

import java.util.Scanner;


public class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=next;
	}
	static Node head = null;

	static void creation() {
		int data,n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the data you want to insert:");
			data = sc.nextInt();
			Node new_node = new Node(data);

			if(head==null)
			{
				head=new_node;
			}
			else
			{
				new_node.next=head;
				head=new_node;

			}
			System.out.println("Do you want to continue: If Yes!! Please press-1");
			n=sc.nextInt();
		}
		while(n==1);
	}

	static void traversal() 
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("Linked List doesn't exist");
		}
		else
		{
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}

	public static void main(String[] args) 
	{
		creation();
		traversal();
	}
}