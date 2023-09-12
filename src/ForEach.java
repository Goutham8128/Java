import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args){
        //String[] animals={"avc","sds","sdsd"};
        ArrayList<String> animals=new ArrayList<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("cat");

        for(String i:animals){
            System.out.println(i);
        }
    }
}
