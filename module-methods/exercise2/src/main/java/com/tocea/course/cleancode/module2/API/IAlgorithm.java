
package com.tocea.course.cleancode.module2.API;



import com.tocea.course.cleancode.module2.CommisionedEmployee;
import com.tocea.course.cleancode.module2.HourlyEmployee;
import com.tocea.course.cleancode.module2.SalariedEmployee;



public interface IAlgorithm
{
    
    
    public void visit(CommisionedEmployee _employee, int _number);
    
    
    public void visit(HourlyEmployee _employee, int _number);
    
    
    public void visit(SalariedEmployee _employee, int _number);
}
