package Array_Problem;
import java.util.*;
public class Sum_of_all_subarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                System.out.println(sum);

            }
        }
    }
    
}
