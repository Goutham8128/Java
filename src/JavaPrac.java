
import java.util.Scanner;

public class JavaPrac {
    public static void main(String[] args ){
        System.out.println("Program that no as input and prints multiplication table upto 10");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no here and its table is as follows: ");
        int num= scanner.nextInt();
        int i=0;
        for(i= 1;i<11;i++){
            System.out.println("8"+"*" +i +"="+ (num*i));
        }

    }
}