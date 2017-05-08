
package com.tocea.courses.cleancode.module2.api;



import java.sql.Statement;



public interface IPivertService
{
    
    
    /**
     * Creates a statemetn from the active connection.
     * 
     * @return
     */
    Statement createStatement();
    
}
