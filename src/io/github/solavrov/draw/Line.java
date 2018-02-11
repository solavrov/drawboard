package io.github.solavrov.draw;

import java.awt.*;

public class Line {

    public Point p1;
    public Point p2;
    public Color color = Color.black;
    public BasicStroke stroke = new BasicStroke(1);

    public Line() {
        this.p1 = new Point();
        this.p2 = new Point();
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1,y1);
        this.p2 = new Point(x2,y2);
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(Point p) {
        this.p1 = p;
        this.p2 = p;
        this.color = p.color;
        this.stroke = p.stroke;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setStroke(int width) {
        this.stroke = new BasicStroke(width);
    }

    public void setStroke(BasicStroke stroke) {
        this.stroke = stroke;
    }

}
