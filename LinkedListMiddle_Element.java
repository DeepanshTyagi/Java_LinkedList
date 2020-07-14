import java.io.*;
import java.util.*;
public class LinkedListMiddle_Element
{
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	public Node head=null;
	public void insertNode_atEnd(int n)
	{
		Node newNode=new Node(n);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	public void PrintList()
	{
		Node curr=head;
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		else
		{
			while(curr!=null)
			{
				System.out.print(curr.data+" ");
				curr=curr.next;
			}
		}
	}
	public void Middle_Element()
	{
		// Method 1:- Iterate over the LinkedList and count the number of nodes and then again iterate till count/2

		//Methos 2 :- Using Slow and Fast Pointer 

		 if(head==null)
		 {
		 	System.out.println("List is Empty");
		 }
		 else
		 {
		 	Node slow_pointer=head;
		 	Node fast_pointer=head;
		 	while(fast_pointer!=null && fast_pointer.next!=null)
		 	{
		 		slow_pointer=slow_pointer.next; // Increment one time 
		 		fast_pointer=fast_pointer.next.next;
		 	}
		 	System.out.println("\nMiddle Element is:"+slow_pointer.data);
		 }
	}
	public static void main(String [] args) throws Exception
	{
         BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
         LinkedListMiddle_Element list=new LinkedListMiddle_Element();
         System.out.println("Enter the Number of Nodes");
         int n=Integer.parseInt(inp.readLine());
         System.out.println("Enter the Nodes Data");
         String []str=inp.readLine().trim().split(" ");
         for(int i=0;i<n;i++)
         {
            list.insertNode_atEnd(Integer.parseInt(str[i]));
         }
         System.out.println("Entered List is :");
         list.PrintList();
         list.Middle_Element();

	}
}
