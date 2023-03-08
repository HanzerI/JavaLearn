package ru.alexandrov.geometry.line;

import ru.alexandrov.geometry.point.Point;

import java.util.List;

public class ClosedPolyline extends Polyline {
    public ClosedPolyline(Point... points) {
        super(points);
    }

    public ClosedPolyline(List<Point> points) {
        super(points);
    }

    public ClosedPolyline(Polyline pl){
        this(pl.getPoints());
    }


    @Override
    public int length() {
        if(this.getPoints() == null)
            return 0;
        int x = (int)Math.sqrt( Math.pow((this.getPoints().get(0).x - this.getPoints().get(this.getPoints().size() -1).x),2 ) + Math.pow((this.getPoints().get(0).y - this.getPoints().get(this.getPoints().size()-1).y),2 ) );
        return super.length()+ x;
    }
}
