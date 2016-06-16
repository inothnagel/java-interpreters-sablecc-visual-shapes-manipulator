package com.inothnagel.compilers.visual_shapes_manipulator.application;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class World {
    List<Shape> shapes = Collections.synchronizedList(new ArrayList<>());
    private Shape it;

    public void add(Shape shape) {
        this.shapes.add(shape);
    }

    public void render(Graphics graphics) {
        shapes.forEach(shape -> shape.tick());
        shapes.forEach(shape -> shape.render(graphics));
    }

    public void setIt(Shape it) {
        this.it = it;
    }

    public Shape getIt() {
        return it;
    }
}
