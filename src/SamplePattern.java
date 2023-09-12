import java.util.Scanner;

public class SamplePattern {
    public static void main(String[] args){

        /*
        Write a Java program to accept an integer and count the factors of the number.
         */
        int integer,count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        integer= scanner.nextInt();

        for(int i=1; i<=integer; i++){
            if(integer%i==0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("The no of factors are:"+count);
        }



    }
