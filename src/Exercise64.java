import java.util.Scanner;

//Program to reverse a word

public class Exercise64 {
    public static void main(String[] args){
        String revstr="";
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input the String: ");
        String response= scanner.nextLine();
        //System.out.println(response.length());
        for(int i=response.length()-1;i>=0;i--){
            char ch= response.charAt(i);
            System.out.println(ch);
            revstr=revstr+ch;
        }

        System.out.println("reversed word is: "+revstr);



    }
}

