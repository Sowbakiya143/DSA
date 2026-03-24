import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{ 
   
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int[] arr={11,54,21,22,3};
		int n=arr.length;
		
		int sma=arr[0];
		int ssma=Integer.MAX_VALUE;
		
		for(int i=1;i<n;i++){
		    if(arr[i] < sma ){
		        ssma=sma;
		        sma=arr[i];
		    }else if(arr[i] < ssma && arr[i]!= sma){
		       ssma=arr[i];
		    }
		}
		System.out.println(ssma);
		

	}
}
