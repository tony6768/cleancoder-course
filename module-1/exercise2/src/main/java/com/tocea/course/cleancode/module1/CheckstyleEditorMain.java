
package com.tocea.course.cleancode.module1;



import org.apache.log4j.Logger;

import com.puppycrawl.tools.checkstyle.gui.Main;



/**
 * This class defines the bootstrap to launch checkstyle editor gui.
 * 
 * @author sleroy
 */
public class CheckstyleEditorMain
{
    
    
    private static final Logger LOGGER = Logger.getLogger("CheckstyleEditorGUI");
    
    
    
    public static void main(final String[] args) {
    
    
        LOGGER.info("Launching Checkstyle GUI");
        /**
         * Lancement de CHeckstyle
         */
        final String[] checkStyleArgs = new String[] {};
        Main.main(checkStyleArgs);
    }
    
}
