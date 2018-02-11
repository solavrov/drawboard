package io.github.solavrov.draw;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("This is a package for easy drawing.");

        boolean demo = false;

        for (String s: args) {
            if (s.equals("-e")) {
                demo = true;
                break;
            }
        }

        if (demo) {
            System.out.println("See demo!");
            showDemo();
        } else {
            System.out.println("Use key -e to see demo.");
        }

    }

    private static void showDemo() {

        DrawBoard c = new DrawBoard(500,500);
        c.setBackground(Color.darkGray);

        Line line1 = new Line(100,100,400,100);
        line1.setColor(Color.red);
        line1.setStroke(5);

        Line line2 = new Line(100,400,400,400);
        line2.setColor(Color.blue);
        line2.setStroke(5);

        Line line3 = new Line(100,100,100,400);
        line3.setColor(Color.green);
        line3.setStroke(5);

        Line line4 = new Line(400,100,400,400);
        line4.setColor(Color.magenta);
        line4.setStroke(5);

        Point p1 = new Point(175,300);
        p1.setColor(Color.orange);
        p1.setStroke(50);

        Point p2 = new Point(325,300);
        p2.setColor(Color.white);
        p2.setStroke(50);

        Line line5 = new Line(150,200,250,150);
        line5.setColor(Color.cyan);
        line5.setStroke(15);

        Line line6 = new Line(350,200,250,150);
        line6.setColor(Color.cyan);
        line6.setStroke(15);

        Line line7 = new Line(250,300,250,200);
        line7.setColor(Color.pink);
        line7.setStroke(20);

        c.add(line1).add(line2).add(line3).add(line4).add(p1).add(p2).add(line5).add(line6).add(line7);

    }

}
