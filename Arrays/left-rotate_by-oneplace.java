import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{ 
   
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int[] arr={1,2,3,4,5};
		int n=arr.length;
		
	    int temp=arr[0];
	    for(int i=1;i<n;i++){
	        arr[i-1]=arr[i];
	    }
	    arr[n-1]=temp;
	    System.out.println(Arrays.toString(arr));
	}
}
