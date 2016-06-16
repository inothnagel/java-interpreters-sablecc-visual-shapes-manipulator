package com.inothnagel.compilers.visual_shapes_manipulator.application;

public class DownAnimation extends DirectionAnimation {
    public DownAnimation(Shape shape) {
        super(shape);
    }

    public void tick() {
        reduceTicks();
        target.setY(target.getY()+10);
    }
}
