/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.42
 * Generated at: 2019-07-16 09:17:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jspStock_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/User/Documents/NetBeansProjects/Stock/build/web/WEB-INF/lib/jstl-1.2.jar!/META-INF/sql.tld", Long.valueOf(1153363482000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1563186801618L));
    _jspx_dependants.put("jar:file:/C:/Users/User/Documents/NetBeansProjects/Stock/build/web/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153363482000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fscope_005fpassword_005fdriver_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fsql_005fdataSource_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fscope_005fpassword_005fdriver_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fsql_005fdataSource_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fscope_005fpassword_005fdriver_005fnobody.release();
    _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fsql_005fdataSource_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <section id=\"purchase-sale\" class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <aside id=\"purchase\" class=\"col-md-6\"> \n");
      out.write("                    <form action=\"purchaseSubmit.jsp\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Id</td>\n");
      out.write("                        <td><input type=\"number\" name=\"id\" placeholder=\"Input product id\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"name\" placeholder=\"Input product name\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Quantity</td>\n");
      out.write("                        <td><input type=\"number\" name=\"qty\" placeholder=\"Input product Quantity\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Price</td>\n");
      out.write("                        <td><input type=\"number\" name=\"price\" placeholder=\"Input product Price\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><button type=\"submit\" value=\"Purchase\"/>Purchase</td>\n");
      out.write("                        <td><button type=\"reset\" value=\"Reset\"/>Reset</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                    </form>\n");
      out.write("            </aside>\n");
      out.write("                <aside id=\"sale\" class=\"col-md-6\"> \n");
      out.write("                    <form action=\"saleSubmit.jsp\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Id</td>\n");
      out.write("                        <td><input type=\"number\" name=\"id\" placeholder=\"Input product id\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Quantity</td>\n");
      out.write("                        <td><input type=\"number\" name=\"qty\" placeholder=\"Input product Quantity\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Price</td>\n");
      out.write("                        <td><input type=\"number\" name=\"price\" placeholder=\"Input product Price\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><button type=\"submit\" value=\"Sale\"/>Sale</td>\n");
      out.write("                        <td><button type=\"reset\" value=\"Reset\"/>Reset</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                    </form>\n");
      out.write("            </aside>\n");
      out.write("            </div>\n");
      out.write("            <section class=\"row\" id=\"showData\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <th style=\"min-width: 40px\">ID</th>\n");
      out.write("                            <th style=\"min-width: 100px\">Product</th>\n");
      out.write("                            <th style=\"min-width: 100px\">Quantity</th>\n");
      out.write("                            <th style=\"min-width: 100px\">Price</th>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
      if (_jspx_meth_sql_005fsetDataSource_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_sql_005fquery_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sql_005fsetDataSource_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_005fsetDataSource_005f0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fscope_005fpassword_005fdriver_005fnobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    boolean _jspx_th_sql_005fsetDataSource_005f0_reused = false;
    try {
      _jspx_th_sql_005fsetDataSource_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sql_005fsetDataSource_005f0.setParent(null);
      // /jspStock.jsp(81,24) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fsetDataSource_005f0.setUrl("jdbc:mysql://localhost:3306/j2ee");
      // /jspStock.jsp(81,24) name = driver type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fsetDataSource_005f0.setDriver("com.mysql.jdbc.Driver");
      // /jspStock.jsp(81,24) name = user type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fsetDataSource_005f0.setUser("root");
      // /jspStock.jsp(81,24) name = password type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fsetDataSource_005f0.setPassword("root");
      // /jspStock.jsp(81,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fsetDataSource_005f0.setVar("con");
      // /jspStock.jsp(81,24) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fsetDataSource_005f0.setScope("session");
      int _jspx_eval_sql_005fsetDataSource_005f0 = _jspx_th_sql_005fsetDataSource_005f0.doStartTag();
      if (_jspx_th_sql_005fsetDataSource_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fscope_005fpassword_005fdriver_005fnobody.reuse(_jspx_th_sql_005fsetDataSource_005f0);
      _jspx_th_sql_005fsetDataSource_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sql_005fsetDataSource_005f0, _jsp_getInstanceManager(), _jspx_th_sql_005fsetDataSource_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sql_005fquery_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_005fquery_005f0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fsql_005fdataSource_005fnobody.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    boolean _jspx_th_sql_005fquery_005f0_reused = false;
    try {
      _jspx_th_sql_005fquery_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sql_005fquery_005f0.setParent(null);
      // /jspStock.jsp(82,24) name = dataSource type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fquery_005f0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${con}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /jspStock.jsp(82,24) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fquery_005f0.setVar("products");
      // /jspStock.jsp(82,24) name = sql type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fquery_005f0.setSql("select * from products;");
      int[] _jspx_push_body_count_sql_005fquery_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_sql_005fquery_005f0 = _jspx_th_sql_005fquery_005f0.doStartTag();
        if (_jspx_th_sql_005fquery_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sql_005fquery_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sql_005fquery_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sql_005fquery_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fsql_005fdataSource_005fnobody.reuse(_jspx_th_sql_005fquery_005f0);
      _jspx_th_sql_005fquery_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sql_005fquery_005f0, _jsp_getInstanceManager(), _jspx_th_sql_005fquery_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /jspStock.jsp(83,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/jspStock.jsp(83,24) '${products.rows}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${products.rows}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /jspStock.jsp(83,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("product");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                            <tr>\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.qty}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                            </tr>\n");
            out.write("                        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
