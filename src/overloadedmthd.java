public class overloadedmthd {
    public static void main(String args[]){
        double x= add(1.0,3.0,4.0,5.0);
        int  y= add(1,2);
        System.out.println(x);
        System.out.println(y);

    }
    static int add(int a, int b){
        System.out.println("This is overloaded method #1");
        return a+b;
    }
    static int add(int a ,int b , int c){
        System.out.println("This is overloaded method #2");
        return a+b+c;
    }
    static double add(double a, double b,double c,double d){
        System.out.println("THis is overloaded method #3");
        return a+b+c+d;

    }

}
