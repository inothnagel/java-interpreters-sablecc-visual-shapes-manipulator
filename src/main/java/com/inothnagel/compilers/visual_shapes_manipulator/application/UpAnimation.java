package com.inothnagel.compilers.visual_shapes_manipulator.application;

public class UpAnimation extends DirectionAnimation {
    public UpAnimation(Shape shape) {
        super(shape);
    }

    public void tick() {
        reduceTicks();
        target.setY(target.getY()-10);
    }
}
