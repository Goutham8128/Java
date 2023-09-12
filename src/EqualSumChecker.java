public class EqualSumChecker {

    public static void main(String args[]){
        System.out.println(hasEqualSum(2,3,5));

    }

    public static boolean hasEqualSum(int x, int y, int z){
        if(x+y == z){
            return true;
        }
        else{
            return false;
        }
    }

}