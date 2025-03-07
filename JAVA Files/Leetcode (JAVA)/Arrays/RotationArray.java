package Leetcode.Arrays;
class ArrayRotation{
    public void positionChange(int n[],int k){
        int f=n.length-1;
       int j=0;
       int m=0;
       while(j<k){
            for(int i=f;i>=0;i--){
                if(i==f){
                     m=n[f];
                    n[f]=0;
                }
                else
                    n[i+1]=n[i];
            }
            n[0]=m;
            j++;
        }
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
    }
    }
}
public class RotationArray {
    public static void main(String[]args){
        int n[]={1,2,3,4,5,6,7};
        int k=3;
        ArrayRotation arr=new ArrayRotation();
        arr.positionChange(n,k);
    }
}
