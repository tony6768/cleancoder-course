/*
 * GSK / Novartis 2016-2017 All rights reserved
 */

package com.tocea.courses.cleancode.module2;



import com.tocea.courses.cleancode.module2.api.ILoginValidator;
import com.tocea.courses.cleancode.module2.api.IUserRepository;
import com.tocea.courses.cleancode.module2.api.User;



/**
 * The Class RefactoringExample2 is a simple exercise of Cleancode to test the ability of a developer to simplify a code.
 */
public class RefactoringExample2
{
    
    
    private IUserRepository userRepo;
    private ILoginValidator loginValidator;
    
    
    
    public boolean Login(final String username, final String password) {
    
    
        final User user = userRepo.getUserByUsername(username);
        
        if (user == null) { return false; }
        
        if (loginValidator.isValid(user, password)) { return true; }
        
        user.failedLoginAttempts++;
        
        if (user.failedLoginAttempts >= 3) {
            user.lockedOut = true;
        }
        
        return false;
    }
}
