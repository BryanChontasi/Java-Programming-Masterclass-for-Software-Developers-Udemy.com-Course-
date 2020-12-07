public class Main {
    public static void main(String[] args) {
        /*
        * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
        *
        * The method needs to find the first and the last digit of the parameter number passed to
        * the method, using a loop and return the sum of the first and the last digit of that number.
        *
        * If the number is negative then the method needs to return -1 to indicate an invalid value.
        *
        * Bryan Chontasi 03/12/2020
        * */


        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(252)); //expected output 4
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(257)); //expected output 9
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(0));   //expected output 0
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5));   //expected output 10
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-10)); //expected output -1

    }
}
