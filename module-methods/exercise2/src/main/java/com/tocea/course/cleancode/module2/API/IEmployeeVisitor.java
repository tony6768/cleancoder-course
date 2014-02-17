
package com.tocea.course.cleancode.module2.API;



import com.tocea.course.cleancode.module2.CommisionedEmployee;
import com.tocea.course.cleancode.module2.HourlyEmployee;
import com.tocea.course.cleancode.module2.SalariedEmployee;



public interface IEmployeeVisitor
{
    
    
    public void visit(CommisionedEmployee _employee, Object _object);
    
    
    public void visit(HourlyEmployee _employee, Object _object);
    
    
    public void visit(SalariedEmployee _employee, Object _object);
}
