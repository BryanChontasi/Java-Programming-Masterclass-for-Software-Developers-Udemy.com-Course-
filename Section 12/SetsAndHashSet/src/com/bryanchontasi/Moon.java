package com.bryanchontasi;

/**
 * @author Bryan Chontasi
 * @created 25/01/2021 -  23:44
 * @project SetsAndHashSet
 */

//subclass
public class Moon extends  HeavenlyBody {
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
