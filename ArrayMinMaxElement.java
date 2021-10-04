import java.util.*;
import java.lang.*;

public class ArrayMinMaxElement {
    public static void minmax(int arr[],int n){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("minimum value is "+min+" and maximum value is "+max);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        minmax(arr,n);


    
        
    } 
        
    
    
}
