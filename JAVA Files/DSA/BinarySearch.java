public class BinarySearch {
    public static int search(int [] Binarr, int target){
        int start=0;
        int end=Binarr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target>Binarr[mid])
                start=mid+1;
            else if(target<Binarr[mid])
                end=mid-1;
            else
                return mid;
        }
        return -1;
    }
    public static int reversesearch(int [] Binarr, int target){
        int start=0;
        int end=Binarr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target>Binarr[mid])
                end=mid-1;
            else if(target<Binarr[mid])
                 start=mid+1;
            else
                return mid;
        }
        return -1;
    }
}
