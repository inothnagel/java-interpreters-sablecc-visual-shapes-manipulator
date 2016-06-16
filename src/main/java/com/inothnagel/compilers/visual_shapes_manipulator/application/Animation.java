package com.inothnagel.compilers.visual_shapes_manipulator.application;

/**
 * Created by inothnagel on 2016/06/16.
 */
public abstract class Animation {
    Shape target;
    boolean toDestroy = false;

    public Animation (Shape shape) {
        this.target = shape;
    }

    public abstract void tick();

    public boolean toDestroy() {
        return toDestroy;
    }
}
