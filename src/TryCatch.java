import java.sql.SQLOutput;

public class TryCatch {
    public static void main(String args[]){
        int i=0;
        int j =0;
        try
        {
            j = 18 / i;
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println("i" );
        System.out.println(j);
        System.out.println("Solve try catch");
    }
}
