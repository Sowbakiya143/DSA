import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{ public static int[] reverse(int[] arr,int n){
    int start=0;
    int end=n-1;
    
    while(start< end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    return arr;
}

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
	    
	    arr=reverse(arr,n); 
		System.out.println(Arrays.toString(arr)); 
		

	}
}
