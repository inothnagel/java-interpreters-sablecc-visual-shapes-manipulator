package com.inothnagel.compilers.visual_shapes_manipulator.application;

public class RightAnimation extends DirectionAnimation {
    public RightAnimation(Shape shape) {
        super(shape);
    }

    public void tick() {
        reduceTicks();
        target.setX(target.getX()+10);
    }
}
