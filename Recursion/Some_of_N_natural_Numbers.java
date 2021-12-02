// Natural number 1,2,3,4,5..............


package Recursion;
import java.util.*;
public class Some_of_N_natural_Numbers {
    public static int sum(int n){
        if(n==1) //base condition
         return 1;
        return n+sum(n-1); // Realtion between some examples
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(sum(n));

    }
}
