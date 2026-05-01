import java.util.*;
import java.lang.*;
import java.io.*;
class node{
        int data;
        node next;
        node(int data1, node next1){
            this.data=data1;
            this.next=next1;
        }
        node(int data1){
            this.data=data1;
            this.next=null;
        }
    }
class Codechef
{
    public static void print(node head){
        node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static node convert(int[] arr ){
        node head=new node(arr[0]);
        node mover=head;
        for(int i=1;i<arr.length;i++){
            node temp=new node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static node deletehead(node head){
    if(head == null) return head;
    head=head.next;
    return head;
}
    public static node deletetail(node head){
    if(head == null || head.next==null) return null;
    node temp=head;
    while(temp.next.next != null){
        temp=temp.next;
    }
    temp.next=null;
    return head;
}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr={2,3,4,5};
		node y= convert(arr);
		node delete=deletetail(y);
		print(delete);

	}
}
