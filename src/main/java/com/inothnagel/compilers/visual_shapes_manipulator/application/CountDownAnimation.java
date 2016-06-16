package com.inothnagel.compilers.visual_shapes_manipulator.application;

/**
 * Created by inothnagel on 2016/06/16.
 */
public abstract class CountDownAnimation extends Animation {
    int ticksRemaning = 10;

    public CountDownAnimation(Shape shape) {
        super(shape);
    }

    public void reduceTicks() {
        ticksRemaning--;
        if (ticksRemaning < 0) {
            this.toDestroy = true;
        }
    }
}
