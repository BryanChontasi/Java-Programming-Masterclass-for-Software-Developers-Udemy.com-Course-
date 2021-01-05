package com.bryanchontasi._static;

/**
 * @author Bryan Chontasi
 * @created 04/01/2021 -  23:06
 * @project Static
 */
    public class StaticTest {
    //    private   int numInstances = 0;
    private static int numInstances = 0;

    private String name;

    public StaticTest( String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
