// Bubble Sort best Time complexity is O(n)
// wrost complexity is O(n^2)

package Sorting_in_Array;
import java.util.*;
public class BubbleSort {
    public static void bubble(int arr[],int n){
        int counter=0;
        while(counter< n-1){
            for(int i=0;i<n-counter-1;i++){
                if(arr[i]>=arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                }
            }
            counter++;
        }
        // without while loop

        // for(int i=0;i<n-1;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;

        //         }
        //     }
        // }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubble(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
