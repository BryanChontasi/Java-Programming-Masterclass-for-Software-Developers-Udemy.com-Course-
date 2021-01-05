package com.bryanchontasi._finalAndStatic;

/**
 * @author Bryan Chontasi
 * @created 05/01/2021 -  14:45
 * @project FinalAndStaticInitializers
 */
public class SIBTest {

    public static final String owner;

    static {
        owner = "tim";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
