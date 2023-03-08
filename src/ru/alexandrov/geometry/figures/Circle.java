package ru.alexandrov.geometry.figures;

import ru.alexandrov.geometry.point.Point;

public class Circle extends Figure{
    private float radius;

    public Circle(Point point, float radius) {
        this(point.x, point.y,radius);
    }

    public Circle(float x, float y, float radius) {
        super(x,y);
        if(radius <= 0 ) throw new IllegalArgumentException("side must be positive");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        if(radius <= 0 ) throw new IllegalArgumentException("side must be positive");
        this.radius = radius;
    }

    @Override
    public float area() {
        return (float)(Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Круг в точке " + this.getPoint() + "  радиусом: " + this.getRadius();
    }


}
