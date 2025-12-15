package Kunal_KushwahaArrStr;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray2D3D {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9

         */
        //int [][] arr=new int[3][3]; (its not mandatory to specify column size in the 2D Array
        Scanner input = new Scanner(System.in);
        /*
        int arr[][] = {
                {1, 2, 3}, //0th index
                {4, 5},    //1st index
                {6, 7, 8, 9} //2nd index ->arr2D[2]={6,7,8,9}
        };
        */
        int arr[][] = new int[3][3];
        System.out.println(arr.length);//number of rows
        //Taking input in 2d Array
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++) { //every array at that row
                arr[row][col] = input.nextInt();
                //System.out.println("enter the row");
            }

        }
        //output
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            /*
            for (int col = 0; col <arr[row].length ; col++) { //every array at that row

                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();

        }

             */
            System.out.println(Arrays.toString(arr[row])); //easily remove on loop


        }

        //Ihhanced for loop
        /*
        for(int [] a : arr){
            System.out.println(Arrays.toString(a));
        }


         */

    }

}
