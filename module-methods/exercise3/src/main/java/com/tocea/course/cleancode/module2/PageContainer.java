
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
    
    
    
    public void generatePage(final Page page) throws Exception {
    
    
        deletePage(page);
        registry.deleteReference(page.getName());
        configKeys.deleteKey(page.getName().makeKey());
        
        
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
