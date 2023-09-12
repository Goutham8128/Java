public class Meat {

    String choiceofmeat;
    int weightingrams;
    String typeofmeat;

    Meat(String choiceofmeat, int weightingrams){
        this.choiceofmeat=choiceofmeat;
        this.weightingrams=weightingrams;


    }



    Meat(String choiceofmeat, int weightingrams, String typeofmeat){
        this.choiceofmeat=choiceofmeat;
        this.weightingrams=weightingrams;
        this.typeofmeat=typeofmeat;

    }
    void pricebasedontype(){
        System.out.println(choiceofmeat + "and if it is" + typeofmeat + " is 20 dollars");

    }
    void pricebasedonweight(){
        System.out.println("The price of"+choiceofmeat + "of type" + typeofmeat+ "weighing"+ weightingrams +"is 20 dollars" );
    }


}
