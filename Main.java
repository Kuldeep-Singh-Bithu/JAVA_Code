/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		boolean flag=true;
		for(int i=0,j=n-1;i<n/2 && j>=n/2;i++,j--){
		    if(arr[i]!=arr[j]){
		        System.out.print("Not palindromic");
		        flag=false;
		        break;
		    }
		    
		}
		if(flag)
		System.out.print("palindrome");
	}
}
