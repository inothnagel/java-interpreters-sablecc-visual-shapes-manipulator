package com.inothnagel.compilers.visual_shapes_manipulator.application;

public abstract class Shape {
    private ShapeColor color;

    public void setColor(String name) {
        this.color = new ShapeColor(name);
    }

    public void setColor(ShapeColor color) {
        this.color = color;
    }
    public abstract void render();

    public ShapeColor getColor() {
        return color;
    }
}
