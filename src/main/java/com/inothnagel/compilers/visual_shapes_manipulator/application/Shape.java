package com.inothnagel.compilers.visual_shapes_manipulator.application;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Shape {
    public static final int MAX_X = 1000;
    public static final int MAX_Y = 600;
    private ShapeColor color;
    private int y;
    private int x;
    private int width;
    private int height;
    private List<Animation> animations = Collections.synchronizedList(new ArrayList<>());

    Shape() {
        this.x = (int) (Math.random()* MAX_X);
        this.y = (int) (Math.random()* MAX_Y);
        this.width = (int) (Math.random() * 50) + 50;
        this.height = width;
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
        return width;
    }

    protected int getHeight() {
        return height;
    }

    protected int getY() {
        return y;
    }

    protected int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void addAnimation(Animation animation) {
        this.animations.add(animation);
    }

    public void tick() {
        animations.removeIf(animation -> animation.toDestroy());
        animations.forEach(animation -> animation.tick());
    }

    public void setY(int y) {
        this.y = y;
    }

    public void removeAnimation(Animation animation) {
        animations.remove(animation);
    }
}
