
package com.tocea.course.cleancode.module2;



public class Employee
{
    
    
    private String       firstName;
    private String       sureName;
    private EmployeeType type;
    
    
    
    public Employee() {
    
    
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
