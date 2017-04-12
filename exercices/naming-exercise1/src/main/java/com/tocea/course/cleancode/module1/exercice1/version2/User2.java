
package com.tocea.course.cleancode.module1.exercice1.version2;



import java.util.Comparator;



public class User2
{
    
    
    public static class UserComparatorByDescendingRegistration implements Comparator<User2>
    {
        
        
        public int compare(final User2 _arg0, final User2 _arg1) {
        
        
            return _arg0.getName().compareTo(_arg1.getName());
            
        }
        
    }
    
    
    
    private final String name;
    
    
    private final Group2 group;
    
    
    
    public User2(final String _name, final Group2 _group2) {
    
    
        name = _name;
        group = _group2;
        
        
    }
    
    
    public Group2 getGroup() {
    
    
        return group;
    }
    
    
    public String getName() {
    
    
        return name;
    }
    
}
