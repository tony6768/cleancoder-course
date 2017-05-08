
package com.tocea.course.cleancode.module2;



public enum EmployeeType {
    COMMISSIONED {
        
        
        @Override
        public void calculerPayer() {
        
        
            // TODO Auto-generated method stub
            
        }
        
        
        @Override
        public void epurerConges() {
        
        
            // TODO Auto-generated method stub
            
        }
        
    },
    HOURLY {
        
        
        @Override
        public void calculerPayer() {
        
        
            // TODO Auto-generated method stub
            
        }
        
        
        @Override
        public void epurerConges() {
        
        
            // TODO Auto-generated method stub
            
        }
    },
    SALARIED {
        
        
        @Override
        public void calculerPayer() {
        
        
            // TODO Auto-generated method stub
            
        }
        
        
        @Override
        public void epurerConges() {
        
        
            // TODO Auto-generated method stub
            
        }
    }
    
    ;
    
    
    public abstract void calculerPayer();
    
    
    public abstract void epurerConges();
    
}
