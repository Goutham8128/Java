public class DemoCalc {
    public static void main(String args[]){
        CalcMethods obj = new CalcMethods();

        int r1=obj.add(2,3);
        int r2=obj.sub(6,3);
        int r3=obj.mul(3,7);
        float r4=obj.div(9,10);

        System.out.println("addition result:"+ r1 + " " + "subtraction result:"+ r2+ " " + "Product:" + r3 +
                " " +"quotient:"+r4);
    }
}
