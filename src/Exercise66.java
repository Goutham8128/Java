import java.util.Scanner;

public class Exercise66 {
    public static void main(String[] args){

        System.out.println("Plz enter the limit for the series: ");
        int sum=0;
        //int limit=0;
        Scanner scanner= new Scanner(System.in);
        int limit= scanner.nextInt();


        for(int i=2; i<=limit; i++){
            Boolean isPrime=true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }

            }
            if(isPrime){
                System.out.println(i+ " is a prime no");
                sum=sum+i;
            }

        }
        System.out.println("Sum of all prime numbers are "+sum);
    }
}
