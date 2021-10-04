package Small_java_problems;
import java.util.*;
interface calculator{
    public int add(int a,int b);
    public int subs(int a,int b);
    public int mul(int a,int b);
    public int divid(int a,int b);
    public int mod(int a,int b);

}
class calfun implements calculator{
    public int add(int a,int b){return a+b;}
    public int subs(int a,int b){return a-b;}
    public int mul(int a,int b){return a*b;}
    public int divid(int a,int b){return a/b;}
    public int mod(int a,int b){return a%b;}
}
public class calculator_using_interface {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        calculator obj=new calfun();
        System.out.println(obj.add(2,4));
        System.out.println(obj.subs(2,4));
        System.out.println(obj.mul(2,4));
        System.out.println(obj.divid(2,4));
        System.out.println(obj.mod(2,4));
    }
}
