import java.util.Arrays;
import java.util.Scanner;

public class Exercise77 {
    public static void main(String[] args){
        /*S


        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num= scanner.nextInt();

        System.out.println("Enter the elements of array:");
        int[] array=new int[num];

        for(int i=0;i<num;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Original array: "+ Arrays.toString(array));
        System.out.println();



    }
}
