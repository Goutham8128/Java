import java.util.Scanner;

public class scanandcompare {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Upon pressing q or Q you lose the game");
        System.out.println("Press any key: ");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")) {
            System.out.println("LOST");
        }
            else
            {
                System.out.println("Resume the game");

            }
        }

}
