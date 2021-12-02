package Recursion;
import java.util.*;
public class Calculate_power_using_recursion {
    // Time Complexity is n+1 
    public static int power(int a,int b){
        if(b==0)
            return 1;
        return a*power(a,b-1);
    }
    
    // Time Complexity is log N 
    public static int fastpow(int a,int b){
        if(b==0)
        return 1;
        if(b%2==0){
            return fastpow(a*a, b/2);
        }
        return a*fastpow(a, b-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pow=sc.nextInt();
        System.out.println(power(n,pow));
        System.out.println(fastpow(n,pow));
    }
}
