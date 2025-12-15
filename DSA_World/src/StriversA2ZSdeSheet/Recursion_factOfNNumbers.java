package StriversA2ZSdeSheet;

public class Recursion_factOfNNumbers {
    //factorial of 5=>5+4*3*2*1==120

    public static void main(String[] args) {
        System.out.println(factOfNNumbers(10));
    }
    static int factOfNNumbers(int n){
        //base case
        if(n==0){
            return 1;
        }
        // important **
        return n*factOfNNumbers(n-1);
    }
}
