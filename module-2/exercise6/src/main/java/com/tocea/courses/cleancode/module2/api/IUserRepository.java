
package com.tocea.courses.cleancode.module2.api;



import com.tocea.courses.cleancode.module2.User;



public interface IUserRepository
{
    
    
    User getUserByUsername(String _username);
    
}
