/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.inothnagel.compilers.visual_shapes_manipulator.generated.analysis;

import java.util.*;
import com.inothnagel.compilers.visual_shapes_manipulator.generated.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPCommand().apply(this);
        outStart(node);
    }

    public void inADrawCommand(ADrawCommand node)
    {
        defaultIn(node);
    }

    public void outADrawCommand(ADrawCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADrawCommand(ADrawCommand node)
    {
        inADrawCommand(node);
        if(node.getNoun() != null)
        {
            node.getNoun().apply(this);
        }
        if(node.getDraw() != null)
        {
            node.getDraw().apply(this);
        }
        outADrawCommand(node);
    }

    public void inAMoveCommand(AMoveCommand node)
    {
        defaultIn(node);
    }

    public void outAMoveCommand(AMoveCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMoveCommand(AMoveCommand node)
    {
        inAMoveCommand(node);
        if(node.getDirection() != null)
        {
            node.getDirection().apply(this);
        }
        if(node.getSelector() != null)
        {
            node.getSelector().apply(this);
        }
        if(node.getMove() != null)
        {
            node.getMove().apply(this);
        }
        outAMoveCommand(node);
    }

    public void inANoun(ANoun node)
    {
        defaultIn(node);
    }

    public void outANoun(ANoun node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANoun(ANoun node)
    {
        inANoun(node);
        if(node.getShape() != null)
        {
            node.getShape().apply(this);
        }
        if(node.getColor() != null)
        {
            node.getColor().apply(this);
        }
        if(node.getA() != null)
        {
            node.getA().apply(this);
        }
        outANoun(node);
    }

    public void inASelector(ASelector node)
    {
        defaultIn(node);
    }

    public void outASelector(ASelector node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASelector(ASelector node)
    {
        inASelector(node);
        if(node.getIt() != null)
        {
            node.getIt().apply(this);
        }
        outASelector(node);
    }
}
