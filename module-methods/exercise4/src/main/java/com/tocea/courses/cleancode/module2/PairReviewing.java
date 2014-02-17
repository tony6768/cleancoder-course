
package com.tocea.courses.cleancode.module2;



/**
 * This class is an exercise of pair reviewing.
 * 
 * @author sleroy
 */
public class PairReviewing
{
    
    
    public void printGuessStatistics(final char candidate, final int count) {
    
    
        final ComposerMessage cm;
        final IComposerMessage icomposerMessage = new ComposerMessage(candidate, count);
        
        
        // final String guessMessage = cm.composerMessageDeSortie(candidate);
        final String guessMessage = icomposerMessage.ecrire();
        print(guessMessage);
    }
    
    
    private void print(final String _guessMessage) {
    
    
        System.out.println(_guessMessage);
        
    }
}
