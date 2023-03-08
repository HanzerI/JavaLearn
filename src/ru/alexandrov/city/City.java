package ru.alexandrov.city;

import java.util.*;

public class City {

    String name;
    private Set<Way> ways;

    public City(String name) {
        this.name = name;
    }

    City(String name, Way ... ways){
        this(name,Arrays.asList(ways));
    }

    City(String name, List<Way> ways){
        this(name);
        this.ways = new HashSet<>(ways);
    }



    public void setWays(Set<Way> ways) {
        this.ways = new HashSet<>(ways);
    }

    public Set<Way> getWays() {
        return ways;
    }

    public void deleteWay(City city){
       if(this.ways == null) return;
       if(city == null) throw new IllegalArgumentException("Не парвильно указан город");
       Way delWay = null;
        for (Way way:this.ways) {
            if(way.getCity() == city){
                delWay = way;
                break;
            }
        }
        if(delWay != null)
            ways.remove(delWay);
    }

    public void addWay(Way way){
        if(this.ways == null)
            this.ways = new HashSet<>();
        this.ways.add(way);
    }


    public void addWays(Set<Way> ways){
        if(this.ways == null)
            this.setWays(ways);
        else
            this.ways.addAll(ways);
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        if(city.getWays().size() != this.ways.size()) return false;
        for(Way w:this.ways) {
            if( !city.getWays().contains(w) )
                return false;
        }
        return true;
    }

    public int hashCode() {
        int hash = 3;
        if(ways == null || ways.size() == 0) return hash;
        for (Way way:ways) {
            hash += 37 * hash + way.getCity().name.hashCode();
        }


        return hash;
    }



    public String toString() {
        return "Проезд из города " + name  + ways ;
    }

}
