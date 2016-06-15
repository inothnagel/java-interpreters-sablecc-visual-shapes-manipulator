package com.inothnagel.compilers.visual_shapes_manipulator.application;

import java.awt.*;

public class ShapeColor {
    private Color rgbColor;
    private String name;

    ShapeColor(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
