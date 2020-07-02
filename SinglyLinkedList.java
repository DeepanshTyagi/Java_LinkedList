import java.io.*;
import java.util.*;
public class SinglyLinkedList
{
	class Node
	{
		int data;
		Node next;
		Node(int n)
		{
			this.data=n;
		}
	}
	public Node head=null;
	public Node tail=null;
	public void add_Node_Beg(int n)
	{
		Node newNode=new Node(n);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	public void add_Node_End(int n)
	{
		/* There are Two Methods
		   1. Using Head Pointer
		   2. Using Tail Pointer
		   */
         Node newNode=new Node(n);
		 // Method 1: Using Head Pointer
		 /*
		   if(head==null)
		   	 head=newNode;
		   else
		   {
		   	Node temp=head;
		   	while(temp.next!=null)
		   	{
		   		temp=temp.next;
		   	}
		   	temp.next=newNode;
		   }*/

		 // Method 2: Using Tail Pointer 
		   if(head==null)
		   {
		   	head=newNode;
		   	tail=newNode;
		   }
		   else
		   {
		   	tail.next=newNode;
		   	tail=newNode;
		   }
	}
	public void add_Node_After_Given(int pos,int n)
	{
      Node newNode=new Node(n);
      if(head==null)
      	head=newNode;
      else
      {
      	Node temp=head;
      	while(temp.data!=pos)
      	{
      		temp=temp.next;
      	}
      	newNode.next=temp.next;
      	temp.next=newNode;
      }
	}
	public void Print_List()
	{
		Node current=head;
		if(head==null)
			System.out.println("List is Empty");
		else
		{
			while(current!=null)
			{
				System.out.print(current.data+" ");
				current=current.next;
			}
		}
	}
	public static void main(String[] args) throws Exception
	{
      BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
      SinglyLinkedList list_beg=new SinglyLinkedList();
      SinglyLinkedList list_end=new SinglyLinkedList();
      SinglyLinkedList list_given=new SinglyLinkedList();
    
    System.out.println("Enter the Number of Nodes ");
      int n=Integer.parseInt(inp.readLine());
      System.out.println("Enter Node Data");
      String str[]=inp.readLine().trim().split(" ");
      for(int i=0;i<n;i++)
      {
      	list_beg.add_Node_Beg(Integer.parseInt(str[i]));
      	list_end.add_Node_End(Integer.parseInt(str[i]));
      }
      System.out.println("Enter the position and Value of Node");
      int pos=Integer.parseInt(inp.readLine());
      int val=Integer.parseInt(inp.readLine());
      System.out.println("\nAfter Inserting at Begining :");
      list_beg.Print_List();
      System.out.println("\nAfter Inserting at End      :");
      list_end.Print_List();
      list_end.add_Node_After_Given(pos,val);
      System.out.println("\nAfter Inserting value "+val+" at "+pos+" ");
      list_end.Print_List();

	}
}