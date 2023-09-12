import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
       System.out.println("Printing the array");
        int[] unSortedArray=getIntegers(3);
        System.out.println("Printing unsorted Array" + Arrays.toString(unSortedArray));
        int[] sortedArray=sortIntegers(unSortedArray);
        System.out.println("Printing SortedArray"+ Arrays.toString(sortedArray));
        printArray(unSortedArray);
    }

    public static int[] getIntegers(int arraySize){
        Scanner scanner=new Scanner(System.in);
        int[] array= new int[arraySize];
        for(int i=0; i< arraySize; i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }
    public static int[] sortIntegers(int[] arr){

        int temp = 0;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j < (arr.length-i); j++){
                if(arr[j-1] < arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }
    public static void printArray(int[] unSortedArray){
        for(int i=0;i<unSortedArray.length;i++){
            System.out.println("Element " + i +" contents "+unSortedArray[i]);
        }
    }
}
