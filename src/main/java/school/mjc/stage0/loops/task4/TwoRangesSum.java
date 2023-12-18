package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int countedSum = 0;
        int skippedSum = 0;
        String countedMessage ;
        String skippedMessage ;

        if(numberToSkip > lastInRow){
            countedMessage = "number to skip is bigger then the last";
        } else if (lastInRow < 0) {
            countedMessage = "last number in row is negative";
        } else {
            for (int i = 1; i <= lastInRow; i++) {
                if (i <= numberToSkip) {
                    skippedSum +=i;
                }else{
                    countedSum += i;
                }
            }

            countedMessage = "counted sum is " +countedSum;
            skippedMessage = "skipped sum is " + skippedSum;

            System.out.println(skippedMessage);
        }

        System.out.println(countedMessage);
    }
}
