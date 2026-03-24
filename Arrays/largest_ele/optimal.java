import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{ 
   
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int[] arr={11,54,21,2,3};
		int n=arr.length;
		int lar=arr[0];
		for(int i=0;i<n;i++){
		    if(arr[i] > lar){
		        lar=arr[i];
		    }
		}
	    
		System.out.println(lar); 
		

	}
}
