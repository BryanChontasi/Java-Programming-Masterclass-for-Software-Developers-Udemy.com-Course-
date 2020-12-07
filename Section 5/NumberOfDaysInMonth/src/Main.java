public class Main {
    public static void main(String[] args) {
        /*
        * Number Of Days In Month Write a method isLeapYear with a parameter of type int named year.
        * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
        * If the parameter is not in that range return false.
        * Otherwise, it it is in the valid range, calculate if the year is a leap year and return true if it is,
        * otherwise return false.
        * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
        *
        * NOTE: The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method.
        * You can use that solution if you wish.
        * Write another method getDaysInMonth with two parameters month and year. Both of type int.
        * If parameter month is <1 or > 12 return -1
        * If parameter year is <1 or > 9999 then return -1.
        *
        * This method needs to return the number of days in the month. Be careful about leap years they have 29 days
        * in month 2 (February).
        *
        * You should check if the year is a leap year using the method isLeapYear described above
        *
        * Bryan Chontasi 02/12/2020
        */
        //test isLeapYear method
        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600)); //false
        System.out.println(NumberOfDaysInMonth.isLeapYear(1600)); //true
        System.out.println(NumberOfDaysInMonth.isLeapYear(2017)); //false
        System.out.println(NumberOfDaysInMonth.isLeapYear(2000)); //true

        //test getDaysInMonth method
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020)); //31
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020)); //29
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018)); //28
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020)); //-1
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020)); //-1
    }
}
