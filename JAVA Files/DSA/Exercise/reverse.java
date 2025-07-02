
class Solution <T>{
    class Node{
        T data;
        Node pointer;

        Node(T val){
            data=val;
            pointer =null;
        }
    }
    Node head;
    Solution(){
        head=null;
    }
    public void addAtBeginning(T val){
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.pointer=head;
         head=newNode;
    }

    public void reverse(){
        Node temp=head;
        Node prev=null;
        Node next=head.pointer;
        // Node next=temp.pointer;

        while(temp!=null){
            // temp=temp.pointer;
            next=temp.pointer;
            temp.pointer=prev;
            prev=temp;
            temp=next;
        }
        head=prev;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.pointer;
        }
    }
}


public class reverse {
    public static void main(String []args){
        Solution<Integer> sol=new Solution<Integer>();
        sol.addAtBeginning(5);
        sol.addAtBeginning(4);
        sol.addAtBeginning(3);
        sol.addAtBeginning(2);
        sol.addAtBeginning(1);
        sol.display();
        System.out.println();
        sol.reverse();
        sol.display();
    }
}