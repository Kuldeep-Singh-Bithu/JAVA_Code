package Small_java_problems;
import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] charr=s.toCharArray();
        boolean flag=false;
        int j=charr.length-1;
        for(int i=0;i<charr.length;i++){
            if(charr[i]!=charr[j]){
                flag=true;
                break;
            }
            j--;
        }
        if(flag==true){
            System.out.println("Not palindrome");
        }
        else{
            System.out.println("Palindrome");
        }

    }
    
}
