package ru.alexandrov.city;

import java.util.Arrays;
import java.util.List;

public class TwoSidedCity extends City{

    public TwoSidedCity(String name) {
        super(name);
    }

    public TwoSidedCity(String name, Way... ways) {
        this(name, Arrays.asList(ways));
    }

    public TwoSidedCity(String name, List<Way> ways) {
        super(name, ways);
        for (Way way : ways ) {
            way.getCity().addWay(new Way(this,way.getPrice()));
        }
    }

    @Override
    public void addWay(Way way) {
        super.addWay(way);
        if(way.getCity().getWays() != null){
            if(containsCity(way.getCity()))
                return;
        }
        way.getCity().addWay(new Way(this,way.getPrice()));
    }

    @Override
    public void deleteWay(City city) {
        super.deleteWay(city);
        if(city.getWays() != null){
            if(containsCity(city))
                city.deleteWay(this);
        }
    }

    public boolean containsCity(City city){
        boolean containsCity = false;
        if(city.getWays() != null)
            for (Way way:city.getWays()) {
                if(way.getCity() == this){
                    containsCity = true;
                    break;
                }
            }
        return containsCity;
    }



    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
