
package com.tocea.courses.cleancode.module2.api;



public class User
{
    
    
    private String userName            = "";
    private String password            = "";
    public int     failedLoginAttempts = 0;
    public boolean lockedOut           = false;
    
    
    
    public String getPassword() {
    
    
        return password;
    }
    
    
    public String getUserName() {
    
    
        return userName;
    }
    
    
    public void setPassword(final String _password) {
    
    
        password = _password;
    }
    
    
    public void setUserName(final String _userName) {
    
    
        userName = _userName;
    }
}
