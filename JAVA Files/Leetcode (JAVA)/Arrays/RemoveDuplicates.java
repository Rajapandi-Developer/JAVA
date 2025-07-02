package Leetcode.Arrays;
class Solve{
    public int removeDupes(int n[]){
        int index=0;
        for(int i=1;i<n.length;i++){
            if(n[i]!=n[index]){
                index++;
                n[index]=n[i];
            }
        }
        return index+1;
    }
}
public class RemoveDuplicates{
    public static void main(String[]args){
        int n[]={0,0,1,1,1,2,2,3,3,4};
        Solve sol=new Solve();
        int newLength=sol.removeDupes(n);
        int count=0;
        System.out.print("Unique Arrays are [ ");
        for(int i=0;i<newLength;i++){
            System.out.print(n[i]+", ");
            count++;
        }
        System.out.print("]");
        System.out.println();
        System.out.print("Unique Array counts are "+count);
    }
}