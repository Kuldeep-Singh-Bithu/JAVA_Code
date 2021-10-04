package Small_java_problems;
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=0;
        int temp=n;
        int sum=0,x;
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        temp=n;
        while(temp>0){
             x=temp%10;
            sum=sum+(int)(Math.pow(x,digit));
            temp=temp/10;
        }
        
        if(sum==n)
            System.out.print("Armstrong number");
        else
            System.out.print("Not Armstrong");

       
        
    }
    
}
