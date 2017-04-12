
package com.tocea.course.cleancode.module1.exercice1.version1;



import java.util.Comparator;



public class User
{
    
    
    public static class UserComparatorByDescendingRegistration implements Comparator<User>
    {
        
        
        public int compare(final User _arg0, final User _arg1) {
        
        
            return _arg0.getName().compareTo(_arg1.getName());
            
        }
        
    }
    
    
    
    private final String name;
    
    
    private final Group  group;
    
    
    
    public User(final String _name, final Group _group) {
    
    
        name = _name;
        group = _group;
        
        
    }
    
    
    public Group getGroup() {
    
    
        return group;
    }
    
    
    public String getName() {
    
    
        return name;
    }
    
}
