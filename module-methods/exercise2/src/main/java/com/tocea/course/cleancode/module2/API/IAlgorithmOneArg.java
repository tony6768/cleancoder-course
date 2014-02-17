
package com.tocea.course.cleancode.module2.API;

import com.tocea.course.cleancode.module2.CommisionedEmployee;
import com.tocea.course.cleancode.module2.HourlyEmployee;
import com.tocea.course.cleancode.module2.SalariedEmployee;



public interface IAlgorithmOneArg
{
    
    
    public void visit(CommisionedEmployee _employee);
    
    
    public void visit(HourlyEmployee _employee);
    
    
    public void visit(SalariedEmployee _employee);
}
