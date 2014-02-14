
package com.tocea.course.cleancode.module2;



import com.tocea.course.cleancode.module2.API.IEmployeeVisitor;



public class SalariedEmployee extends AbstractEmployee
{
    
    
    public void accept(final IEmployeeVisitor _visitor) {
    
    
        _visitor.visit(this);
        
    }
    
}
