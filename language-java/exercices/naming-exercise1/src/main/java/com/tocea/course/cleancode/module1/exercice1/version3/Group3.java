
package com.tocea.course.cleancode.module1.exercice1.version3;



import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Group3
{
    
    
    // Gets users sorted by the most recently registered user
    public List<User3> getUsers() {
    
    
        final List<User3> users = new ArrayList();
        if (!new File(persistencePath()).exists()) { return users; }
        final File[] files = new File(persistencePath()).listFiles();
        for (final File file : files) {
            if (file.isDirectory()) {
                users.add(new User3(file.getName(), this));
            }
        }
        Collections.sort(users, new User3.UserComparatorByDescendingRegistration());
        return users;
    }
    
    
    private String persistencePath() {
    
    
        // TODO Auto-generated method stub
        return null;
        
    }
}
