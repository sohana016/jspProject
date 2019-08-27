/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.prt;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author A D M I N
 */
public class Input extends TagSupport{

    @Override
    public int doStartTag() throws JspException {
      
           
        try {
            int[] list={1,2,3,4};
             JspWriter out = pageContext.getOut();
            out.write("<select>");
            for(int i:list){
                out.write("<option>"+i+"</option");
            }
//            out.write("<option>fgf</option");
            out.write("</select>");
        } catch (IOException ex) {
            Logger.getLogger(Input.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SKIP_BODY;
       //return super.doStartTag(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
