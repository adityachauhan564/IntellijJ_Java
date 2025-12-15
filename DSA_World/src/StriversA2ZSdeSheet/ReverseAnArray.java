package StriversA2ZSdeSheet;

public class ReverseAnArray {
    /*
    Example 1:
      Input: N = 5, arr[] = {5,4,3,2,1}
      Output: {1,2,3,4,5}
     */
    static void printArray(int ans[], int n){
        System.out.println("Reversed of an array is: \n");
        for (int i=0;i<n;i++){
            System.out.print(ans[i]);
        }
    }
    static void reverseArray(int arr[], int n){
        int [] ans=new int[n];
        for (int i=n-1;i>=0;i--){
            ans[n-i-1]=arr[i];
        }
        printArray(ans , n);
    }

    public static void main(String[] args) {
        int n=5;
        int [] arr={5,4,3,2,1};
        reverseArray(arr,n);
    }

}
