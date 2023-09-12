public class BarkingDog {
    public static void main(String args[]){

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking == true && hourOfDay<8 || hourOfDay > 22)
        {
            return true;
        }
        else{
            return false;
        }
    }
}