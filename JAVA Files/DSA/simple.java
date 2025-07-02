import java.util.Arrays;

public class simple {
    public static int majority(int nums[]){
        Arrays.sort(nums);
        int count=0;
        int prev_count=count;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                System.out.print(count+" ");
            }
            else if(nums[i]!=nums[i+1]){
                System.out.println();
                if(prev_count<count)
                    prev_count=count;
                    System.out.print(prev_count+" ");
                    count=0;
            }
            // count=0;
        }
       int r=0;
       for(int i=0;i<prev_count-1;i++){
           if(nums[i]==nums[i+1]){
                r=nums[i];
                // System.out.println(r);
          }
        }
      return r;
    }

    public static void main(String[] args) {
        int []nums = {3,3,4,4,4};
        System.out.println(majority(nums));
    }
}
