
package com.tocea.course.cleancode.module1;



import com.puppycrawl.tools.checkstyle.api.Check;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;



/**
 * This class defines a check that counts the maximal number of methods in a program.
 * 
 * @author sleroy
 */
public class MethodLimitCheck extends Check
{
    
    
    private static final int DEFAULT_MAX = 30;
    private int              max         = DEFAULT_MAX;
    
    
    
    @Override
    public int[] getDefaultTokens() {
    
    
        return new int[] {
                TokenTypes.CLASS_DEF, TokenTypes.INTERFACE_DEF };
    }
    
    
    public int getMax() {
    
    
        return max;
    }
    
    
    public void setMax(final int _max) {
    
    
        max = _max;
    }
    
    
    @Override
    public void visitToken(final DetailAST ast) {
    
    
        // find the OBJBLOCK node below the CLASS_DEF/INTERFACE_DEF
        final DetailAST objBlock = ast.findFirstToken(TokenTypes.OBJBLOCK);
        // count the number of direct children of the OBJBLOCK
        // that are METHOD_DEFS
        final int methodDefs = objBlock.getChildCount(TokenTypes.METHOD_DEF);
        // report error if limit is reached
        if (methodDefs > max) {
            log(ast.getLineNo(), "too many methods, only " + max + " are allowed");
        }
    }
}
