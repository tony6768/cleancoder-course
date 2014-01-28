
package com.tocea.course.cleancode.module2;



import org.apache.log4j.Logger;

import com.tocea.course.cleancode.module2.api.ErrorCode;



public class PageAction
{
    
    
    private final PageContainer container = new PageContainer();
    
    private static final Logger LOGGER    = Logger.getLogger(PageAction.class);
    
    
    
    public void action() {
    
    
        final Page page = new Page();
        if (container.generatePage(page) != ErrorCode.E_OK) {
            LOGGER.error("Generation of the page has failed");
        }
    }
    
}
