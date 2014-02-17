
package com.tocea.course.cleancode.module2.API;



public interface IEmployeeVisitable
{
    
    
    public void accept(IAlgorithmOneArg _visitor, Object _object);
    
    
    public void accept(IEmployeeVisitor _visitor, Object _object);
}
