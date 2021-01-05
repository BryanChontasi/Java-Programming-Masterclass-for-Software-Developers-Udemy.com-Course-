package com.bryanchontasi._finalAndStatic;

/**
 * @author Bryan Chontasi
 * @created 05/01/2021 -  14:40
 * @project FinalAndStaticInitializers
 */
public class SomeClass {

    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;


    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
