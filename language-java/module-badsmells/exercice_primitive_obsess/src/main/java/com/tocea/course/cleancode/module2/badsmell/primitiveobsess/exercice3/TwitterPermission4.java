
package com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice3;



public class TwitterPermission4
{
    
    
    /**
     * Three states : REQUESTED, IGNORED, LIMITED
     */
    private String state;
    
    
    
    public void enableDefaultPermissions() {
    
    
        state = "REQUESTED";
    }
    
    
    public void enableIgnoredPermissions() {
    
    
        state = "IGNORED";
    }
    
    
    public void enableLimitedPermissions() {
    
    
        state = "LIMITED";
    }
    
    
    public boolean isIgnoredPermission() {
    
    
        return "IGNORED".equals(state);
    }
    
    
    public boolean isLimitedPermission() {
    
    
        return "LIMITED".equals(state);
    }
    
    
    public boolean isRequestedPermission() {
    
    
        return "REQUESTED".equals(state);
    }
}
