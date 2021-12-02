package DSA.Array_Deque;
import java.util.*;
public class ArrayDequeImplementation {
    public static void main(String[] args){
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.add(3);
        System.out.println(ad);
        ad.addFirst(2);
        System.out.println(ad);
        ad.addFirst(1);
        System.out.println(ad);
        ad.addLast(4);
        System.out.println(ad);
        ad.removeFirst();
        System.out.println(ad);
        ad.removeLast();
        System.out.println(ad);
        System.out.println(ad.element());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        ad.remove();
        System.out.println(ad);

    }
    
}
