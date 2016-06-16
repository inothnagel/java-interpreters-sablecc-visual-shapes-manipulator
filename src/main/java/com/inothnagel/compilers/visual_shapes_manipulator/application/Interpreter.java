package com.inothnagel.compilers.visual_shapes_manipulator.application;

import com.inothnagel.compilers.visual_shapes_manipulator.generated.analysis.DepthFirstAdapter;
import com.inothnagel.compilers.visual_shapes_manipulator.generated.node.*;

import java.util.Stack;

public class Interpreter extends DepthFirstAdapter {
    public Stack<Shape> shapeStack = new Stack<>();
    public Stack<ShapeColor> colorStack = new Stack<>();
    private Stack<Direction> directionStack = new Stack<>();
    private Shape it;

    public void outADrawCommand(ADrawCommand node)
    {
        Shape shape = shapeStack.pop();
        VisualMain.world.add(shape);
        setIt(shape);
        System.out.println("Shape: " + shape);
    }

    public void outANoun(ANoun node)
    {
        ShapeColor color = colorStack.pop();
        System.out.println("Color: " + color);
        Shape shape = shapeStack.pop();
        System.out.println(shape);
        shape.setColor(color);
        shapeStack.push(shape);
    }

    @Override
    public void caseTColor(TColor node)
    {
        String text = node.getText();
        System.out.println("Text: " + text);
        colorStack.push(new ShapeColor(text));
    }

    @Override
    public void caseTShape(TShape node)
    {
        String text = node.getText();
        System.out.println("Shape Text: " + text);
        switch (text) {
            case "dot":
                shapeStack.push(new DotShape()); break;
            case "triangle":
                shapeStack.push(new TriangleShape()); break;
            case "square":
                shapeStack.push(new SquareShape()); break;
            default:
                throw new RuntimeException("No such shape as " + text);
        }
    }

    public void outAMoveCommand(AMoveCommand node)
    {
        defaultOut(node);
        Shape shape = shapeStack.pop();
        Direction direction = directionStack.pop();
        System.out.println("Moving " + shape + " " + direction);

        switch(direction) {
            case DOWN: shape.addAnimation(new DownAnimation(shape)); break;
            case UP: shape.addAnimation(new UpAnimation(shape)); break;
            case LEFT: shape.addAnimation(new LeftAnimation(shape)); break;
            case RIGHT: shape.addAnimation(new RightAnimation(shape)); break;
        }

    }

    @Override
    public void caseTIt(TIt node)
    {
        shapeStack.push(getIt());
        System.out.println("pushing it: " + getIt());
    }

    @Override
    public void caseTDirection(TDirection node)
    {
        switch (node.getText()) {
            case "up": directionStack.push(Direction.UP); break;
            case "down": directionStack.push(Direction.DOWN); break;
            case "left": directionStack.push(Direction.LEFT); break;
            case "right": directionStack.push(Direction.RIGHT); break;
            default: throw new RuntimeException("Direction not found: " + node.getText());
        }
    }

    public void setIt(Shape it) {
        VisualMain.world.setIt(it);
    }

    public Shape getIt() {
        return VisualMain.world.getIt();
    }
}
