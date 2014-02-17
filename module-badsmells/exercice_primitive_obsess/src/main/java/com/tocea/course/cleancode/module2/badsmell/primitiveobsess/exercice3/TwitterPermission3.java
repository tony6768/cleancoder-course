
package com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice3;






public class TwitterPermission3
{
    
    
    public class IgnoredTwitterPermission extends TwitterPermission
    {
        
        
        public IgnoredTwitterPermission() {
        
        
            super();
            setState("IGNORED");
        }
        
        
    }
    
    
    
    public class LimitedTwitterPermission extends TwitterPermission
    {
        
        
        public LimitedTwitterPermission() {
        
        
            super();
            setState("LIMITED");
        }
        
        
    }
    
    
    
    public class RequestedTwitterPermission extends TwitterPermission
    {
        
        
        public RequestedTwitterPermission() {
        
        
            super();
            setState("REQUESTED");
        }
        
        
    }
    
}
