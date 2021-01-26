package com.bryanchontasi;

/**
 * @author Bryan Chontasi
 * @created 25/01/2021 -  23:43
 * @project SetsAndHashSet
 */

//subclass
public class DwardPlanet  extends HeavenlyBody{
    public DwardPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod,BodyTypes.DWARF_PLANET );
    }
}
