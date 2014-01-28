
package com.tocea.courses.cleancode.module2;



/**
 * This class is an exercise of pair reviewing.
 * 
 * @author sleroy
 */
public class PairReviewing
{
    
    
    public void printGuessStatistics(final char candidate, final int count) {
    
    
        String number;
        String verb;
        String pluralModifier;
        if (count == 0) {
            number = "no";
            verb = "are";
            pluralModifier = "s";
        } else if (count == 1) {
            number = "1";
            verb = "is";
            pluralModifier = "";
        } else {
            number = Integer.toString(count);
            verb = "are";
            pluralModifier = "s";
        }
        final String guessMessage =
                String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
        print(guessMessage);
    }
    
    
    private void print(final String _guessMessage) {
    
    
        System.out.println(_guessMessage);
        
    }
}
