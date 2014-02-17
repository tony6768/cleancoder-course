
package com.tocea.courses.cleancode.module2;



import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tocea.courses.cleancode.module2.api.Command;
import com.tocea.courses.cleancode.module2.api.IPivertService;



public class RefactoringExample7 implements Command
{
    
    
    private IPivertService pivertService;
    
    
    
    public void execute(final HttpServletRequest _request, final HttpServletResponse _response) {
    
    
        String list = "<html>" + "<body>" + "<table id=\"end-points\">";
        try {
            final Statement statement = getPivertConnection().createStatement();
            final ResultSet endPoints = statement.executeQuery("select id, name from endpoints");
            while (endPoints.next()) {
                final String name = endPoints.getString(2);
                list += "<tr><td>" + name + "</td></tr>";
            }
            list += "</table>";
            list += "</body>" + "</html>";
            
            _response.getWriter().print(list);
        } catch (final Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    private IPivertService getPivertConnection() {
    
    
        return pivertService;
    }
    
}
