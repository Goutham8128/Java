import java.util.Scanner;

public class Exercise75 {
    public static void main(String[] args) {

        /*
         test if the first and last elements of an array of integers are the same.
         The array length must be broader than or equal to 2.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int num = scanner.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(arr.length > 2 && arr[0] == arr[arr.length - 1]);

    }
}






