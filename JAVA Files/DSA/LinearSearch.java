public class LinearSearch {
    public static int search(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }

    public static int[] search(int [][]twoDarr, int target){
        for(int row=0;row<twoDarr.length;row++){
            for(int col=0;col<twoDarr[row].length;col++){
                if(twoDarr[row][col]==target)
                    return new int[] {row, col};
            }
        }
        return new int[] {-1, -1};
    }
}
