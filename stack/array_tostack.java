import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void queue(int[] arr){
	    Queue<Integer> q=new ArrayDeque<>();
	    for(int i=0;i<arr.length;i++){
	        q.offer(arr[i]);
	    }
	    for(int i=0;i<arr.length;i++){
	        System.out.print(q.poll()+" ");
	    }
	}
	public static void stack(int[] arr){
	    Stack<Integer> st=new Stack<>();
	    for(int i=0;i<arr.length;i++){
	        st.push(arr[i]);
	    }
	    
	    for(int i=0;i<arr.length;i++){
	        System.out.print(st.pop()+" ");
	    }
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr={1,2,3,4};
		stack(arr);
		System.out.println();
		queue(arr);

	}
}
