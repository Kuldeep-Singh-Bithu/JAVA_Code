package DSA.Stack;
import java.util.*;

class Stack{
    int capacity=2;
    int[] stack=new int[capacity];
    int head=0;
    public void push(int data){
        if(size()==capacity)
         expand();
        stack[head]=data;
        head++;
    }
    public void expand(){
        int length=size();
        int [] newStack=new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,length);
        stack=newStack;
        capacity*=2;
    }
    public int pop(){
        int data=0;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            head--;
            data=stack[head];
            stack[head]=0;
            shrink();
        }
        return data;
            
        }
        public void shrink(){
            int length=size();
            if(length<=(capacity/2)/2)
             capacity=capacity/2; 
            int[] newStack=new int[capacity];
            System.arraycopy(stack,0,newStack,0,length);
            stack=newStack;
            
        }
        public int peek(){
            int data;
            data=stack[head-1];
            return data;
        }
        public int size(){
            return head;
        }
        public boolean isEmpty(){
         return head<=0;   
        }   
        public void show(){
            for(int n:stack){
                System.out.print(n+" ");
            }
        }
}
public class StackUsingClass extends Stack {
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(2);
        s.push(3);
        s.show();
        s.push(4);
        s.push(5);
        System.out.println(" ");
        s.show();
        s.pop();
        System.out.println(" ");
        s.show();
        System.out.println(" ");
        System.out.println(s.peek());
        System.out.println(" ");
        System.out.println(s.size());
        System.out.println(" ");
        System.out.println(s.isEmpty());
    }
    
}
