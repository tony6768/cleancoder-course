
package com.tocea.course.cleancode.module1.exercice1.version3;



import java.util.Comparator;



public class User3
{
    
    
    public static class UserComparatorByDescendingRegistration implements Comparator<User3>
    {
        
        
        public int compare(final User3 _arg0, final User3 _arg1) {
        
        
            return _arg0.getName().compareTo(_arg1.getName());
            
        }
        
    }
    
    
    
    private final String name;
    
    
    private final Group3 group;
    
    
    
    public User3(final String _name, final Group3 _group3) {
    
    
        name = _name;
        group = _group3;
        
        
    }
    
    
    public Group3 getGroup() {
    
    
        return group;
    }
    
    
    public String getName() {
    
    
        return name;
    }
    
}
