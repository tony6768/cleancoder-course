
package com.tocea.course.cleancode.module2;



public class InvalidEmployeeType extends Exception
{
    
    
    private final EmployeeType type;
    
    
    
    public InvalidEmployeeType(final EmployeeType _type) {
    
    
        type = _type;
        
        
    }
    
    
    public EmployeeType getType() {
    
    
        return type;
    }
    
}
