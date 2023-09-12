import java.util.Scanner;

public class Exercise60 {
    public static void main(String[] args){
        //Java program to find the penultimate (next to the last) word in a sentence.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Input a string: ");
        String response= scanner.nextLine();
        String[] splitwords= response.split(" ");
        int i=0;
        char c=splitwords[i].charAt(i);
        int length= splitwords.length;
        System.out.println(length);
        if(length>1) {
            System.out.println(splitwords[length - 2]);
        }


    }

}

