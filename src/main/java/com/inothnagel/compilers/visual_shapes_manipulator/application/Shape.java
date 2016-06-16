package com.inothnagel.compilers.visual_shapes_manipulator.application;

import java.awt.*;

public abstract class Shape {
    public static final int MAX_X = 1000;
    public static final int MAX_Y = 600;
    private ShapeColor color;
    private int y;
    private int x;

    Shape() {
        this.x = (int) (Math.random()* MAX_X);
        this.y = (int) (Math.random()* MAX_Y);
        System.out.println("Drew a dot at " + x + "," + y);
    }

    public void setColor(String name) {
        this.color = new ShapeColor(name);
    }

    public void setColor(ShapeColor color) {
        this.color = color;
    }
    public abstract void render(Graphics graphics);

    public ShapeColor getColor() {
        return color;
    }

    public int getWidth() {
        return 50;
    }

    protected int getHeight() {
        return 50;
    }

    protected int getY() {
        return y;
    }

    protected int getX() {
        return x;
    }
}
