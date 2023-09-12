import java.util.Scanner;

public class Exercise71 {
    public static void main(String[] args) {

        /*
        Java program to test if 10 appears as the first or last element of an array of integers.
        The array length must be broader than or equal to 2.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Checking the array elements: ");
        int num = scanner.nextInt();
        int[] array = new int[10];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        int length= array.length;
        System.out.println(length);
        System.out.println("elements of the array are: ");
        for(int i=0;i<num;i++){
            System.out.println(array[i]);
            if((array[0]==10)||(array[length]==10))
            {
                System.out.println("true");
            }
        }



    }
}
