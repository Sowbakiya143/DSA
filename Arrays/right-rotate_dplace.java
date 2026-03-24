import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{ 
   public static void reverse(int[] arr,int start,int end){
       while(start < end){
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
   }
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int[] arr={1,2,3,4,5};
		int n=arr.length;
		
		int d=2;
	    d=d%n;
	    reverse(arr,n-d,n-1);
	    reverse(arr,0,n-d-1);
	    reverse(arr,0,n-1);
	    System.out.println(Arrays.toString(arr));
	}
}
