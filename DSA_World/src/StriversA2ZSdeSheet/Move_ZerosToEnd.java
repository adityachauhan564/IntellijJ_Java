package StriversA2ZSdeSheet;

import java.util.ArrayList;

//bruteForceSolution
public class Move_ZerosToEnd {

    public static int[] moveZeros(int n, int [] arr){
        ArrayList<Integer> temp=new ArrayList<>(); //temp array
        //copy non-zero element to temp
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        int nz=temp.size();
        //copy element from temp to original array
        for (int i = 0; i < nz; i++) {
            arr[i]=temp.get(i);
        }
        for (int i = nz; i < n; i++) {
            arr[i]=0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println(" ");
    }
}