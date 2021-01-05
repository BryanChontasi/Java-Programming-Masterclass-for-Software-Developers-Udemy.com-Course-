package com.bryanchontasi._finalAndStatic;

/**
 * @author Bryan Chontasi
 * @created 05/01/2021 -  14:31
 * @project FinalAndStaticInitializers
 */
public class Main {

    public static void main(String[] args) {

        //testing SomeClass instances
        System.out.println("---------SomeClass Test----------");
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());


        System.out.println("---------PI Test----------");

//        one.instanceNumber = 4;
        System.out.println(Math.PI);
//        Math m = new Math();

        System.out.println("---------Password Test----------");

        int pw = 674312; //new password
        Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312); //correct one


        System.out.println("---------SIB Test----------");
        System.out.println("Main method called");
        SIBTest test = new SIBTest();  //static code is called first
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}

