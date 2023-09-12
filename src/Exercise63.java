import java.util.Scanner;

public class Exercise63 {
    public static void main(String[] args) {
        /*Java program that accepts two integer values from the user and returns the largest valueHowever if the two
        values are the same, return 0 and find the smallest value if the two values have the same
         remainder when divided by 6. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value one:  ");
        int response1 = scanner.nextInt();
        System.out.println("Enter value two: ");
        int response2 = scanner.nextInt();
        System.out.println("Result is: "+result(response1, response2));
    }
    public static int result(int x, int y)
    {
        if(x==y)
            return 0;
            if(x%6 == y%6)
                return (x<y)? x:y;
            return (x>y)? x:y;


    }

}