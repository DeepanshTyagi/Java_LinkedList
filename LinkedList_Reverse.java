import java.io.*;
import java.util.*;
public class LinkedList_Reverse
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
    public void ReverseLinked_List()
    {
    	if(head==null)
    	{
    		System.out.println("List is Empty");
    	}
    	else
    	{
    		Node prev=null;
    		Node next=null;
    		Node curr=head;
    		while(curr!=null)
    		{
    			next=curr.next;
    			curr.next=prev;
    			prev=curr;
    			curr=next;
    		}
    		head=prev;
    	}
    }
	public static void main(String [] args) throws Exception
	{
         BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
         LinkedList_Reverse list=new LinkedList_Reverse();
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
         list.ReverseLinked_List();
         System.out.println("\nAfter Reversing the List is :");
         list.PrintList();

	}
}
