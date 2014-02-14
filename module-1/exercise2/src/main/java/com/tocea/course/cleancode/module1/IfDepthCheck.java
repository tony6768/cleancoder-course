/**
 * 
 */

package com.tocea.course.cleancode.module1;



import com.puppycrawl.tools.checkstyle.api.Check;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;



/**
 * @author sleroy
 */
public class IfDepthCheck extends Check
{
    
    
    private int maxDepthAllowed = 2;
    
    
    
    @Override
    public int[] getDefaultTokens() {
    
    
        return new int[] {
            TokenTypes.LITERAL_IF };
    }
    
    
    public int getMaxDepthAllowed() {
    
    
        return maxDepthAllowed;
    }
    
    
    public void setMaxDepthAllowed(final int _maxDepthAllowed) {
    
    
        maxDepthAllowed = _maxDepthAllowed;
    }
    
    
    @Override
    public void visitToken(final DetailAST ast) {
    
    
        int depth = 0;
        DetailAST parent = ast.getParent();
        while (parent != null) {
            parent = parent.getParent();
            depth++;
        }
        if (depth > maxDepthAllowed) {
            log(ast, "maximal-if-depth-reached");
        }
        
        
    }
    
    
}
