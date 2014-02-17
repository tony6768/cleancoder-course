
package com.tocea.course.cleancode.module2;



import org.apache.log4j.Logger;



public class PageAction
{
    
    
    private final PageContainer container = new PageContainer();
    
    private static final Logger LOGGER    = Logger.getLogger(PageAction.class);
    
    
    
    public void action() {
    
    
        final Page page = new Page();
        try {
            container.generatePage(page);
        } catch (final Exception e) {
            LOGGER.error("Generation of the page has failed", e);
        }
    }
    
}
