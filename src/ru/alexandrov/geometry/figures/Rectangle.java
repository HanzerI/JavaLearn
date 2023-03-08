package ru.alexandrov.geometry.figures;
import ru.alexandrov.geometry.line.*;

import ru.alexandrov.geometry.line.ClosedPolyline;
import ru.alexandrov.main.PolyLinabel;
import ru.alexandrov.geometry.line.Polyline;
import ru.alexandrov.geometry.point.Point;

public class Rectangle extends Figure implements PolyLinabel {
    private int a;
    private int b;

    public Rectangle(float x, float y, int a,int b) {
        super(x, y);
        if(b <= 0  || a <=0) throw new IllegalArgumentException("side must be positive");
        this.b = b;
        this.a = a;
    }

    public Rectangle(Point start, int side1,int side2) {
        this(start.x,start.y,side1,side2);
    }

    public void setB(int b) {
        if(b <= 0 ) throw new IllegalArgumentException("side must be positive");
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        if(a <= 0 ) throw new IllegalArgumentException("side must be positive");
        this.a = a;
    }

    public boolean isSquare(){
        return a == b;
    }

    @Override
    public float area() {
        return a * b;
    }

    public Polyline getPolyLine(){
        return new Polyline( Point.Point(this.getPoint().x,this.getPoint().y),Point.Point(this.getPoint().x + this.a,this.getPoint().y),
                Point.Point(this.getPoint().x + this.a,this.getPoint().y - this.b),Point.Point(this.getPoint().x,this.getPoint().y - this.b));

    }

    public ClosedPolyline getClosedPolyLine(){
        return new ClosedPolyline(getPolyLine());
    }

    @Override
    public String toString() {
        if(isSquare())
            return "Квадрат в точке " + this.getPoint()+" со сторонами " + this.a + " " + this.b;
        else
            return "Прямоугольник в точке " + this.getPoint()+" со сторонами " + this.a + " " + this.b;
    }
}