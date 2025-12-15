package StriversA2ZSdeSheet;

public class Sorting_Selection {
    //selection sort  {13,46,24,52,20,9}
     static void selectionSort(int [] arr){
        int n=arr.length;
        //System.out.println("Before Selection Sort");
        for (int i=0;i<n;i++){
            int min_index=i; // finding the minimum element in unsorted array
            for (int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                  min_index=j;
                }
            }
            //swap the found minimum element with first element
            swap(arr, min_index, i);
        }
    }
     static void swap(int []arr, int min_index, int i){
        //int[] arr;
        int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
    }
    static void printSortedArr(int[] arr){
        System.out.println("After Selection Sort");
        for (int a = 0; a < arr.length; a++) {
            System.out.print(" "+arr[a]);
        }
    }

    public static void main(String[] args) {
        int [] arr={64,25,12,22,11};
        //int n=arr.length;

        selectionSort(arr);
        printSortedArr(arr);

    }

}
