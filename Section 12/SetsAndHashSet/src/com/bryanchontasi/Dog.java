package com.bryanchontasi;

/**
 * @author Bryan Chontasi
 * @created 21/01/2021 -  00:31
 * @project SetsAndHashSet
 */
public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Dog){
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);
        }

        return false;
    }
}
