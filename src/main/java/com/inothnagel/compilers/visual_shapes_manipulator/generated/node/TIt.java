/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.inothnagel.compilers.visual_shapes_manipulator.generated.node;

import com.inothnagel.compilers.visual_shapes_manipulator.generated.analysis.*;

@SuppressWarnings("nls")
public final class TIt extends Token
{
    public TIt()
    {
        super.setText("it");
    }

    public TIt(int line, int pos)
    {
        super.setText("it");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TIt(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIt(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TIt text.");
    }
}