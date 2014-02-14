
package com.tocea.course.cleancode.module2;



import com.tocea.course.cleancode.module2.API.IEmployeeVisitor;



public class HourlyEmployee extends AbstractEmployee
{
    
    
    public void accept(final IEmployeeVisitor _visitor) {
    
    
        _visitor.visit(this);
        
    }
    
    
    public void calculerPayer() {
    
    
        // TODO Auto-generated method stub
        
    }
    
    
    public void epurerConges() {
    
    
        // TODO Auto-generated method stub
        
    }
    
}
