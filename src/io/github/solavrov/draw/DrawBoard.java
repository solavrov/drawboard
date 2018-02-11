package io.github.solavrov.draw;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class DrawBoard extends JFrame {

    private ArrayList<Point> points = new ArrayList<>();
    private ArrayList<Line> lines = new ArrayList<>();

    public DrawBoard(int width, int height) {
        super();
        getContentPane().setPreferredSize(new Dimension(width, height));
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Line line : lines) {
            line = transform(line);
            g2.setColor(line.color);
            g2.setStroke(line.stroke);
            g2.drawLine(line.p1.x, line.p1.y, line.p2.x, line.p2.y);
        }
        for (Point p : points) {
            Line line = new Line(p);
            line = transform(line);
            g2.setColor(line.color);
            g2.setStroke(line.stroke);
            g2.drawLine(line.p1.x, line.p1.y, line.p2.x, line.p2.y);
        }
    }

    public void setBackground(Color color) {
        getContentPane().setBackground(color);
        repaint();
    }

    public DrawBoard add(Point point) {
        points.add(point);
        repaint();
        return (this);
    }

    public DrawBoard add(Line line) {
        lines.add(line);
        repaint();
        return (this);
    }

    public DrawBoard remove(Point point) {
        points.remove(point);
        repaint();
        return (this);
    }

    public DrawBoard remove(Line line) {
        lines.remove(line);
        repaint();
        return (this);
    }

    public DrawBoard moveUp(Point point) {
        int i = points.indexOf(point);
        if (i < points.size() - 1) {
            Collections.swap(points, i, i+1);
            repaint();
        }
        return (this);
    }

    public DrawBoard moveUp(Line line) {
        int i = lines.indexOf(line);
        if (i < lines.size() - 1) {
            Collections.swap(lines, i, i+1);
            repaint();
        }
        return (this);
    }

    public DrawBoard moveDown(Point point) {
        int i = points.indexOf(point);
        if (i > 0) {
            Collections.swap(points, i, i-1);
            repaint();
        }
        return (this);
    }

    public DrawBoard moveDown(Line line) {
        int i = lines.indexOf(line);
        if (i > 0) {
            Collections.swap(lines, i, i-1);
            repaint();
        }
        return (this);
    }

    public Point transform(Point point) {
        int xShift = (getSize().width - getContentPane().getSize().width) / 2;
        int yShift  = getSize().height - xShift;
        return (new Point(point.x + xShift, -point.y + yShift));
    }

    public Line transform(Line line) {
        Line line2 = new Line(transform(line.p1), transform(line.p2));
        line2.setColor(line.color);
        line2.setStroke(line.stroke);
        return (line2);
    }

}
