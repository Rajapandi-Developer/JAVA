package LinkedList;

// import java.util.Iterator;

public class initializer2 {
    public static void main(String[] args) {
        DoubleLinkedlist <Integer> ll=new DoubleLinkedlist<Integer>();
        ll.insertAtBegin(9);
        ll.insertAtBegin(5);
        ll.insertAtBegin(3);
        ll.display();
        // ll.displayreverse();

        // ll.insertAtPosition(4, 3);
        ll.deleteAtPosition(3);
        // ll.reverse();
        ll.display();

        // Iterator<Integer> it=ll.iterator();

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // } 
    
                     // Or

        // for(int a:ll){
        //     System.out.println(a+" ");
        // }
    }
}
