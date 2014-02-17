
package com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice3;



/**
 * Primitive obsession 3 : Replace TypeCode per class refactoring.
 * 
 * @author sleroy
 */
public class Client
{
    
    
    public static void main(final String[] args) {
    
    
        final Client c = new Client();
        c.defaultsToPermissionRequested();
    }
    
    
    /**
     * Refactor the method not expose the type code with an appropriate encapsulation.
     */
    public void defaultsToPermissionRequested() {
    
    
        final TwitterPermission permission = new TwitterPermission();
        boolean result = permission.getState().equals("REQUESTED");
        System.out.println(result);
        result = permission.getState().equals("REQEUSTED");
        System.out.println(result);
    }
}
