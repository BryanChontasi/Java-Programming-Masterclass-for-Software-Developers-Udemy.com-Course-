package com.bryanchontasi._static;

/**
 * @author Bryan Chontasi
 * @created 04/01/2021 -  23:05
 * @project Static
 */
public class Main {
    //to use in  multiply method
    public static int multiplier = 7;

    public static void main(String[] args) {
        System.out.println("--------Static instances example--------------");

        StaticTest firstInstance = new StaticTest("1st instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3rd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());


        System.out.println("--------Static multiplier example--------------");

        int answer = multiply(6);
        System.out.println("The answer is: " + answer);

    }
    //method to do the multiplication
    public static int multiply(int number){
        return number * multiplier;
    }
}
