package Leetcode.Arrays;

class Quantity{
    public int numberofCandies(int rating[]){
        int candy=1;
        int l=rating.length;
        int index=0;
        int k=0;
        for(int i=1;i<l;i++){
            if(i==l-1){
                if(rating[i]>rating[i-1]){
                    k+=candy+1;
                    k++;
                }
                else if(rating[i]<rating[i-1]||rating[i]==rating[i-1]){
                    k+=candy;
                    k++;
                }
                break;
            }
            if(rating[index]>rating[i])
               k+= candy+1;
            //    k++;
               index++;
            if(rating[index]<rating[i])
               k+= candy;
            //    k++;
               index++;
        }
        // System.out.println(k);
         index=l-1;
        for(int i=index-1;i>=0;i--){
            if(i==0){
                if(rating[i]>rating[i+1]){
                    k+=candy+1;
                    k++;
                }
                else if(rating[i]<rating[i+1]||rating[i]==rating[i+1]){
                    k+=candy;
                    k++;
                }
                break;
            }
            if(rating[index]>rating[i])
               k+= candy+1;
            //    k++;
               index--;
            if(rating[index]<rating[i])
               k+= candy;
            //    k++;
               index--;
        }
        // System.out.println(k);
        int o=0;
        for(int i=0;i<l;i++){
            if(rating[i]==0)
                o= k+1;
            else
                o= k;
    }
    return o;
}
}
public class Candies {
    public static void main(String[] args) {
        int rating[]={1,2,2};
        Quantity Q=new Quantity();
        int s=Q.numberofCandies(rating);
        System.out.println("The Total Number of Candies  where Children Gets are "+s);
    }
}
