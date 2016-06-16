package com.inothnagel.compilers.visual_shapes_manipulator.application;

import java.awt.*;

/**
 * Created by inothnagel on 2016/06/13.
 */
public class SquareShape extends Shape {
    @Override
    public void render(Graphics graphics) {
        Color color = this.getColor().getRgbColor();
        graphics.setColor(color);
        graphics.fillRect(getX(),getY(),getWidth(), getHeight());
    }
}
