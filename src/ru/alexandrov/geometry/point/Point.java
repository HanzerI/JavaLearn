package ru.alexandrov.geometry.point;
import ru.alexandrov.main.Moveable;

import java.util.Objects;

//==========================Задание 1.1.1 (точка)==============================================
public class Point implements Cloneable, Moveable {

    public float x;
    public float y;


    protected Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static Point Point(float x,float y){
        return new Point(x,y);
    }
    public static Point Point(Point point){
        return new Point(point.x, point.y);
    }
    public static ThreePoint Point(float x,float y,float z){
        return ThreePoint.ThreePoint(x,y,z);
    }
    public static ThreePoint Point(ThreePoint point){
        return ThreePoint.ThreePoint(point.x, point.y,point.z);
    }


    protected Point(Point point) {
        this(point.x,point.y);
    }

@Override
    public String toString(){
        return   "Точка в координате" + "{"+x+";"+y+"}";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Point p = (Point) obj;
        return (this.x == p.x && this.y == p.y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Point clone2() {
        return new Point(this);
    }

    @Override
    public int hashCode() {
        int hash = 6;
        hash = 94 * hash + Objects.hashCode(x);
        hash = 94 * hash + Objects.hashCode(y);
        return hash;
    }

    @Override
    public void move(int shift, String... names) {
        if(this.getClass() == ThreePoint.class)
        {
            ThreePoint tp = (ThreePoint) this;
            tp.move(shift,names);
            return;
        }
        for (String name:names) {
            if(name.equals("x")) x+= shift;
            else if ( name.equals("y") ) y+= shift;
        }
    }
}