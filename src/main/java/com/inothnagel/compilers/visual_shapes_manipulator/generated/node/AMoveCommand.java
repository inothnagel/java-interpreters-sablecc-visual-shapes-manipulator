/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.inothnagel.compilers.visual_shapes_manipulator.generated.node;

import com.inothnagel.compilers.visual_shapes_manipulator.generated.analysis.*;

@SuppressWarnings("nls")
public final class AMoveCommand extends PCommand
{
    private TMove _move_;
    private PSelector _selector_;
    private TDirection _direction_;

    public AMoveCommand()
    {
        // Constructor
    }

    public AMoveCommand(
        @SuppressWarnings("hiding") TMove _move_,
        @SuppressWarnings("hiding") PSelector _selector_,
        @SuppressWarnings("hiding") TDirection _direction_)
    {
        // Constructor
        setMove(_move_);

        setSelector(_selector_);

        setDirection(_direction_);

    }

    @Override
    public Object clone()
    {
        return new AMoveCommand(
            cloneNode(this._move_),
            cloneNode(this._selector_),
            cloneNode(this._direction_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMoveCommand(this);
    }

    public TMove getMove()
    {
        return this._move_;
    }

    public void setMove(TMove node)
    {
        if(this._move_ != null)
        {
            this._move_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._move_ = node;
    }

    public PSelector getSelector()
    {
        return this._selector_;
    }

    public void setSelector(PSelector node)
    {
        if(this._selector_ != null)
        {
            this._selector_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._selector_ = node;
    }

    public TDirection getDirection()
    {
        return this._direction_;
    }

    public void setDirection(TDirection node)
    {
        if(this._direction_ != null)
        {
            this._direction_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._direction_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._move_)
            + toString(this._selector_)
            + toString(this._direction_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._move_ == child)
        {
            this._move_ = null;
            return;
        }

        if(this._selector_ == child)
        {
            this._selector_ = null;
            return;
        }

        if(this._direction_ == child)
        {
            this._direction_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._move_ == oldChild)
        {
            setMove((TMove) newChild);
            return;
        }

        if(this._selector_ == oldChild)
        {
            setSelector((PSelector) newChild);
            return;
        }

        if(this._direction_ == oldChild)
        {
            setDirection((TDirection) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
