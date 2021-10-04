package Array_Problem;
import java.util.*;
public class Max_till_i_th {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
            System.out.println("Maximum number till "+i+" is "+max);
        }


    }
    
}
