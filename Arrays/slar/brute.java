import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{ 
   
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int[] arr={11,54,21,2,3};
		int n=arr.length;
		
		Arrays.sort(arr);
		int lar=arr[n-1];
		
		if(n< 2) System.out.println(-1);
		for(int i=n-1;i>=0;i--){
		    if(arr[i] != lar){
		        System.out.println(arr[i]);
		        break;
		    }
		}
		

	}
}
