package ru.alexandrov.geometry.figures;


import ru.alexandrov.geometry.point.Point;
import ru.alexandrov.main.Moveable;

abstract public class Figure implements Moveable {
    private Point point;

    public Figure(Point point) {
        this(point.x,point.y);
    }

    public Figure(float x, float y) {
        this.point = Point.Point(x,y);
    }

    public void setPoint(Point point) {
        setPoint(point.x,point.y);
    }
    public void setPoint(float x, float y) {
        this.point = Point.Point(point);
    }

    public Point getPoint() {
        return point;
    }

    abstract public float area();

    public final static float totalArea(Figure ... figures){
        float area = 0;
        for (Figure figure:figures) {
            area += figure.area();
        }
        return area;
    }

    @Override
    public void move(int shift, String... names) {
        point.move(shift,names);
    }
}
