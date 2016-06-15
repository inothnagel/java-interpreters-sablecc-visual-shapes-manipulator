package com.inothnagel.compilers.visual_shapes_manipulator.application;

import com.inothnagel.compilers.visual_shapes_manipulator.generated.analysis.DepthFirstAdapter;
import com.inothnagel.compilers.visual_shapes_manipulator.generated.node.ADrawCommand;
import com.inothnagel.compilers.visual_shapes_manipulator.generated.node.ANoun;
import com.inothnagel.compilers.visual_shapes_manipulator.generated.node.TColor;
import com.inothnagel.compilers.visual_shapes_manipulator.generated.node.TShape;

import java.util.Stack;

public class Interpreter extends DepthFirstAdapter {
    public Stack<Shape> shapeStack = new Stack<>();
    public Stack<ShapeColor> colorStack = new Stack<>();

    public void outADrawCommand(ADrawCommand node)
    {
        Shape shape = shapeStack.pop();
        VisualMain.world.add(shape);
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
}
