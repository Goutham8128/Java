public class Real2 {
    public static void main(String[] args){
        Real real= new Real();
        real.setMake("Hyundai");
        real.setModel("Sonata");
        real.setDoors(2);
        real.setConvertible(true);


        System.out.println("make= " + real.getMake());
        System.out.println("model= "+ real.getModel());

        real.describeCar();


    }
}
