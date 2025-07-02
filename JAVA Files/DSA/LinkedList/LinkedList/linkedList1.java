package LinkedList;

import java.util.Iterator;

/**
 * linkedList1
 */
public class linkedList1 <T> implements Iterable<T>{

    class Node{
        T data;
        Node next;
        Node(T val){
            data=val;
            next=null;
        }
    }

    Node head;

    linkedList1(){
        head=null;
    }

    public void insertAtBegin(T val){
        Node newNode= new Node(val);
        // if(head==null){
        //     head=newNode;
        // }
        // else{
            newNode.next=head;
            head=newNode;
        // }

    }

    public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void insertAtPosition(T val, int pos){
        Node newNode=new Node(val);
        Node temp=head;
        if(pos==0){
            insertAtBegin(val);
            return;
        }

        for(int i=1;i<pos;i++){
            temp=temp.next;
            if(temp==null){
                throw new IndexOutOfBoundsException("Out of Data brother,  caused by insertAtPosition method ");
                
            }
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void deleteAtPosition(int pos){
        Node temp=head;
        // Node temp2=head;
        Node prev=null;

        // for(int i=1;i<=pos;i++){
        //     temp=temp.next;
        // }
        // for(int i=1;i<pos;i++){
        //     temp2=temp2.next;
        // }  we have much simple than this

        if(head==null)
            throw new IndexOutOfBoundsException("List is empty, first assign it");
        
        if(pos==0){
            head=head.next;
            return;
        }
        for(int i=1;i<pos;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;

    }

    //Revers a LinkedList 
    public void reverse(){
        Node temp=head;
        Node jump=head.next;
        Node prev=null;
        while(temp!=null){
            jump=temp.next;
            temp.next=prev; //most important line
            prev=temp;
            temp=jump;
        }
        head=prev;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>(){
         Node temp=head;
        public  boolean hasNext(){
            return temp!=null;
        }

        public T next(){

            T val=temp.data;
            temp=temp.next;
            return val;
        }
    };

}

    
}