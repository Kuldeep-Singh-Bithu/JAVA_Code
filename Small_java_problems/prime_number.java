package Small_java_problems;
import java.util.*;
public class prime_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        if(n==0 || n==1){
            System.out.print("Not prime");
        }
        else{

        int m=n/2;
        
        for(int i=2;i<=m;i++){
            if(n%i==0)
                flag=true;
                break;
        }
    }
        if(flag==true)
            System.out.print("Not prime");
        else
         System.out.print("Prime");

    }
}
