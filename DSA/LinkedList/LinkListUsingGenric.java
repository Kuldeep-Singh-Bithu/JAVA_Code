package DSA.LinkedList;
import java.util.*;
import java.util.LinkedList;
public class LinkListUsingGenric {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       List<Integer> ll=new LinkedList<>();
       ll.add(1);
       ll.add(2);
       ll.add(4);
       ll.add(5);
       ll.add(6);
       ll.add(7);
       ll.set(2,3);
       System.out.println(ll);
       ll.remove(5);
       System.out.println(ll);
       System.out.println(ll.get(2));
       Object[] arr=ll.toArray();
       for(Object o:arr){
       System.out.print(o+" ");
       }

   } 
}
