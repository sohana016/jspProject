package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/tags/header.tag");
    _jspx_dependants.add("/WEB-INF/tags/footer.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_selectOneRadio_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_commandButton_value_styleClass_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_selectOneMenu_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_commandLink_value_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_inputText_value_size_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_selectItem_itemValue_itemLabel_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_selectItems_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_h_selectOneRadio_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_commandButton_value_styleClass_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_selectOneMenu_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_commandLink_value_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_inputText_value_size_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_selectItem_itemValue_itemLabel_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_selectItems_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_h_selectOneRadio_value.release();
    _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.release();
    _jspx_tagPool_h_selectOneMenu_value.release();
    _jspx_tagPool_h_commandLink_value_action_nobody.release();
    _jspx_tagPool_f_view.release();
    _jspx_tagPool_h_inputText_value_size_id_nobody.release();
    _jspx_tagPool_f_selectItem_itemValue_itemLabel_nobody.release();
    _jspx_tagPool_h_form.release();
    _jspx_tagPool_f_selectItems_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      if (_jspx_meth_f_view_0(_jspx_page_context))
        return;
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_f_view_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_view_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.ViewTag.class) : new com.sun.faces.taglib.jsf_core.ViewTag();
    _jspx_th_f_view_0.setPageContext(_jspx_page_context);
    _jspx_th_f_view_0.setParent(null);
    _jspx_th_f_view_0.setJspId("id8");
    int _jspx_eval_f_view_0 = _jspx_th_f_view_0.doStartTag();
    if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_view_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_view_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    <html>\n");
        out.write("        <head>\n");
        out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("            <title>Add_Information</title>\n");
        out.write("            <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
        out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
        out.write("            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
        out.write("            <style>\n");
        out.write("                body{\n");
        out.write("                    background-image: url(\"resource/pic.png\");\n");
        out.write("                   \n");
        out.write("                }\n");
        out.write("\n");
        out.write("            </style>\n");
        out.write("        </head>\n");
        out.write("        <body>\n");
        out.write("            \n");
        out.write("<nav class=\"navbar navbar-inverse\">\n");
        out.write("  <div class=\"container-fluid\">\n");
        out.write("    <div class=\"navbar-header\">\n");
        out.write("      <a class=\"navbar-brand\" href=\"#\">INFORMATION</a>\n");
        out.write("    </div>\n");
        out.write("    <ul class=\"nav navbar-nav\">\n");
        out.write("      <li class=\"active\"><a href=\"#\">Home</a></li>\n");
        out.write("      <li><a href=\"#\">Details</a></li>\n");
        out.write("      <li><a href=\"#\">Register</a></li>\n");
        out.write("    </ul>\n");
        out.write("    <form class=\"navbar-form navbar-left\" action=\"/action_page.php\">\n");
        out.write("      <div class=\"form-group\">\n");
        out.write("        <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
        out.write("      </div>\n");
        out.write("      <button type=\"submit\" class=\"btn btn-default\">Search</button>\n");
        out.write("    </form>\n");
        out.write("  </div>\n");
        out.write("</nav>\n");
        out.write("             <center>\n");
        out.write("                 <div id =\"shado\" style=\"text-align: center;height:500px;width:450px;margin: 20px; border: 2px solid black\" >\n");
        out.write("                      ");
        if (_jspx_meth_tags_header_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                     \n");
        out.write("                \n");
        out.write("                   \n");
        out.write("            <table>\n");
        out.write("               ");
        if (_jspx_meth_h_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            </table>\n");
        out.write("\n");
        out.write("                \n");
        out.write("               \n");
        out.write("                ");
        if (_jspx_meth_tags_footer_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            </div>\n");
        out.write("             </center>    \n");
        out.write("        </body>\n");
        out.write("    </html>\n");
        int evalDoAfterBody = _jspx_th_f_view_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_f_view_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
      return true;
    }
    _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
    return false;
  }

  private boolean _jspx_meth_tags_header_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tags:header
    org.apache.jsp.tag.web.header_tag _jspx_th_tags_header_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.header_tag.class) : new org.apache.jsp.tag.web.header_tag();
    _jspx_th_tags_header_0.setJspContext(_jspx_page_context);
    _jspx_th_tags_header_0.setParent(_jspx_th_f_view_0);
    _jspx_th_tags_header_0.setHeading("Registration_From ");
    _jspx_th_tags_header_0.doTag();
    return false;
  }

  private boolean _jspx_meth_h_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.FormTag.class) : new com.sun.faces.taglib.html_basic.FormTag();
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_form_0.setJspId("id58");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_form_0.doInitBody();
      }
      do {
        out.write(" \n");
        out.write("                    <tr>\n");
        out.write("                       <td><h4> First Name</h4></td>\n");
        out.write("                        <td>");
        if (_jspx_meth_h_inputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                        </tr>\n");
        out.write("                        <tr>\n");
        out.write("                            <td> </td>\n");
        out.write("                        </tr>\n");
        out.write("                    <tr>\n");
        out.write("                        <td><h4>Last Name</h4></td>\n");
        out.write("                        <td>");
        if (_jspx_meth_h_inputText_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                    </tr>\n");
        out.write("                    <tr>\n");
        out.write("                      <td>  <h4>Address</h4></td>\n");
        out.write("                        <td>");
        if (_jspx_meth_h_inputText_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                    </tr>\n");
        out.write("                    <tr>\n");
        out.write("                       <td>  <h4>Mobile No </h4></td>\n");
        out.write("                        <td>");
        if (_jspx_meth_h_inputText_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                    </tr>\n");
        out.write("                    <tr>\n");
        out.write("                        <td><h4>Date of Birth</td> </td>\n");
        out.write("                        <td>");
        if (_jspx_meth_h_inputText_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                    </tr>\n");
        out.write("                    <tr>\n");
        out.write("                       <td><h4> Gender</td></td>\n");
        out.write("                        <td>\n");
        out.write("                            ");
        if (_jspx_meth_h_selectOneRadio_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        </td>\n");
        out.write("                    </tr>\n");
        out.write("                   \n");
        out.write("                    <tr>\n");
        out.write("                      <h4>  <td>Schedule</td>\n");
        out.write("                        <td>\n");
        out.write("                            ");
        if (_jspx_meth_h_selectOneMenu_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        </td>\n");
        out.write("                    </tr>\n");
        out.write("                    <tr>\n");
        out.write("                        <td>");
        if (_jspx_meth_h_commandButton_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </td>\n");
        out.write("                        <td>\n");
        out.write("                        ");
        if (_jspx_meth_h_commandButton_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        </td>\n");
        out.write("                        </tr>\n");
        out.write("                    <tr>\n");
        out.write("                        <td> ");
        if (_jspx_meth_h_commandLink_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                    </tr>\n");
        out.write("                   \n");
        out.write("                    \n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
      return true;
    }
    _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_inputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_0.setJspId("id66");
    _jspx_th_h_inputText_0.setId("firstName");
    _jspx_th_h_inputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{employee.firstName}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_inputText_0.setSize(org.apache.jasper.runtime.PageContextImpl.getValueExpression("25", (PageContext)_jspx_page_context, int.class, null));
    int _jspx_eval_h_inputText_0 = _jspx_th_h_inputText_0.doStartTag();
    if (_jspx_th_h_inputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_size_id_nobody.reuse(_jspx_th_h_inputText_0);
      return true;
    }
    _jspx_tagPool_h_inputText_value_size_id_nobody.reuse(_jspx_th_h_inputText_0);
    return false;
  }

  private boolean _jspx_meth_h_inputText_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_1.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_1.setJspId("id79");
    _jspx_th_h_inputText_1.setId("lastName");
    _jspx_th_h_inputText_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{employee.lastName}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_inputText_1.setSize(org.apache.jasper.runtime.PageContextImpl.getValueExpression("25", (PageContext)_jspx_page_context, int.class, null));
    int _jspx_eval_h_inputText_1 = _jspx_th_h_inputText_1.doStartTag();
    if (_jspx_th_h_inputText_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_size_id_nobody.reuse(_jspx_th_h_inputText_1);
      return true;
    }
    _jspx_tagPool_h_inputText_value_size_id_nobody.reuse(_jspx_th_h_inputText_1);
    return false;
  }

  private boolean _jspx_meth_h_inputText_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_2.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_2.setJspId("id88");
    _jspx_th_h_inputText_2.setId("address");
    _jspx_th_h_inputText_2.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{employee.address}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_inputText_2.setSize(org.apache.jasper.runtime.PageContextImpl.getValueExpression("25", (PageContext)_jspx_page_context, int.class, null));
    int _jspx_eval_h_inputText_2 = _jspx_th_h_inputText_2.doStartTag();
    if (_jspx_th_h_inputText_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_size_id_nobody.reuse(_jspx_th_h_inputText_2);
      return true;
    }
    _jspx_tagPool_h_inputText_value_size_id_nobody.reuse(_jspx_th_h_inputText_2);
    return false;
  }

  private boolean _jspx_meth_h_inputText_3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_3.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_3.setJspId("id97");
    _jspx_th_h_inputText_3.setId("mbileNo");
    _jspx_th_h_inputText_3.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{employee.mobileNo}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_inputText_3.setSize(org.apache.jasper.runtime.PageContextImpl.getValueExpression("25", (PageContext)_jspx_page_context, int.class, null));
    int _jspx_eval_h_inputText_3 = _jspx_th_h_inputText_3.doStartTag();
    if (_jspx_th_h_inputText_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_size_id_nobody.reuse(_jspx_th_h_inputText_3);
      return true;
    }
    _jspx_tagPool_h_inputText_value_size_id_nobody.reuse(_jspx_th_h_inputText_3);
    return false;
  }

  private boolean _jspx_meth_h_inputText_4(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_4.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_4.setJspId("id106");
    _jspx_th_h_inputText_4.setId("dateOfBirth");
    _jspx_th_h_inputText_4.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{employee.dateofBirth}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_inputText_4.setSize(org.apache.jasper.runtime.PageContextImpl.getValueExpression("25", (PageContext)_jspx_page_context, int.class, null));
    int _jspx_eval_h_inputText_4 = _jspx_th_h_inputText_4.doStartTag();
    if (_jspx_th_h_inputText_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_size_id_nobody.reuse(_jspx_th_h_inputText_4);
      return true;
    }
    _jspx_tagPool_h_inputText_value_size_id_nobody.reuse(_jspx_th_h_inputText_4);
    return false;
  }

  private boolean _jspx_meth_h_selectOneRadio_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:selectOneRadio
    com.sun.faces.taglib.html_basic.SelectOneRadioTag _jspx_th_h_selectOneRadio_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.SelectOneRadioTag.class) : new com.sun.faces.taglib.html_basic.SelectOneRadioTag();
    _jspx_th_h_selectOneRadio_0.setPageContext(_jspx_page_context);
    _jspx_th_h_selectOneRadio_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_selectOneRadio_0.setJspId("id115");
    _jspx_th_h_selectOneRadio_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{employee.gender}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_selectOneRadio_0 = _jspx_th_h_selectOneRadio_0.doStartTag();
    if (_jspx_eval_h_selectOneRadio_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_selectOneRadio_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_selectOneRadio_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_selectOneRadio_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_f_selectItem_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_selectOneRadio_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_f_selectItem_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_selectOneRadio_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_h_selectOneRadio_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_selectOneRadio_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_selectOneRadio_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_selectOneRadio_value.reuse(_jspx_th_h_selectOneRadio_0);
      return true;
    }
    _jspx_tagPool_h_selectOneRadio_value.reuse(_jspx_th_h_selectOneRadio_0);
    return false;
  }

  private boolean _jspx_meth_f_selectItem_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_selectOneRadio_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:selectItem
    com.sun.faces.taglib.jsf_core.SelectItemTag _jspx_th_f_selectItem_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.SelectItemTag.class) : new com.sun.faces.taglib.jsf_core.SelectItemTag();
    _jspx_th_f_selectItem_0.setPageContext(_jspx_page_context);
    _jspx_th_f_selectItem_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_selectOneRadio_0);
    _jspx_th_f_selectItem_0.setJspId("id117");
    _jspx_th_f_selectItem_0.setItemLabel(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Male", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_f_selectItem_0.setItemValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Male", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_f_selectItem_0 = _jspx_th_f_selectItem_0.doStartTag();
    if (_jspx_th_f_selectItem_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_selectItem_itemValue_itemLabel_nobody.reuse(_jspx_th_f_selectItem_0);
      return true;
    }
    _jspx_tagPool_f_selectItem_itemValue_itemLabel_nobody.reuse(_jspx_th_f_selectItem_0);
    return false;
  }

  private boolean _jspx_meth_f_selectItem_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_selectOneRadio_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:selectItem
    com.sun.faces.taglib.jsf_core.SelectItemTag _jspx_th_f_selectItem_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.SelectItemTag.class) : new com.sun.faces.taglib.jsf_core.SelectItemTag();
    _jspx_th_f_selectItem_1.setPageContext(_jspx_page_context);
    _jspx_th_f_selectItem_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_selectOneRadio_0);
    _jspx_th_f_selectItem_1.setJspId("id119");
    _jspx_th_f_selectItem_1.setItemLabel(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Female", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_f_selectItem_1.setItemValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Female", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_f_selectItem_1 = _jspx_th_f_selectItem_1.doStartTag();
    if (_jspx_th_f_selectItem_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_selectItem_itemValue_itemLabel_nobody.reuse(_jspx_th_f_selectItem_1);
      return true;
    }
    _jspx_tagPool_f_selectItem_itemValue_itemLabel_nobody.reuse(_jspx_th_f_selectItem_1);
    return false;
  }

  private boolean _jspx_meth_h_selectOneMenu_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:selectOneMenu
    com.sun.faces.taglib.html_basic.SelectOneMenuTag _jspx_th_h_selectOneMenu_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.SelectOneMenuTag.class) : new com.sun.faces.taglib.html_basic.SelectOneMenuTag();
    _jspx_th_h_selectOneMenu_0.setPageContext(_jspx_page_context);
    _jspx_th_h_selectOneMenu_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_selectOneMenu_0.setJspId("id129");
    _jspx_th_h_selectOneMenu_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{employee.schedule}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_selectOneMenu_0 = _jspx_th_h_selectOneMenu_0.doStartTag();
    if (_jspx_eval_h_selectOneMenu_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_selectOneMenu_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_selectOneMenu_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_selectOneMenu_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_f_selectItems_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_selectOneMenu_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_h_selectOneMenu_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_selectOneMenu_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_selectOneMenu_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_selectOneMenu_value.reuse(_jspx_th_h_selectOneMenu_0);
      return true;
    }
    _jspx_tagPool_h_selectOneMenu_value.reuse(_jspx_th_h_selectOneMenu_0);
    return false;
  }

  private boolean _jspx_meth_f_selectItems_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_selectOneMenu_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:selectItems
    com.sun.faces.taglib.jsf_core.SelectItemsTag _jspx_th_f_selectItems_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.SelectItemsTag.class) : new com.sun.faces.taglib.jsf_core.SelectItemsTag();
    _jspx_th_f_selectItems_0.setPageContext(_jspx_page_context);
    _jspx_th_f_selectItems_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_selectOneMenu_0);
    _jspx_th_f_selectItems_0.setJspId("id131");
    _jspx_th_f_selectItems_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{times.sch}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_f_selectItems_0 = _jspx_th_f_selectItems_0.doStartTag();
    if (_jspx_th_f_selectItems_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_selectItems_value_nobody.reuse(_jspx_th_f_selectItems_0);
      return true;
    }
    _jspx_tagPool_f_selectItems_value_nobody.reuse(_jspx_th_f_selectItems_0);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_0.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_0.setJspId("id138");
    _jspx_th_h_commandButton_0.setStyleClass(org.apache.jasper.runtime.PageContextImpl.getValueExpression("btn btn-success btn-md", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_commandButton_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Submit", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_commandButton_0.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{employee.submit()}", (PageContext)_jspx_page_context, null, java.lang.Object.class, new Class[] {}));
    int _jspx_eval_h_commandButton_0 = _jspx_th_h_commandButton_0.doStartTag();
    if (_jspx_th_h_commandButton_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.reuse(_jspx_th_h_commandButton_0);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.reuse(_jspx_th_h_commandButton_0);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_1.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_1.setJspId("id142");
    _jspx_th_h_commandButton_1.setStyleClass(org.apache.jasper.runtime.PageContextImpl.getValueExpression("btn btn-primary btn-md", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_commandButton_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Reset", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_commandButton_1.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{employee.reset()}", (PageContext)_jspx_page_context, null, java.lang.Object.class, new Class[] {}));
    int _jspx_eval_h_commandButton_1 = _jspx_th_h_commandButton_1.doStartTag();
    if (_jspx_th_h_commandButton_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.reuse(_jspx_th_h_commandButton_1);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.reuse(_jspx_th_h_commandButton_1);
    return false;
  }

  private boolean _jspx_meth_h_commandLink_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandLink
    com.sun.faces.taglib.html_basic.CommandLinkTag _jspx_th_h_commandLink_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandLinkTag.class) : new com.sun.faces.taglib.html_basic.CommandLinkTag();
    _jspx_th_h_commandLink_0.setPageContext(_jspx_page_context);
    _jspx_th_h_commandLink_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandLink_0.setJspId("id148");
    _jspx_th_h_commandLink_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("SignIN", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_commandLink_0.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{employee.logt()}", (PageContext)_jspx_page_context, null, java.lang.Object.class, new Class[] {}));
    int _jspx_eval_h_commandLink_0 = _jspx_th_h_commandLink_0.doStartTag();
    if (_jspx_th_h_commandLink_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandLink_value_action_nobody.reuse(_jspx_th_h_commandLink_0);
      return true;
    }
    _jspx_tagPool_h_commandLink_value_action_nobody.reuse(_jspx_th_h_commandLink_0);
    return false;
  }

  private boolean _jspx_meth_tags_footer_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tags:footer
    org.apache.jsp.tag.web.footer_tag _jspx_th_tags_footer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.footer_tag.class) : new org.apache.jsp.tag.web.footer_tag();
    _jspx_th_tags_footer_0.setJspContext(_jspx_page_context);
    _jspx_th_tags_footer_0.setParent(_jspx_th_f_view_0);
    _jspx_th_tags_footer_0.setContact("Contact Us: 01686017809");
    _jspx_th_tags_footer_0.setAddress(" Address: Dhaka");
    _jspx_th_tags_footer_0.doTag();
    return false;
  }
}
