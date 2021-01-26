package com.bryanchontasi;

import com.sun.jdi.PrimitiveValue;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Bryan Chontasi
 * @created 20/01/2021 -  19:31
 * @project SetsAndHashSet
 */
public abstract class HeavenlyBody { //no final any more so we can do a subclass
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    //Modify the previous HeavenlyBody example so that the HeavenlyBody
    //        class also has a "bodyType" field. This field will store the
    //        type of HeavenlyBody (such as STAR, PLANET, MOON, etc).


    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
//      replace name and bodyType by using key
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }


    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    // There is a restriction that the only satellites that planets can have must
    //        be moons.
    public boolean addSatellite(HeavenlyBody moon){
            return  this.satellites.add(moon);
    }


    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites) ;
    }



    //  a.equals(b) must return the same result as b.equals(a) - equals is symmetric.
    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyType){
        return new Key (name, bodyType);
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    //This is much easier to implement for the Set than it is for the Map,
    //        because the Map will need a key that uses both fields.
    public static final class Key{
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType){
            this.name = name;
            this.bodyType= bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if (this.name.equals(key.getName())){
                return (this.bodyType == key.getBodyType());
            }
            return  false;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}

