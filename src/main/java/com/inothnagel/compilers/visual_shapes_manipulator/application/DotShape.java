package com.inothnagel.compilers.visual_shapes_manipulator.application;

import java.awt.*;

/**
 * Created by inothnagel on 2016/06/13.
 */
public class DotShape extends Shape {
    DotShape() {
        super();
    }

    @Override
    public void render(Graphics graphics) {
        Color color = this.getColor().getRgbColor();
        graphics.setColor(color);
        graphics.fillOval(getX(), getY(), getWidth(), getHeight());
    }
}
