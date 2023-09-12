import java.util.Arrays;
import java.util.Scanner;

public class Exercise83 {
    /*multiply the corresponding elements of two integer arrays.*/
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size1: ");
        int arr1size= scanner.nextInt();
        System.out.println("Enter array size2: ");
        int arr2size= scanner.nextInt();
        int[] arr1=new int[arr1size];
        int[] arr2=new int[arr2size];
        //int[][] product=new int[arr1size][arr2size];
        for(int i=0; i<arr1size; i++) {
            arr1[i] = scanner.nextInt();
        }
       for(int j=0;j<arr2size;j++){
            arr2[j] = scanner.nextInt();
        }
       for(int i=0;i<arr1size;i++){
           System.out.println(arr1[i]*arr2[i]);

       }
        //System.out.println(Arrays.toString(arr1));
        //System.out.println(Arrays.toString(arr2));



    }
}
