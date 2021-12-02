// Write an efficient program for printing k largest elements in an array. Elements in an array can be in any order.
// For example, if the given array is [1, 23, 12, 9, 30, 2, 50]
// and you are asked for the largest 3 elements i.e., k = 3 then your program should print 50, 30, and 23.

package Small_java_problems;
import java.util.*;
public class K_Largest_elements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int temp=0;
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
       
        for(int i=0;i<n;i++){
            if(i<k){
                pq.add(arr[i]);
            }
            else{
            temp=pq.element();
            if(temp<arr[i]){
                pq.remove();
                pq.add(arr[i]);
                }
            }
        }
        ArrayList<Integer> al=new ArrayList<>(pq);
        Collections.sort(al,Collections.reverseOrder());
        System.out.print(al);

    }
}
