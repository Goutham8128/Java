import java.util.Scanner;

public class Exercise67 {
    public static void main(String[] args){
        /*
        program to insert a word in the middle of another string.
         Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python Tutorial 3.0.
         */
        String main_string= "Python 3.0";
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = scanner.nextLine();
        System.out.println(main_string.substring(0,6)+" "+ word + " " +main_string.substring(7));

    }
}
