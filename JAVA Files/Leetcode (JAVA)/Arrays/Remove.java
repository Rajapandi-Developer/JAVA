package Leetcode.Arrays;

public class Remove {
    public static int removeElement(int n[],int k){
        int m[]=new int[n.length];
        int count =0;
        for(int i=0;i<n.length;i++){
            if(n[i]!=k){
             m[i]=n[i];
             count++;
            System.out.print(m[i]+" ");
            }
        }
        System.out.println();
    return count;
    }
    public static void main(String[] args) {
        int n[]={0,1,2,2,3,0,4,2};
        int k=2;
        System.out.println("After Removed Array the length is "+removeElement(n,k));
    }
}
