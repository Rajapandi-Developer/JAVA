class Basics<T>{
    class Node{
        T data;
        Node next;

        Node(T val){
            data=val;
            next=null;
        }
    }

    Node last;
    Basics(){
        last=null;
    }

    public void insertAtFirst(T val){
        Node node=new Node(val);
        if(last==null){
            last=node;
            last.next=node;
        }
        else{
            node.next=last.next;
            last.next=node;
        }
    }
    public void insertAtEnd(T val){
        Node node=new Node(val);
        if(last==null){
            last=node;
            last.next=node;
        }
        else{
            node.next=last.next;
            last.next=node;
        }
        last=node;
    }

    public void insertAtPos(int pos, T val){
        if(last==null)
            insertAtFirst(val);
        Node temp=last.next;
        Node prev=null;
        Node node=new Node(val);
        for(int i=0;i<pos;i++){
            prev=temp;
            temp=temp.next;
        }
        node.next=prev.next;
        prev.next=node;
    }

    public void deleteAtPos(int pos){
        Node temp=last.next;
        Node prev=null;
        for(int i=0;i<=pos;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
    public void display(){
        Node temp=last.next;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        while(temp!=last.next);
    }
}
public class CircularLinkedList {
    public static void main(String[] args) {
        Basics<String> base=new Basics<String>();
        base.insertAtEnd("Luffy");
        base.insertAtEnd("Zoro");
        base.insertAtEnd("Usopp");
        base.insertAtEnd("Chopper");
        base.insertAtEnd("Robin");
        base.insertAtEnd("Nami");
        base.insertAtPos(3,"Sanji");
        base.display();
        System.out.println();
        base.deleteAtPos(3);
        base.display();
        System.out.println();
        // base.insertAtEnd("Luffy");
        // base.insertAtEnd("Zoro");
        // base.display();
    }
}
