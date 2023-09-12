import java.util.Scanner;

public class Exercisev31 {
    public static void main(String[] args) {
        System.out.println("");
        /*
        Java program that accepts two integer values between 25 and 75 and returns true if there is a common digit
        in both numbers.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2: ");
        int num2 = scanner.nextInt();
        System.out.println("Result is " + compareNumbers(num1, num2));


    }

    public static boolean compareNumbers(int p, int q) {

        int num11digit = p / 10;
        int num12digit = p % 10;
        int num21digit = q / 10;
        int num22digit = q % 10;
        if (p > 25 && q < 75) {
            if ((num11digit == num21digit || num12digit == num22digit)) {
                return true;
            }
        }
        return false;


    }

}

