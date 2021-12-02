package Problems;
import java.util.*;
public class BracketBalancing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char temp;
        char[] chararr=str.toCharArray();
        Stack<Character> s=new Stack();
        for(int i=0;i<chararr.length;i++){
            if(chararr[i]=='{' || chararr[i]=='[' || chararr[i]=='('){
                s.push(chararr[i]);

            }
            if(chararr[i]=='}'){
                temp=s.peek();
                if(temp=='{')
                    s.pop();
            }
            if(chararr[i]==']'){
                temp=s.peek();
                if(temp=='[')
                    s.pop();
            }
            if(chararr[i]==')'){
                temp=s.peek();
                if(temp=='(')
                    s.pop();
            }
        }
        if(s.isEmpty())
            System.out.println("Balanced");
        else 
            System.out.println("Not Balanced");

    }
    
}
