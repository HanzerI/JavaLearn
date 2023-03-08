package ru.alexandrov.geometry.point;

import java.util.ArrayList;
import java.util.List;

public class SuperPoint {
    private List<Property> properies = new ArrayList<>();

    public void addProperty(Property property){
        if(property == null) throw new IllegalArgumentException("Property must not be null");
        properies.add(property);
    }

    public List<Property> getProperies() {
        return properies;
    }

    public Property getProperty(String name){
        if(name == null) throw new IllegalArgumentException("Name must not be null");
        for(int i = 0;i< properies.size();i++){
            if(properies.get(i).name == name)
                return properies.get(i);
        }
        return null;
    }

    @Override
    public String toString() {
        return "SuperPoint: "+properies.toString();
    }
}
