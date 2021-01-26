package com.bryanchontasi;

/**
 * @author Bryan Chontasi
 * @created 25/01/2021 -  23:41
 * @project SetsAndHashSet
 */
public class Planet  extends HeavenlyBody{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }


    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getKey().getBodyType() == BodyTypes.MOON){
            return super.addSatellite(moon);
        }else {
            return  false;
        }
    }
}
