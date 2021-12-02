package Small_java_problems;
import java.util.*;

// Reverse a String word by word

// My name is Kuldeep
//            |     |
//            i     j
// by using two pointer we reverse a string
// make a loop and set j=i then reduce i till character at ith index is space
// then concate string from i to j with the help of substring function


public class RevereString {
    public  static String rev(String str){
        String ans="";
        int i=str.length()-1;
        while(i>=0){
            while(i>=0 && str.charAt(i)==' ') i--;
            int j=i;
            if(i<0) break;
            while(i>=0 && str.charAt(i)!=' ') i--;
            if(ans.isEmpty()){
                ans=ans.concat(str.substring(i+1, j+1));
            }
            else{
                ans=ans.concat(" "+str.substring(i+1, j+1));
            }
            

        }
        return ans;


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       System.out.print(rev(str));

    }
    
}
