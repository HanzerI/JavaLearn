package ru.alexandrov.geometry.figures;


import ru.alexandrov.geometry.point.Point;

public class Triangle extends Figure{
    private Point point2;
    private Point point3;

    public Triangle(Point point1,Point point2,Point point3) {
        this(point1.x, point1.y, point2.x, point2.y, point3.x, point3.y);
    }

    public Triangle(float x1, float y1,float x2, float y2,float x3, float y3) {
        super(x1, y1);
        this.point2 = Point.Point(x2,y2);
        this.point3 =Point.Point(x3,y3);
    }


    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = Point.Point(point2);
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    @Override
    public float area() {
        return (float)0.5 * Math.abs((point2.x - this.getPoint().x)-(point3.x- this.getPoint().x)*(point2.y-this.getPoint().y)) ;
    }

    @Override
    public String toString() {
        return "Треугольник в точках: " + this.getPoint() + point2 + point3;
    }

    @Override
    public void move(int shift, String... names) {
        super.move(shift, names);
        point2.move(shift, names);
        point3.move(shift, names);
    }
}
