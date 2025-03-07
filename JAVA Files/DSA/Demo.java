package DSA;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        // int [] arr={1,12,2,13,3,13,4,14};
        // System.out.println(LinearSearch.search(arr, 3));
        // int [][] twoDarr={
        //     {1,12,2,13},
        //     {3,13,4,14},
        //     {5,15,6,16,7,17}
        // };
        // int []result=LinearSearch.search(twoDarr, 7);
        // System.out.println(Arrays.toString(result));

        int [] Binarr={1,12,2,13,3,13,4,14,5,15,6,16,7,17,8,18};
        int bin[]=Binarr.clone();
        Arrays.sort(bin);
        int j=0;
        int[]Bina=new int[bin.length];
        for(int i=bin.length-1;i>=0;i--){
            Bina[j++]=bin[i];
        }
        System.out.println("Ascending order "+ Arrays.toString(bin));
        System.out.println("Descending order "+Arrays.toString(Bina));
        System.out.println(BinarySearch.search(bin, 17));
        System.out.println(BinarySearch.reversesearch(Bina, 17));
    }
}
