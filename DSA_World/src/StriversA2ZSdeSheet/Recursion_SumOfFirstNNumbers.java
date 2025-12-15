package StriversA2ZSdeSheet;

public class Recursion_SumOfFirstNNumbers {
    //sum of first N numbers
    // 1+2+3+4+5+6
    public static void main(String[] args) {
        int i=1;
        System.out.println(printSumOfN(20));
    }
    static int printSumOfN( int N){
        if(N==0){
            return 0;
        }
        return N + printSumOfN(N-1);

    }
}
