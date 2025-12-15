package StriversA2ZSdeSheet;

public class ArrayLeftRotateByOne {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};
        int n=arr.length;
        leftRotateByOne(arr,n);
    }

     static void leftRotateByOne(int[] arr, int n) {
        int temp=arr[0]; //stored first element into variable
         for (int i = 0; i <n-1 ; i++) {
             arr[i]=arr[i+1];
         }
         arr[n-1]=temp;
         for (int i = 0; i <n ; i++) {
             System.out.print(arr[i]+" ");
         }

    }
}
