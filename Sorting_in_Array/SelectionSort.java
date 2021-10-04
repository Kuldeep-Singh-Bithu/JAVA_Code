// selection sort 
// swaping smallest elements one at a time
package Sorting_in_Array;
import java.util.*;
public class SelectionSort {
    public static void selectionSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr, n);
    }
}
