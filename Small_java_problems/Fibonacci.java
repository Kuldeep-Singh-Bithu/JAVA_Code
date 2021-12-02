package Small_java_problems;
import java.util.*;
public class Fibonacci {

    static int n1=0,n2=1,n3;
    
    public static void fibo(int n){
        if(n> 0){
        n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;
        fibo(n-1);
    }


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0,temp2=1,sum=0;
        // System.out.print(temp+" "+temp2);
        // for(int i=2;i<n;i++){
            
        //     sum=temp+temp2;
        //     System.out.print(" "+sum);
        //     temp=temp2;
        //     temp2=sum;
            

        // }
        System.out.print(n1+" "+n2);

        fibo(n-2);

    }
    
}
