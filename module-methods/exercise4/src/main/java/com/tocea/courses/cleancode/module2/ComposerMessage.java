
package com.tocea.courses.cleancode.module2;



public class ComposerMessage implements IComposerMessage
{
    
    
    private final char          candidate;
    private final int           count;
    
    private static final String UN       = "1";
    private static final String VERB_IS  = "is";
    private static final String PURIEL_S = "s";
    private static final String VERB_ARE = "are";
    private static final String NO       = "no";
    
    
    
    public ComposerMessage(final char candidate, final int count) {
    
    
        this.candidate = candidate;
        this.count = count;
        // TODO Auto-generated constructor stub
    }
    
    
    public String ecrire() {
    
        if (count == 0) {
            cm = new ComposerMessage(NO, VERB_ARE, PURIEL_S);
            final String guessMessage =
                    String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
            this
        } else if (count == 1) {
            cm = new ComposerMessage(UN, VERB_IS, "");
        } else {
            cm = new ComposerMessage(Integer.toString(count), VERB_ARE, PURIEL_S);
        }
        return null;
    }
    
}
