public class LangPrac extends Object {
    public static void main(String [] args){
        Student max= new Student("Goutham",29);
        System.out.println(max);
    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}