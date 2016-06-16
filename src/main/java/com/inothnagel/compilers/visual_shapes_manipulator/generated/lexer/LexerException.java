/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.inothnagel.compilers.visual_shapes_manipulator.generated.lexer;

import com.inothnagel.compilers.visual_shapes_manipulator.generated.node.*;

@SuppressWarnings("serial")
public class LexerException extends Exception
{
    private InvalidToken invalidToken;
    
    public LexerException(@SuppressWarnings("hiding") InvalidToken invalidToken, String message)
    {
        super(message);
        this.invalidToken = invalidToken;
    }

    public InvalidToken getToken()
    {
        return this.invalidToken;
    }
}
