public class Main {
    public static void main(String[] args) {
        /*
        * Write a method named getEvenDigitSum with one parameter of type int called number.
        * The method should return the sum of the even digits within the number.
        * If the number is negative, the method should return -1 to indicate an invalid value.
        *
        * Bryan Chontasi 03/12/2020
        * */
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789)); //Expected output 20
        System.out.println(EvenDigitSum.getEvenDigitSum(252));      //Expected output 4
        System.out.println(EvenDigitSum.getEvenDigitSum(-22));      //Expected output -1

    }
}
