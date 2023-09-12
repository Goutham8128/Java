public class LeapYear{
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(3.123,3.123));
    }


    public static boolean areEqualByThreeDecimalPlaces(Double x,Double y){
        x = x*1000;
        y = y*1000;
        int xx = x.intValue();;
        int yy = y.intValue();;
        if(xx == yy)
        {

            return true;
        }
        else{
            return false;
        }
    }

}