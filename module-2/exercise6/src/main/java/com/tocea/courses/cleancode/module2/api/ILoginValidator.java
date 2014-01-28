
package com.tocea.courses.cleancode.module2.api;



import com.tocea.courses.cleancode.module2.User;



public interface ILoginValidator
{
    
    
    boolean isValid(User _user, String _password);
    
}
