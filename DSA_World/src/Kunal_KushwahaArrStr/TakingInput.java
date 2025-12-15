package Kunal_KushwahaArrStr;

import java.util.Arrays;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Array of primitives
        /*
        int [] arr= new int[5];
        arr[0]=5;
        arr[1]=7;
        arr[2]=11;
        arr[3]=44;
        arr[4]=46;
        //[5,7,11,44,46]
        System.out.println(arr[3]);

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int j : arr) { //for every element in array, print the element
            System.out.println(j);//here j represents the element of the array
        }

        //Using Arrays.tooString Method
        System.out.println(Arrays.toString(arr));
*/
        //Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
