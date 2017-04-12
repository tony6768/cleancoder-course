
package com.tocea.course.cleancode.module1.exercice1.version1;



import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Group
{
    
    
    public List<User> getUsersSortedByMostRecentlyRegistered() {
    
    	
        final List<User> users = new ArrayList<User>();
        if (!userDirectoryExists()) { return users; }
        addFoundUsersTo(users);
        sortByMostRecentlyRegistered(users);
        return users;
    }
    
    
    private void addFoundUsersTo(final List<User> _users) {
    
    
        final File[] files = new File(persistencePath()).listFiles();
        for (final File file : files) {
            if (file.isDirectory()) {
                _users.add(new User(file.getName(), this));
            }
        }
        
    }
    
    
    private String persistencePath() {
    
    
        // TODO Auto-generated method stub
        return null;
    }
    
    
    private void sortByMostRecentlyRegistered(final List<User> _users) {
    
    
        // sort by most recently registered users
        Collections.sort(_users, new User.UserComparatorByDescendingRegistration());
    }
    
    
    private boolean userDirectoryExists() {
    
    
        // TODO Auto-generated method stub
        return false;
    }
}
