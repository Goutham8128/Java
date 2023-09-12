public class WhilePrac {
    public static void main(String args[]){
        int evenCount=0;
        int oddCount=0;
        int number=4;
        int finishNumber=20;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                oddCount++;
                continue;

            }
            System.out.println("Even number"+number);
            evenCount++;
        }
        System.out.println("even count is "+ evenCount);
        System.out.println("odd count is "+ oddCount);

    }
    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;

        }
        else{
            return false;
        }

    }


}
