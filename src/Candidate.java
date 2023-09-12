public class Candidate{

    String name;
    int age;
    String streetname;

    Candidate(String name, int age, String streename){
        this.name=name;
        this.age=age;
        this.streetname=streename;
    }

    void mountains(){
        System.out.println(this.name + "loves mountains");

    }

    void beaches(){
        System.out.println(this.name + "is" + this.age +"and loves beaches");
    }
}