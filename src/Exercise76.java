import java.util.Scanner;
import java.util.Arrays;

public class Exercise76 {
    public static void main(String[] args) {
        /*
         rotate an array (length 3) of integers in the left direction.
        */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int num = scanner.nextInt();
        int[] array=new int[num];
        System.out.println("Enter the array elements");
        for(int i=0;i<num;i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        int[] rotatedarray={array[2],array[0],array[1]};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(rotatedarray));



        }




    }




