public class Objectprac {
    public static void main(String args[]){
        Residence myres = new Residence();
        
        Objectprac newres=new Objectprac();
        //System.out.println(myres.communityname+myres.streename+" "+myres.zipcode);
        myres.name();
        myres.addresss();
        newres.name();
    }

    private void name() {
        System.out.println("hello");
    }


}
