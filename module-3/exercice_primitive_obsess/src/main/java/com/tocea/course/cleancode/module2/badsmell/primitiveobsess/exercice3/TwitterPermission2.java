
package com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice3;



public class TwitterPermission2
{
    
    
    public enum TwitterState {
        REQUESTED, IGNORED, LIMITED
    }
    
    
    
    /**
     * Three states : REQUESTED, IGNORED, LIMITED
     */
    private TwitterState state;
    
    
    
    public TwitterState getState() {
    
    
        return state;
    }
    
    
    public void setState(final TwitterState _state) {
    
    
        state = _state;
    }
    
}
