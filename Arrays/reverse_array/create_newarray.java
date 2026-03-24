import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		int j=0;
		int[] brr=new int[n];
		for(int i=n-1;i>=0;i--){
		   brr[j]=arr[i];
		   j++;
		   
		}
		System.out.println(Arrays.toString(brr)); 
		// It takes extra space (brr)

	}
}
