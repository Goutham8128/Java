import java.util.Locale;

public class Exercise58 {
    public static void main(String[] args){
        System.out.println("");

        String givenString="i am going to be a developer";
        String[] splitstring=givenString.split(" ");
        for(int i=0;i< splitstring.length;i++){
            char c=splitstring[i].charAt(0);
            String c1=String.valueOf(c).toUpperCase();
            String substring = splitstring[i].substring(1);
            System.out.print(c1+substring+ " ");

        }
    }
}
