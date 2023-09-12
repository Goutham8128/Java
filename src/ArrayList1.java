import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> Inventory= new ArrayList();
         ArrayList<String> food = new ArrayList<String>();
         food.add("Pizza");
         food.add("Hamburger");
         food.add("zucchini");

         ArrayList<String> drinks=new ArrayList<String>();
         drinks.add("beer");
         drinks.add("whiskey");

         ArrayList<Integer> quantity=new ArrayList<Integer>();
         quantity.add(2);;
         quantity.add(5);

         Inventory.add(food);
         Inventory.add(drinks);
        System.out.println(Inventory);
    }



}
