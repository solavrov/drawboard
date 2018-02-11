package io.github.solavrov.draw;

import java.awt.*;

public class Point {

    public int x;
    public int y;
    public Color color = Color.black;
    public BasicStroke stroke = new BasicStroke(1);

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setStroke(int width) {
        this.stroke = new BasicStroke(width);
    }

}
