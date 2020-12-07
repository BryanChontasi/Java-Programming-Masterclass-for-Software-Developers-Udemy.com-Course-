public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int evenSum= 0;
        while ( number != 0){
            int newNumber = number % 10;
            if (newNumber % 2 == 0) {
                evenSum += newNumber;
            }
            number /= 10;
        }
        return  evenSum;
    }
}
