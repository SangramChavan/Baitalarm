/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2016-06-04 07:06:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.action.GoogleSafeBrowsing;
import java.net.URLDecoder;
import com.action.CrawlWebsite;

public final class check_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


String url=URLDecoder.decode(request.getParameter("url")) ;
String redirect=URLDecoder.decode(request.getParameter("redirect")) ;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/theme/js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/theme/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/theme/js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/theme/js/main.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("function fnRedirect(url)\r\n");
      out.write("{\r\n");
      out.write("\t\r\n");
      out.write("\tsetInterval(function(){window.location.href=url;}, 2000);\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("function fnSubmit(){\r\n");
      out.write("\tstr='url=");
      out.print(request.getParameter("url"));
      out.write("&redirect=");
      out.print(redirect);
      out.write("';\r\n");
      out.write("\t$.post(\"");
      out.print(request.getContextPath());
      out.write("/theme/tiles/ajax.jsp?methodId=checkSite\",\r\n");
      out.write("\t\t\tstr,\r\n");
      out.write("\t\t\tfunction(data) {\r\n");
      out.write("data=$.trim(data);  \r\n");
      out.write("//alert(data);\r\n");
      out.write("if(data=='1'){\r\n");
      out.write("\tfnRedirect('");
      out.print(request.getContextPath());
      out.write("/pages/phishing.jsp?url=");
      out.print(request.getParameter("url"));
      out.write("');\r\n");
      out.write("}else{\r\n");
      out.write("\tfnRedirect('");
      out.print(url);
      out.write("');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("    Checking For Phishing Site \r\n");
      out.write("    <img src=\"");
      out.print(request.getContextPath());
      out.write("/theme/images/loading.gif\"/>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<script>\r\n");
      out.write("fnSubmit();\r\n");
      out.write("</script>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
