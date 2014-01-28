
package com.tocea.course.cleancode.module2;



public class PageName
{
    
    
    private String rawName;
    
    
    
    public String getRawName() {
    
    
        return rawName;
    }
    
    
    public String makeKey() {
    
    
        return rawName.toLowerCase();
    }
    
    
    public void setRawName(final String _rawName) {
    
    
        rawName = _rawName;
    }
    
    
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
    
    
        return "PageName [rawName=" + rawName + "]";
    }
    
}
