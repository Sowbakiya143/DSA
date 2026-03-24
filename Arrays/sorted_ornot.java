import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{ 
    public static boolean sorted(int[] arr,int n){
    for(int i=0;i<n-1;i++){
        if(arr[i] > arr[i+1]){
            return false;
        }
    }
    return true;
}

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
	    
	    
		System.out.println(sorted(arr,n)); 
		

	}
}
