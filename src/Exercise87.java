import java.util.Scanner;

public class Exercise87 {
    public static void main(String[] args){
        /*
        reads an integer and calculates the sum of its digits and
        writes the number of each digit of the sum in English.
         */
        int num,digit,sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the integer: ");
        num= scanner.nextInt();
        while(num!=0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;

        }
        System.out.println(sum);



    }
}
