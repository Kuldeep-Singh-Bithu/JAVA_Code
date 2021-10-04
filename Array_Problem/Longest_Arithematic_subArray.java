// google Kick Start

// An arithmetic array is an array that contains at least two integers and the differences
// between consecutive integers are equal. For example, [9, 10], [3, 3, 3], and [9, 7, 5, 3] are
// arithmetic arrays, while [1, 3, 3, 7], [2, 1, 2], and [1, 2, 4] are not arithmetic arrays.

// Sarasvati has an array of N non-negative integers. The i-th integer of the array is Ai. She
// wants to choose a contiguous arithmetic subarray from her array that has the maximum
// length. Please help her to determine the length of the longest contiguous arithmetic
// subarray. 

// Intuition and Approach:
//  Loop over the array and find the answer.
// Maintain the following variables:
// 1. Previous Common Difference (pd)
// 2. Current Arithmetic Subarray length (curr)
// 3. Max arithmetic subarray length (ans)

package Array_Problem;
import java.util.*;
public class Longest_Arithematic_subArray {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans=2; //minimum length of Arithmetic sub Array
        int pd=arr[1]-arr[0]; 
        int curr=2; //  Minimum Current Arithmetic Subarray length
        int j=2; // hum ne arr[1] tak check ker liya h
        
        while(j<n){
            if(pd==arr[j]-arr[j-1]){
                curr++;
            }
            else{
                pd=arr[j]-arr[j-1];
                curr=2;
            }
            ans=Math.max(ans, curr);
            j++;

        }
        System.out.print(ans);

        




    }
    
}
