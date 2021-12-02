package DSA.Priority_Queue;
import java.util.*;
public class Priority_Queue {
    public static void main(String[] args){
        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        pq1.add(1);
        pq1.add(100);
        pq1.add(10);
        pq1.add(70);
        pq1.add(333);
        System.out.println(pq1.remove());
        System.out.println(pq1.remove());
        System.out.println(pq1.remove());
        System.out.println(pq1.remove());
        System.out.println(pq1.remove());


        PriorityQueue<String> pq2=new PriorityQueue<>();
        pq2.add("banna");
        pq2.add("apple");
        pq2.add("car");
        pq2.add("chili");
        pq2.add("carrot");
        System.out.println(pq2.remove());
        System.out.println(pq2.remove());
        System.out.println(pq2.remove());
        System.out.println(pq2.remove());
        System.out.println(pq2.remove());



    }
    
}
