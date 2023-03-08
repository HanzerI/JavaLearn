package ru.alexandrov.geometry.point;
import ru.alexandrov.other.Time;

public class ThreePoint extends Point{
    float z;


    private ThreePoint(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    private ThreePoint(float x, float y, float z, Time time) {
        this(x,y,z);
    }

    private ThreePoint(float x, float y, float z,String color) {
        this(x,y,z);
    }

    public static ThreePoint ThreePoint(float x,float y,float z){
        return new ThreePoint(x,y,z);
    }
    public static ThreePoint ThreePoint(ThreePoint point){
        return new ThreePoint(point.x, point.y,point.z);
    }

    private ThreePoint(ThreePoint point) {
        this(point.x, point.y, point.z);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        ThreePoint p = (ThreePoint) obj;
        return (this.x == p.x && this.y == p.y && this.z == p.z );
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return new ThreePoint(this);
    }
    @Override
    public void move(int shift, String... names) {
        for (String name:names) {
            if(name.equals("x")) x += shift;
            else if ( name.equals("y") ) y += shift;
            else if ( name.equals("z") ) z += shift;
        }
    }

    public String toString(){
        return   "Точка в координате" + "{"+x+";"+y+ ";" +z+ "}";
    }
}
