import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{ 
   
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int[] arr={1,2,3,4,5};
		int n=arr.length;
		
		int d=3;
	    d=d%n;
	    int[] temp=new int[d];
	    for(int i=0;i<d;i++){
	        temp[i]=arr[i];          // o(d)
	    }
	    for(int i=d;i<n;i++){
	        arr[i-d]=arr[i];       // o(n-d)
	    }
	    int j=0;
	    for(int i=n-d;i<n;i++){
	        arr[i]=temp[j++];      // o(d)
	    }
	    System.out.println(Arrays.toString(arr));
	}
}
 // tc- o(n+d)
 // sc- o(d)
