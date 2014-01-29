
package com.tocea.course.cleancode.module1.exercice1.version2;



import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Group2
{
    
    
    public List<User2> getUsers() {
    
    
        final List<User2> users = new ArrayList<User2>();
        if (!userDirectoryExists()) { return users; }
        // Add found users to users collection
        final File[] files = new File(persistencePath()).listFiles();
        for (final File file : files) {
            if (file.isDirectory()) {
                users.add(new User2(file.getName(), this));
            }
        }
        // sort by most recently registered users
        Collections.sort(users, new User2.UserComparatorByDescendingRegistration());
        return users;
    }
    
    
    private String persistencePath() {
    
    
        // TODO Auto-generated method stub
        return null;
    }
    
    
    private boolean userDirectoryExists() {
    
    
        // TODO Auto-generated method stub
        return false;
    }
}
