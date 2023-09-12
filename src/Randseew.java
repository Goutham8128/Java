public class Randseew {
    public static void main(String[] args){
        System.out.println("");
        Randseew obj= new Randseew();
        obj.printDetails("Goutham",29,"goutham.ngs@gmail.com","200 S BOnnie Brae St");

    }
    void printDetails(String name,int age,String emailID,String address){
        System.out.println("Address of "+name+"is"+address+"and his age is"+age+"email ID is "+emailID);
    }

}
