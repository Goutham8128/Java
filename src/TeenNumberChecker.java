public class TeenNumberChecker {
    public static void main(String args[]){
        System.out.println(hasTeen(11,23,23));

    }
    public static boolean hasTeen(int x,int y,int z){
        if((x<=13 || y>= 13 || z>=13) && (x<=19||y<=19)||z<=19){
            return true;
        }
        else
        {
            return false;
        }
    }

}