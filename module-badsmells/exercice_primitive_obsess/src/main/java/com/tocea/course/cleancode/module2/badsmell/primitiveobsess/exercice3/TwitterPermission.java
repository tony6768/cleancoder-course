
package com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice3;



public class TwitterPermission
{
    
    
    /**
     * Three states : REQUESTED, IGNORED, LIMITED
     */
    private String state;
    
    
    
    public String getState() {
    
    
        return state;
    }
    
    
    public void setState(final String _state) {
    
    
        state = _state;
    }
    
}
