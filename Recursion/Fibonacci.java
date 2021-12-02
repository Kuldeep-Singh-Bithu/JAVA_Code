package Recursion;
import java.util.*;
public class Fibonacci {
    public static int temp=0,n1=0,n2=1;
    public static void fibo(int n){
        if(n>0){
           
            temp=n1+n2;
            System.out.print(" "+temp);
            n1=n2;
            n2=temp;
            fibo(n-1);

        }
        

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n1+" "+n2);
        fibo(n);
    }
}
