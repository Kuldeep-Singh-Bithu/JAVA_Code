
// Linear Search Time complexity is O(n)

package searching_in_Array;
import java.util.*;
public class linearSearch {
    public static int LinearSearch(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
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
        int x=LinearSearch(arr,n,key);
        if(x!=-1){
            System.out.println("Element found at index "+x);
        }
        else{
            System.out.println("Element not found");
        }



    
        
    } 
    
}
