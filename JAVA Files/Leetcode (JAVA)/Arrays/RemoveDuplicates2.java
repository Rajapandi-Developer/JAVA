package Leetcode.Arrays;

class Solve2{
    public int removeDuplicates2(int nums[]){
        int index=0;
        for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[index]){
                    index++;
                    nums[index]=nums[i];
                }
                for(int j=i;j<nums.length;j++){
                    if(nums[j]!=nums[index]){
                        index++;
                        nums[index]=nums[j];
                        break;
                    }
                    i=j;
            }
        }
        return index;
    }
}
public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,1,2,3,3};
        Solve2 sol2=new Solve2();
       int newLength= sol2.removeDuplicates2(nums);
       int k=0;
       System.out.print("Double Values of Arrays are ");
       for(int i=0;i<newLength;i++){
            System.out.print(nums[i]+" ");
            k++;
       }
       System.out.println();
       System.out.print("The Total Length of Double Array is "+k);
    }
}
