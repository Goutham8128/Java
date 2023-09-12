public class Udemy1 {
    public static void main(String args[]){
        int score = 1000;
        int levelCompleted = 8;
        int existingBonus = 200;
        boolean gameOver = true;
        int finalScore;

        finalScore= score + (levelCompleted*existingBonus);
        System.out.println("your final score is "+ finalScore);


    }
}
