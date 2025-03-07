import java.util.Scanner;

class Find{
    class Node{
        int data;
        Node next;

        Node(int val){
            data=val;
            next=null;
        }
    }

    Node head;
    Find(){
        head=null;
    }

    public void addAtBegin(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
    }
    public void middleFinder(int user, int count){
        System.out.println("This is our Middle Node ");
            Node temp=head;
            int value=0;
            if(count%2!=0){
                count=Math.round(count/2);
            }
            else{
                count=(count/2);
            }
            while(value!=count){
                    temp=temp.next;
                    value++;
            }
             System.out.print(temp.data);
        
        System.out.println();
}
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class FindMiddle {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.print("Number of data to be ");
        int user=sr.nextInt();
        Find find=new Find();
        int count=0;
        while(user!=0){
        find.addAtBegin(user);
            user--;
            count++;
        }
        System.out.println("count is " + count);
        System.out.println("Here is our complete NodeList: ");
        find.display();
        System.out.println();
        find.middleFinder(user,count);
        sr.close();
    }
}
