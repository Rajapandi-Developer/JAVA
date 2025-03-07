
import java.util.Scanner;

class Identifier{
    class Node{
        int data;
        Node next;
        Node(int user){
            data=user;
            next=null;
        }
    }
        Node head;

     Identifier(){
        head=null;
    }
    public void addAtBegin(int user) {
        Node node=new Node(user);
        node.next=head;
        head=node;
        }  
     
    // public void commoner(){
    //     Node temp=head;
    //     Node jump=head.next;
    //     while(temp!=null && jump!=null){
    //         int mid;
    //         if(temp.data>jump.data ){
    //             for(int i=1;i<=temp.data;i++){
    //                 if(jump.data*i==temp.data){
    //                     if(temp.data%jump.data==0)
    //                          mid=jump.data;
    //                     else
    //                          mid=i;
    //                     insertInBetween(mid,jump,temp);
    //                 }
    //                 if(jump.data*i>temp.data ){
    //                     jump.data--;
    //                     i=1;
    //                 }
    //             }
    //         }
    //         else if(temp.data<jump.data){
    //             for(int i=1;i<=jump.data;i++){
    //                 if(temp.data*i==jump.data ){
    //                     if(jump.data%temp.data==0)
    //                          mid=temp.data;
    //                     else
    //                          mid=i;
    //                     insertInBetween(mid,jump,temp);
    //                 }
    //                 if(temp.data*i>jump.data){
    //                     temp.data--;
    //                     i=1;
    //                 }
    //                     // return i; 
    //             }
    //         }
    //         // else{}
    //             // return temp.data;
    //             temp=temp.next.next;
    //             jump=temp.next;
    //         }  
    //     }

        public void commoner(){
            Node temp=head;
                while(temp!=null && temp.next!=null){
                    Node jump=temp.next;
                        int mid=minimum(temp.data, jump.data);
                    if(mid>=1){
                        insertInBetween(mid, temp);
                        temp=temp.next;
                    }
                    temp=temp.next;  
                }
        }
    
        public int minimum(int t, int j){
            int min=Math.min(t, j);
            for(int i=min;i>0;i--){
                if(j%i==0 && t%i==0)
                    return i;
            }
            return 1;
        }
    public void insertInBetween( int mid, Node temp){
                Node insert=new Node(mid);
                insert.next=temp.next;
                temp.next=insert;
        }
    public void display(){
        Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
        }
        System.out.println();
    }
 }
        public class commonDivisor {
            public static void main(String[] args) {
                Scanner sr=new Scanner(System.in);
                Identifier iden=new Identifier();
                while(true){
                    System.out.print("Value to be ");
                    int user=sr.nextInt();
                    if(user==0)
                        break;
                    iden.addAtBegin(user);
                }
                iden.display();
                iden.commoner();
                iden.display();
                sr.close();
    }
}
