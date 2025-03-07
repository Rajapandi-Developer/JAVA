package Leetcode.Arrays;

public class Majority {
    public static int findMajority(int n[]){
        int count=0,candidate=-1;
        for(int num:n){
            if(count==0){
                candidate=num;
            }
            count+=(num==candidate)?1:-1;
        }
        count=0;
        for(int num:n){
            if(num==candidate)
                count++;
        }
        if(count>n.length/2){
            return candidate;
        }
        else
            return -1;
    }
    public static void main(String[] args) {
        int n[]={1,1,2,2,2,1,1};
        int m=findMajority(n);
        if(m!=-1){
            System.out.println("the Majority number is "+m);
        }
        else
            System.out.println("no Majority in your Array");
    }
    
}