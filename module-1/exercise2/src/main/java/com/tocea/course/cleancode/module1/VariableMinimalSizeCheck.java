
package com.tocea.course.cleancode.module1;



import com.puppycrawl.tools.checkstyle.api.Check;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;



/**
 * This class defines a check that counts the maximal number of methods in a program.
 * 
 * @author sleroy
 */
public class VariableMinimalSizeCheck extends Check
{
    
    
    private int minimalIdentifierSize = 2;
    
    
    
    @Override
    public int[] getDefaultTokens() {
    
    
        return new int[] {
            TokenTypes.VARIABLE_DEF };
    }
    
    
    public int getMinimalIdentifierSize() {
    
    
        return minimalIdentifierSize;
    }
    
    
    public void setMinimalIdentifierSize(final int _minimalIdentifierSize) {
    
    
        minimalIdentifierSize = _minimalIdentifierSize;
    }
    
    
    /**
     * This checker researches all variable definitions, controls the identifier size and warns if identifiers are under the requested size.
     */
    @Override
    public void visitToken(final DetailAST ast) {
    
    
        final DetailAST tokenVariableIdentifier = ast.findFirstToken(TokenTypes.IDENT);
        final String variableIdentifier = tokenVariableIdentifier.getText();
        if (isUnderRequestedSize(variableIdentifier.length())) {
            log(tokenVariableIdentifier, "The identifier of the variable '"
                    + variableIdentifier + "' is under the minimal requested size.");
        }
        
    }
    
    
    /**
     * Predicates to check the controlled length.
     * 
     * @param _controlledLength
     *            the controlled length
     * @return the requested size.
     */
    private boolean isUnderRequestedSize(final int _controlledLength) {
    
    
        return _controlledLength < minimalIdentifierSize;
    }
}
