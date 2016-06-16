package com.inothnagel.compilers.visual_shapes_manipulator.application;

import java.awt.*;

public class ShapeColor {
    private Color rgbColor;
    private String name;

    ShapeColor(String name) {
        this.name = name;
        switch (name) {
            case "red": this.rgbColor = new Color(255,0,0); break;
            case "green": this.rgbColor = new Color(0,255,0); break;
            case "blue": this.rgbColor = new Color(0,0,255); break;
            case "yellow": this.rgbColor = new Color(255, 255, 0); break;
        }
    }

    public String toString() {
        return name;
    }

    public Color getRgbColor() {
        return rgbColor;
    }
}
