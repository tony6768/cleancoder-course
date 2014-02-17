
package com.tocea.course.cleancode.module2;



import com.tocea.course.cleancode.module2.API.IEmployee;
import com.tocea.course.cleancode.module2.API.IEmployeeVisitable;



public abstract class AbstractEmployee implements IEmployeeVisitable, IEmployee
{
    
    
    private String       firstName;
    private String       sureName;
    private EmployeeType type;
    
    
    
    public AbstractEmployee() {
    
    
        super();
    }
    
    
    public String getFirstName() {
    
    
        return firstName;
    }
    
    
    public String getSureName() {
    
    
        return sureName;
    }
    
    
    public EmployeeType getType() {
    
    
        return type;
    }
    
    
    public void setFirstName(final String _firstName) {
    
    
        firstName = _firstName;
    }
    
    
    public void setSureName(final String _sureName) {
    
    
        sureName = _sureName;
    }
    
    
    public void setType(final EmployeeType _type) {
    
    
        type = _type;
    }
}
