package LinkedList;

//time complexity
//  with loop - O(n) (only O(n) if its without skipping the all elements)
//  without loop - O(1)
public class DoubleLinkedlist <T>  {
   
    class Node{
        T data;
        Node next;
        Node prev;
        Node(T val){
            data=val;
            next=null;
            prev=null;
        }
    }

    Node head;
    Node tail;

    DoubleLinkedlist(){
        head=null;
        tail=null;
    }

    public void insertAtBegin(T val){
        Node newNode= new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            head.prev=newNode;
            newNode.next=head;
        }
        head=newNode;
    }

    public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void displayreverse(){
        Node temp=tail;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
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
        newNode.prev=temp;
        if(temp==tail){
            tail=newNode;
        }
        else
            temp.next.prev=newNode;
        temp.next=newNode;
    }

    public void deleteAtPosition(int pos){
        Node temp=head;
        // Node temp2=head;
        Node previous=null;

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
            if(head==null){
                tail=null;
                System.out.println("list is empty");
            }
            else
                 head.prev=null;
            return;
        }
        for(int i=1;i<pos;i++){
            previous=temp;
            temp=temp.next;
            if(temp==null)
            throw new IndexOutOfBoundsException("List is empty, first assign it");
        }
        previous.next=temp.next;
        if(temp.next==null)
            tail=previous;
        else
            temp.next.prev=previous;

    }


    // @Override
//     public Iterator<T> iterator() {
//         return new Iterator<T>(){
//          Node temp=head;
//         public  boolean hasNext(){
//             return temp!=null;
//         }

//         public T next(){

//             T val=temp.data;
//             temp=temp.next;
//             return val;
//         }
//     };

// }

    

}
