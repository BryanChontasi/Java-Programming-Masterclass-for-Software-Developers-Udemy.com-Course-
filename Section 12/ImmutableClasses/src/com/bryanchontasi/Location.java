package com.bryanchontasi;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bryan Chontasi
 * @created 15/01/2021 -  23:32
 * @project ImmutableClasses
 */
public class Location {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String,Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if(exits != null){
            this.exits = new HashMap<String,Integer>(exits);  //once instance has been created it cannot be changed
        }else{
            this.exits = new HashMap<>();
        }
        this.exits.put("Q", 0);
    }

//    public void addExit(String direction, int location){
//        exits.put(direction, location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
