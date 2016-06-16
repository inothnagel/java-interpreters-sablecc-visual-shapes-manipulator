package com.inothnagel.compilers.visual_shapes_manipulator.application;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class World {
    List<Shape> shapes = new ArrayList<>();
    public void add(Shape shape) {
        this.shapes.add(shape);
    }

    public void render(Graphics graphics) {
        shapes.forEach(shape -> shape.render(graphics));
    }
}
