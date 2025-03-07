package LinkedList;

import java.util.Iterator;

public class initializer {
    public static void main(String[] args) {
        linkedList1 <Integer> ll=new linkedList1<Integer>();
        ll.insertAtBegin(9);
        ll.insertAtBegin(5);
        ll.insertAtBegin(3);
        ll.display();

        // ll.insertAtPosition(4, 1);
        // ll.deleteAtPosition(0);
        // ll.reverse();
        // ll.display();

        Iterator<Integer> it=ll.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        } 
    
                     // Or

        // for(int a:ll){
        //     System.out.println(a+" ");
        // }
    }
}
