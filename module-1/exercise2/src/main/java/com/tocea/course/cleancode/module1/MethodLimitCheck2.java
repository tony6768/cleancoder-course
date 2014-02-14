
package com.tocea.course.cleancode.module1;



import com.puppycrawl.tools.checkstyle.api.Check;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;



public class MethodLimitCheck2 extends Check
{
    
    
    private int maxMethods = 30;
    
    
    
    @Override
    public int[] getDefaultTokens() {
    
    
        return new int[] {
            TokenTypes.CLASS_DEF };
    }
    
    
    public int getMaxMethods() {
    
    
        return maxMethods;
    }
    
    
    public void setMaxMethods(final int _maxMethods) {
    
    
        maxMethods = _maxMethods;
    }
    
    
    @Override
    public void visitToken(final DetailAST _aAST) {
    
    
        if (_aAST.getChildCount(TokenTypes.METHOD_DEF) > maxMethods) {
            log(_aAST, "max-methods-reached");
        }
        super.visitToken(_aAST);
    }
    
}
