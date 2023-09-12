import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Random;

public class ArrayPrac {
    public static void main(String[] args){
        /*
        Java program to sort list of integers in descending order
         */
        int[] generatedarray= getRandom(10);
        System.out.println(Arrays.toString(generatedarray));

    }

    public static int[] getRandom(int len){
        Random random=new Random();
        int[] array=new int[len];
        for(int i=0; i<len; i++){
            array[i]= random.nextInt(120);
        }
        return array;

    }
    private static int[] sortIntegersManually(int[] newArray){
            int[] sortedArray=Arrays.copyOf(newArray,newArray.length);
            return sortedArray;


    }
}