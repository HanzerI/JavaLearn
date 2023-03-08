package ru.alexandrov.geometry.line;

import ru.alexandrov.geometry.point.ThreePoint;
import ru.alexandrov.main.Lengthabel;
import ru.alexandrov.geometry.point.Point;

public class  Line<T extends Point> implements Lengthabel {

    private T start;
    private T end;



    public static Line<Point> Line( float x1, float y1, float x2, float y2 ){

        return new Line(Point.Point(x1,y1),Point.Point(x2,y2));
    }


    public static Line<ThreePoint> Line( float x1, float y1,float z1, float x2, float y2, float z2){
        return new Line(Point.Point(x1,y1,z1),Point.Point(x2,y2,z2));

    }
    public  static <T extends Point> Line<T> Line( T start,T end){
        return new Line(start,end);
    }


    private Line(T start, T end) {
        this.start = start;
        this.end = end;
    }

    public void setStart(T start) {
        this.start = start;
    }

    public void setEnd(T end) {
        this.end = end;
    }

    public T getStart() {
        return start;
    }

    public T getEnd() {
        return end;
    }

    //    public void setStart(Point start) {
//        setStart(start.x,start.y);
//    }
//
//
//    public void setEnd(Point end) {
//        setEnd(end.x,end.y);
//    }
//
//    public  void setStart(float x, float y) {
//        this.start = new Point(x,y);
//    }
//
//    public  void setEnd(float x, float y) {
//        this.end = new Point(x,y);
//    }
//
//    public Point getStart() {
//        return start;
//    }
//
//    public Point getEnd() {
//        return end;
//    }

    public  int length(){
        return (int)Math.sqrt( Math.pow((end.x - start.x),2 ) + Math.pow((end.y - start.y),2 ) );
    }

    public String toString(){
        return "Линия от " + start + " до " + end;
    }

    @Override
    public int hashCode() {
        return this.getStart().hashCode() + this.getEnd().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Line l = (Line) obj;
        return (this.getStart().equals(l) && this.getEnd().equals(l));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Line(this.start,this.end);
    }
}
