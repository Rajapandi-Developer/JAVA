import java.util.Scanner;

class DynamicArray{
    static final private int initialCapacity=4;
    private int capacity=initialCapacity;
    private int arr[];
    private int size;

    DynamicArray(){
        size=0;
        arr=new int[capacity];
    }

    public void addAtEnd(int value){
        if(size==capacity)
            expand();
        arr[size++]=value;
    }

    private void expand(){
        capacity*=2;
        arr=java.util.Arrays.copyOf(arr, capacity);
    }

    public void specipos(int index, int value){
        if(size==capacity)
        expand();
        for(int i=size-1;i>=index;i--){
            arr[i+1]=arr[i];
        arr[index]=value;
        size++;
        }
    }

    public void deletepos(int index){
        for(int i=index+1;i<size;i--){
            arr[i-1]=arr[i];
        size--;
        if(capacity>initialCapacity && capacity>3*size)
        shrinkArray();
        }
    }

    private void shrinkArray(){
        capacity/=2;
        arr=java.util.Arrays.copyOf(arr,capacity);
    }
    public void display(){
        for (int n:arr){
           System.out.print(n+" ");
        }
    }
}

public class UsingList_1 {

    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        DynamicArray dyarr=new DynamicArray();
        while (true) {
        System.out.println("-------------Dynamic Array Objectives----------");
        System.out.println("1) Insert at the End");
        System.out.println();
        System.out.println("2)Insert at Specific position ");
        System.out.println("3)Delete at Specific position ");
        System.out.println("Enter your Choice ");
        int choice=sr.nextInt();
        System.out.println();

            switch (choice){
                case 1:
                    System.out.println("Enter your Value ");
                    int value=sr.nextInt();
                    dyarr.addAtEnd(value);
                    dyarr.display();
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter your Index");
                    int index=sr.nextInt();
                    System.out.println("Enter your Value");
                    int value1=sr.nextInt();
                    dyarr.specipos( index, value1);
                    dyarr.display();
                    break;
                case 3:
                    System.out.println("Enter your Index");
                    int index1=sr.nextInt();
                    dyarr.deletepos(index1);
                    dyarr.display();
                    break;
                default:
                    System.out.println("you're exit now");
                    sr.close();
            }

         }
    }    
}