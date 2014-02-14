
package com.tocea.courses.cleancode.module2;



import java.io.IOException;
import java.io.Writer;



public class XmlAndCsvReporter
{
    
    
    private boolean xmlEnabled = false;
    
    
    
    public boolean isXmlEnabled() {
    
    
        return xmlEnabled;
    }
    
    
    public void report(final Writer _out) throws IOException {
    
    
        // CSV Reporting
        _out.write("a;b;c;d;e;f");
        if (isXmlEnabled()) {
            _out.write("<xml></xml>");
        }
        
    }
    
    
    public void setXmlEnabled(final boolean _xmlEnabled) {
    
    
        xmlEnabled = _xmlEnabled;
    }
    
    
}
