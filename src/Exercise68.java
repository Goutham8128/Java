import java.util.Scanner;

public class Exercise68 {
    public static void main(String[] args){
        /*
        create another string of 4 copies of the last 3 characters of the original string.
         The original string length must be 3 and above.
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        if(str.length() >= 3){
            for(int i=0; i<4;i++){
                System.out.println((str.substring(str.length()-3)));
            }



        }


    }
}
