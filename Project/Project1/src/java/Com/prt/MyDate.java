/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.prt;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author A D M I N
 */
public class MyDate extends SimpleTagSupport{

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().write("hello");
       // super.doTag(); //To change body of generated methods, choose Tools | Templates.
    }
    
  
}
