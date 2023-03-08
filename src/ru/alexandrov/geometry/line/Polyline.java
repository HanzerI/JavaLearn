package ru.alexandrov.geometry.line;

import ru.alexandrov.main.Lengthabel;
import ru.alexandrov.geometry.point.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Polyline implements Lengthabel {
    private List<Point> points;


    Polyline(){
        this.points = new ArrayList<>();
    }

    public Polyline(Point... points){
        this(Arrays.asList(points));
    }

    public Polyline(List<Point> points) {
        this.points = new ArrayList<>();
        this.points.addAll(points);
    }

    public void setPoints(List<Point> points) {
        this.points = new ArrayList<>(points);
    }

    public void addPoints(List<Point>  points){
        if(this.points == null)
            this.setPoints(points);
        else {
            this.points.addAll(points);
        }
    }

    public List<Point> getPoints() {
        return points;
    }

    public void addPoints(Point ... points){
        addPoints(Arrays.asList(points));
    }

    public  int length(){
        if(this.points == null)
            return 0;
        int lenghth = 0;
        for(int i = 0;i < this.points.size() -1;i++){
            lenghth += (int)Math.sqrt( Math.pow((points.get(i+1).x - points.get(i).x),2 ) + Math.pow((points.get(i+1).y - points.get(i).y),2 ) );
        }
        return lenghth;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (Point p:this.points) {
            hash+= p.hashCode();
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Polyline l = (Polyline) obj;
        if(this.points.size() != l.points.size()) return false;
        for (int i = 0;i < this.points.size();i++ ) {
            if(this.points.get(i) != l.points.get(i)) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ломанная " + points ;
    }
}
