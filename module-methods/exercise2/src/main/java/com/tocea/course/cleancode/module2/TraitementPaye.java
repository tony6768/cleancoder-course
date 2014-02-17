
package com.tocea.course.cleancode.module2;



import com.tocea.course.cleancode.module2.API.IEmployeeVisitor;



public class TraitementPaye implements IEmployeeVisitor
{
    
    
    public void visit(final CommisionedEmployee _employee) {
    
    
        // Calcule de la paye pour le type d'employee Commissioned
        
    }
    
    
    public void visit(final HourlyEmployee _employee) {
    
    
        // Calcul de la paye pour ce type d'employee
        
    }
    
    
    public void visit(final SalariedEmployee _employee) {
    
    
        // Calcul de la paye pour ce type d'employee
        
    }
    
}
