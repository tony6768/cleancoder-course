
package com.tocea.course.cleancode.module2;



import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

import com.tocea.course.cleancode.module2.api.ErrorCode;
import com.tocea.course.cleancode.module2.api.IKeyConfigurationRegistry;
import com.tocea.course.cleancode.module2.api.IPageRegistryService;



public class PageContainer
{
    
    
    private static final Logger       LOGGER      = Logger.getLogger(PageContainer.class);
    private IPageRegistryService      registry;
    private IKeyConfigurationRegistry configKeys;
    
    
    private final Set<Page>           activePages = new HashSet<Page>();
    
    
    
    public ErrorCode generatePage(final Page page) {
    
    
        if (deletePage(page) == ErrorCode.E_OK) {
            if (registry.deleteReference(page.getName()) == ErrorCode.E_OK) {
                if (configKeys.deleteKey(page.getName().makeKey()) == ErrorCode.E_OK) {
                    LOGGER.trace("page deleted");
                    return ErrorCode.E_OK;
                }
                LOGGER.trace("configKey not deleted");
                return ErrorCode.E_FAILURE;
                
            } else {
                LOGGER.error("deleteReference from registry failed");
                return ErrorCode.E_FAILURE;
            }
        }
        // Génération de la page
        LOGGER.error("delete failed");
        return ErrorCode.E_ERROR;
        
        
    }
    
    
    private ErrorCode deletePage(final Page _page) {
    
    
        if (!activePages.remove(_page)) { return ErrorCode.E_OK; }
        return deletePageFromFileSystem(_page);
        
    }
    
    
    private ErrorCode deletePageFromFileSystem(final Page _page) {
    
    
        if (noProblem()) { return ErrorCode.E_OK; }
        //
        return ErrorCode.E_ERROR;
    }
    
    
    private boolean noProblem() {
    
    
        // TODO Auto-generated method stub
        return false;
    }
    
}
