// import java.util.Arrays;

class Array{
    int size;
    static final int initialCapacity=4;
    int arr[]=new int [initialCapacity];
    // int Capacity;

    Array(){
        size=-1;
    }

    public void push(int value){
        if(size==initialCapacity-1)
            throw new IndexOutOfBoundsException("array is overflow");
            
        arr[++size]=value;
    }

    public int pop(){
        if(size==-1)
            throw new IndexOutOfBoundsException("aray is underflow");

        return arr[size--];
    }

    public int peek(){
        return arr[size];
    }
    public void display(){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
public class Stack {

    public static void main(String[] args) {
        Array  array=new Array();
        array.push(1);
        System.out.println("hi");
        array.push(2);
        // array.push(3);
        array.push(3);
        array.push(4);
        // array.display();
        System.out.println(array.peek()+" is peeked");
        System.out.println(array.peek()+" is peeked");
        System.out.println(array.pop()+" is popped");
        System.out.println(array.pop()+" is popped");
        array.display();

    }
}