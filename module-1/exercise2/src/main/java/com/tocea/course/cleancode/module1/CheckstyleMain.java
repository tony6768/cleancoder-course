
package com.tocea.course.cleancode.module1;



import org.apache.commons.cli.MissingArgumentException;
import org.apache.log4j.Logger;

import com.puppycrawl.tools.checkstyle.Main;



/**
 * This class defines the bootstrap to launch checkstyle with custom rules.
 * 
 * @author sleroy
 */
public class CheckstyleMain
{
    
    
    private static final Logger LOGGER = Logger.getLogger("CheckstyleCustomRules");
    
    
    
    public static void main(final String[] args) throws MissingArgumentException {
    
    
        if (args.length == 0) { throw new MissingArgumentException("First argument requires a path"); }
        
        LOGGER.info("Launching Checkstyle on folder " + args[0]);
        /**
         * Lancement de CHeckstyle
         */
        final String[] checkStyleArgs = new String[] {
                "-c", "src/main/resources/configRules.xml", "-r", args[0] };
        
        Main.main(checkStyleArgs);
    }
}
