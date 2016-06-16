package com.inothnagel.compilers.visual_shapes_manipulator.application;

public class LeftAnimation extends DirectionAnimation {
    public LeftAnimation(Shape shape) {
        super(shape);
    }

    public void tick() {
        reduceTicks();
        target.setX(target.getX()-10);
    }
}
