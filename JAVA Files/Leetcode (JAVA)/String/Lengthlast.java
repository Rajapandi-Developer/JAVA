package Leetcode.String;

public class Lengthlast {
    public static int lastWordLength(String s){
        int Length=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                Length++;   
            }
            else
                break;
        }
        return Length;
    }
    public static void main(String[] args) {
        System.out.print("Length of the Last Word is ");
        System.out.println(lastWordLength("Hello World"));
    }
}
