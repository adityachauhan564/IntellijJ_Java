package Recursion_By_Kunal_Kushwaha;

public class Fibonacci_Series {
    public static void main(String[] args) {
        System.out.println(fibo(6));
        //fibo(6);
    }
    static int  fibo(int n){
        //base condition
        if (n<2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);

    }
}
