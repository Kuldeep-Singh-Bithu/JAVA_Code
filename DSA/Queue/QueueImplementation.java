// Queue implementation using LinkedList 
// LinkedList is made By me using Node Class 
package DSA.Queue;
import java.util.*;
import DSA.LinkedList.MyLinkedList.Node;
class MyQueue<E>{
    public Node<E> head,rear;
    public void enqueue(E data){
     Node<E> toAdd=new Node<>(data);
     if(head==null){
         head=rear=toAdd;
         return;
     }
     rear.next=toAdd;
     rear=rear.next;

    }
    public E dequeue(){
        if(head==null){
            return null;
        }
        Node<E> temp=head;
        head=head.next;
        if(head==null){
            rear=null;
        }
        return temp.data;
    }
}
public class QueueImplementation {
       public static void main(String[] args){
           MyQueue<Integer> Q=new MyQueue<>();
           Q.enqueue(22);
           Q.enqueue(23);
           Q.enqueue(24);
           Q.enqueue(25);
           Q.enqueue(26);
           Q.enqueue(27);
           System.out.println(Q.dequeue());
           System.out.println(Q.dequeue());
           System.out.println(Q.dequeue());
           System.out.println(Q.dequeue());
           System.out.println(Q.dequeue());
           System.out.println(Q.dequeue());
           System.out.println(Q.dequeue());
       }
}
