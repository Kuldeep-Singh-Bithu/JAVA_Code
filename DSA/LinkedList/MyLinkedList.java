package DSA.LinkedList;
import java.util.*;
public class MyLinkedList<E>{  // E is elements here we can write anything


     // Node Class
     public static class Node<E>{
        public E data;
        public Node<E> next;

        public Node(E data){
            this.data=data;
            next=null;
        }
    }

    Node<E> head;
    void add(E data){
        // to add data in a new node. we have to create new node
        // to create a new node we new to create object of node class
        Node<E> toAdd=new Node<E>(data);
        
        // is Linkedlist is empty then it will head a node to head position directly
        if(isEmpty()){
            head=toAdd;
            return;
        }
        // toAdd is our new node. now we have to add it
        // we have to add every new node to the last position

        // for that we have to traverse our head to the last node because we only know
        // position of fisrt node only with the help of head
        // to traverse we need to create a temp node which will traverse through every node
        // to reach at the last node we have to use loop such that temp.next !=null because next of every last node is alway null
        
        Node<E> temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        // we we reach to last node we will add new node
        temp.next=toAdd;
    }

    // to check wether our head is null or not
    boolean isEmpty(){
        
         return head==null;
         // if head is null return true else return false
    }

    // to print LinkedList
    void print(){
        Node<E> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
     
   
    
}

