// Method 1: By using Exta Space i.e HashSet

/*
import java.io.*;
import java.util.*;
public class Linkedlist_LoopDetect
{
	static class Node
	{
          int data;
          Node next;
          Node(int data)
          {
          	this.data=data;
          }
	}
	public static Node head=null;
	public static void insertNode_atBeg(int n)
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
	public static boolean Detect_Loop(Node head)
	{
       HashSet<Node> hs=new HashSet<Node>();
       while(head!=null)
       {
       	 if(hs.contains(head))
       	 	return true;

       	 hs.add(head);
       	 head=head.next;
       }
        return false;
	}
	public static void main(String [] args)
	{
		Linkedlist_LoopDetect list=new Linkedlist_LoopDetect();
		list.insertNode_atBeg(10);
		list.insertNode_atBeg(20);
		list.insertNode_atBeg(30);
		list.insertNode_atBeg(40);
		// list.head.next.next=list.head; // Check for loop
		if(Detect_Loop(head))
		{
			System.out.println("\nContains Loop");
		}
		else
		{
			System.out.println("\nDoes Not contain Loop");
		}
	}
}
*/

// Method 2:- By Modifying Linked list Data Structure 

import java.io.*;
import java.util.*;
public class Linkedlist_LoopDetect
{
	static class Node
	{
          int data;
          Node next;
          boolean flag;
          Node(int data)
          {
          	this.data=data;
          	flag=false;
          }
	}
	public static Node head=null;
	public static void insertNode_atBeg(int n)
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
	public static boolean Detect_Loop(Node head)
	{
       while(head!=null)
       {
       	 if(head.flag==true)
       	 	return true;

       	 head.flag=true;
       	 head=head.next;
       }
        return false;
	}
	public static void main(String [] args)
	{
		Linkedlist_LoopDetect list=new Linkedlist_LoopDetect();
		list.insertNode_atBeg(10);
		list.insertNode_atBeg(20);
		list.insertNode_atBeg(30);
		list.insertNode_atBeg(40);
		 list.head.next.next=list.head; // Check for loop
		if(Detect_Loop(head))
		{
			System.out.println("\nContains Loop");
		}
		else
		{
			System.out.println("\nDoes Not contain Loop");
		}
	}
}