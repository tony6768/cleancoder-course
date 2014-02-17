
package com.tocea.course.cleancode.module2;



import com.tocea.course.cleancode.module2.API.IEmployeeVisitable;



public class Main
{
    
    
    public void traitement(final IEmployeeVisitable _visitable) {
    
    
        _visitable.accept(new TraitementPaye());
        _visitable.accept(new EpurerConges());
    }
}
