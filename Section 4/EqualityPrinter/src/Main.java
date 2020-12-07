public class Main {
    public static void main(String[] args) {
    /*
    * Write a method printEqual with 3 parameters of type int
    * the method should not return anything (void).
    * If one of the parameters is less than 0, print text "Invalid Value".
    * If all numbers are equal print text "all numbers are equal"
    * If all numbers are different print text "All numbers are different".
    * Otherwise, print "neither all are equal or different.
    *
    * Bryan Chontasi 30/11/2020
    *  */

        IntEqualityPrinter.printEqual(1,1,1);
        IntEqualityPrinter.printEqual(1,1,2);
        IntEqualityPrinter.printEqual(-1,-1,-1);
        IntEqualityPrinter.printEqual(1,2,3);
    }
}
