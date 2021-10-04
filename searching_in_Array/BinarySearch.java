
// For Binary Search Elements must be sorted 
// Binary Search Time Complexty O(log n)

package searching_in_Array;
import java.util.*;
public class BinarySearch {
    public static int binarySearch(int arr[],int n,int key){
        int start_point=0;
        int ending_point=n;
        
        while(start_point<=ending_point){
            //if start pint become greater than end point that means key is not present 

            int mid_point=(start_point+ending_point)/2;
            if(arr[mid_point]==key){
                return mid_point;
            }
            // if key is less than mid poin then new end point will be mid-1 and start point will remain same
            else if(arr[mid_point]>key){
                ending_point=mid_point-1;

            }
            // if key is greater than mid point then new starting poin will be mid+1 and end point will remain same
            else{
                start_point=mid_point+1;
            }

        }
        return -1; 
    }
        
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int x=binarySearch(arr,n,key);
        
        if(x!=-1){
            System.out.println("Element found at index "+x);
        }
        else{
            System.out.println("Element not found");
        }
    
}
}
