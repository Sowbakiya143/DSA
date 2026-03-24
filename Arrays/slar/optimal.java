import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{ 
   
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int[] arr={11,54,21,22,3};
		int n=arr.length;
		
		int lar=arr[0];
		int slar=-1;
		
		for(int i=0;i<n;i++){
		    if(arr[i] > lar ){
		        slar=lar;
		        lar=arr[i];
		    }else if(arr[i] > slar && arr[i]<lar){
		       slar=arr[i];
		    }
		}
		System.out.println(slar);
		

	}
}
