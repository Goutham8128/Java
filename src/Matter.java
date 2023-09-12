public class Matter{
    public static void main(String args[]){

        Position position1=new Position("Full Stack Java Developer");
        Position position2=new Position("Data Engineer");

        Company company=new Company();

        company.roleincompany(position1);
        company.roleincompany(position2);

    }
}