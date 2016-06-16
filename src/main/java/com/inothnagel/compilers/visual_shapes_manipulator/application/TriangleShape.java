package com.inothnagel.compilers.visual_shapes_manipulator.application;

import java.awt.*;

/**
 * Created by inothnagel on 2016/06/13.
 */
public class TriangleShape extends Shape {
    @Override
    public void render(Graphics graphics) {
        Color color = this.getColor().getRgbColor();
        graphics.setColor(color);
        int[] xs = {
                getX() - (getWidth()/2),
                getX(),
                getX() + (getWidth()/2),
        };
        int[] ys = {
                getY() + (getHeight()/2),
                getY() - (getHeight()/2),
                getY() + (getHeight()/2),
        };
        graphics.fillPolygon(xs, ys, 3);
    }
}
