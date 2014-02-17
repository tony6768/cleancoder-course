
package com.tocea.course.cleancode.module2;



public class AbstractLevelChallenge
{
    
    
    public Money calculatePay(final AbstractEmployee e) throws InvalidEmployeeType {
    
    
        switch (e.getType()) {
            case COMMISSIONED:
                return calculateCommissionedPay(e);
            case HOURLY:
                return calculateHourlyPay(e);
            case SALARIED:
                return calculateSalariedPay(e);
            default:
                throw new InvalidEmployeeType(e.getType());
        }
    }
    
    
    private Money calculateCommissionedPay(final AbstractEmployee _e) {
    
    
        // Complex algorithm
        return new Money(1024.0);
    }
    
    
    private Money calculateHourlyPay(final AbstractEmployee _e) {
    
    
        // Complex algorithm
        return new Money(1024.0);
    }
    
    
    private Money calculateSalariedPay(final AbstractEmployee _e) {
    
    
        // Complex algorithm
        return new Money(1024.0);
    }
}
