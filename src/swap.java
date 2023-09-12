public class swap {
    public static void main(String args[]){
        int x=10;
        int y=20;
        int temp;

        temp = x;
        x=y;
        y = temp;

        System.out.println("The value of x is ," +x);
        System.out.println("The value of y is ," +y);
    }
}
