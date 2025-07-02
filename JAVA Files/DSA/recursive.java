// By iterative method O(n)
// public class recursive {
//     public static void fibo(int n){
//         int n1=0;
//         int n2=1;
//         for(int i=0;i<n;i++){
//             System.out.print(n1+" ");
//             int n3=n1+n2;
//             n1=n2;
//             n2=n3;
//         }
        
//     }
//     public static void main(String[] args) {
//         int n=10;
//         fibo(n);
//     }
// }

// By recursive method O(2n)

public class recursive{

    public static int fib(int n){
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int N=10;
        for(int i=0;i<N;i++){
            System.out.print(fib(i)+" ");
        }
    }
}