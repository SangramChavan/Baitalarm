/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2016-06-04 06:28:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.helper.UserModel;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/pages/../theme/tiles/menu.jsp", Long.valueOf(1458233562015L));
    _jspx_dependants.put("/WEB-INF/displaytag-12.tld", Long.valueOf(1425421529793L));
    _jspx_dependants.put("/pages/../theme/tiles/inc.jsp", Long.valueOf(1425419034000L));
    _jspx_dependants.put("/pages/../theme/tiles/footer.jsp", Long.valueOf(1458238938672L));
  }

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <title>PhishGuard</title>\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/looks.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->       \r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/images/ico/PinterestLogo.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/images/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/images/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/images/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/images/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("    ");
      out.write("\n");
      out.write("</head><!--/head-->\n");
      out.write("<body>\n");
      out.write("   ");
      out.write('\r');
      out.write('\n');

UserModel um=null;
String role="";
boolean isLogin=false;
String name="";
if(session.getAttribute("USER_MODEL")!=null){
	um=(UserModel)session.getAttribute("USER_MODEL");
	name=um.getFname()+" "+um.getLname();
	isLogin=true;
}

      out.write("\r\n");
      out.write("\r\n");
      out.write(" <header class=\"navbar navbar-inverse navbar-fixed-top wet-asphalt\" role=\"banner\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"");
      out.print(request.getContextPath());
      out.write("/pages/login.jsp\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/theme/images/phil.png\" height=\"40\" alt=\"logo\">MailGuard</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\">\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                     \r\n");
      out.write("                    \r\n");
      out.write("                        ");
if(isLogin){ 
      out.write("\r\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/pages/inbox.jsp\">Inbox</a></li>\r\n");
      out.write("<!--                          class=\"active\" -->\r\n");
      out.write("                          <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/pages/spam.jsp\">Spam</a></li>\r\n");
      out.write("                          <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/pages/algorithm.jsp\">Algorithm</a></li>\r\n");
      out.write("                           <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/pages/compose.jsp\">Compose</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/theme/tiles/ajax.jsp?methodId=logout\">Logout</a></li>   \r\n");
      out.write("                    ");
}else{ 
      out.write("\r\n");
      out.write("                     <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/pages/user_registration.jsp\">Register</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/pages/login.jsp\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/pages/aboutProject.jsp\">About Project</a></li>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                    \r\n");
      out.write("<!--                     <li><a href=\"portfolio.html\">Portfolio</a></li> -->\r\n");
      out.write("<!--                     <li class=\"dropdown\"> -->\r\n");
      out.write("<!--                         <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Pages <i class=\"icon-angle-down\"></i></a> -->\r\n");
      out.write("<!--                         <ul class=\"dropdown-menu\"> -->\r\n");
      out.write("<!--                             <li><a href=\"career.html\">Career</a></li> -->\r\n");
      out.write("<!--                             <li><a href=\"blog-item.html\">Blog Single</a></li> -->\r\n");
      out.write("<!--                             <li><a href=\"pricing.html\">Pricing</a></li> -->\r\n");
      out.write("<!--                             <li><a href=\"404.html\">404</a></li> -->\r\n");
      out.write("<!--                             <li><a href=\"registration.html\">Registration</a></li> -->\r\n");
      out.write("<!--                             <li class=\"divider\"></li> -->\r\n");
      out.write("<!--                             <li><a href=\"privacy.html\">Privacy Policy</a></li> -->\r\n");
      out.write("<!--                             <li><a href=\"terms.html\">Terms of Use</a></li> -->\r\n");
      out.write("<!--                         </ul> -->\r\n");
      out.write("<!--                     </li> -->\r\n");
      out.write("<!--                     <li><a href=\"blog.html\">Blog</a></li>  -->\r\n");
      out.write("<!--                     <li><a href=\"contact-us.html\">Contact</a></li> -->\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header><!--/header-->");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("       <section id=\"title\" class=\"emerald\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <h1>Login</h1>\n");
      out.write("                    \n");
      out.write("                </div>   \n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section><!--/#title-->     \n");
      out.write("    <section id=\"registration\" class=\"container\">\n");
      out.write("        <form class=\"center\" id=\"contact-form\" action=\"javascript:fnSubmit();\">\n");
      out.write("            <fieldset class=\"registration-form\">\n");
      out.write("         \n");
      out.write("             \n");
      out.write("           \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                <label for=\"name\">Username</label>\n");
      out.write("                    <input type=\"text\" id=\"username\" name=\"username\" placeholder=\"Username\" class=\"form-control\"  required=\"required\" >\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("             \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                <label for=\"name\">Password</label>\n");
      out.write("                    <input type=\"password\" id=\"userpass\" name=\"userpass\" placeholder=\"Password\" class=\"form-control\" required=\"required\">\n");
      out.write("                </div>\n");
      out.write("             \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button class=\"btn btn-success btn-md btn-block\" type=\"submit\">Login</button>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("        <DIV id=\"mainDivId\" style=\"display: none;text-align: center;\">\n");
      out.write("        Loading...<img src=\"");
      out.print(request.getContextPath());
      out.write("/theme/images/loading.gif\"/><BR>\n");
      out.write("        <span id=\"textId1\" style=\"display: none;text-decoration: blink;\">Loading Emails From Your Inbox</span><BR>\n");
      out.write("        <span id=\"textId1\" style=\"display: none;text-decoration: blink;\">1st time Fetching of Email might take a lot of time</span><BR>\n");
      out.write("        <span id=\"textId2\" style=\"display: none;text-decoration: blink;\">&nbsp;</span>\n");
      out.write("        </DIV>\n");
      out.write("        \n");
      out.write("    </section><!--/#registration-->   \n");
      out.write(" \n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("   ");
      out.write(" <footer id=\"footer\" class=\"midnight-blue\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                    &copy; 2016 All Rights Reserved.\r\n");
      out.write("                </div>\r\n");
      out.write("<!--                 <div class=\"col-sm-6\"> -->\r\n");
      out.write("<!--                     <ul class=\"pull-right\"> -->\r\n");
      out.write("\r\n");
      out.write("<!--                         <li><a id=\"gototop\" class=\"gototop\" href=\"#\"><i class=\"icon-chevron-up\"></i></a></li>#gototop -->\r\n");
      out.write("<!--                     </ul> -->\r\n");
      out.write("<!--                 </div> -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer><!--/#footer-->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
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
      out.write("/theme/js/main.js\"></script>");
      out.write("\n");
      out.write("   <script>\n");
      out.write("function fnSubmit(){\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t var str = $( \"#contact-form\" ).serialize();\n");
      out.write("\t$.post(\"");
      out.print(request.getContextPath());
      out.write("/theme/tiles/ajax.jsp?methodId=checkLogin\",\n");
      out.write("\t\t\tstr,\n");
      out.write("\t\t\tfunction(data) {\n");
      out.write("data=$.trim(data);  \n");
      out.write("\n");
      out.write("if(data=='false'){\n");
      out.write("\talert('Login Id/password is invalid!');\n");
      out.write("$('#contact-form')[0].reset();\n");
      out.write("return;\n");
      out.write("}else{\n");
      out.write("\t$('#contact-form').hide();\n");
      out.write("\t$('#mainDivId').show();\n");
      out.write("\tmyVar =setInterval(\"fn1()\", 2000);\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("myVar = 0;\n");
      out.write("function fn1(){\n");
      out.write("\t$('#textId1').show();\n");
      out.write("\tclearInterval(myVar);\n");
      out.write("\tmyVar =setInterval(\"fn2()\",3000);\n");
      out.write("}\n");
      out.write("function fn2(){\n");
      out.write("\t$('#textId2').show();\n");
      out.write("\tclearInterval(myVar);\n");
      out.write("\tmyVar=setInterval(\"fn3()\",3000);\n");
      out.write("\twindow.location.href='");
      out.print(request.getContextPath());
      out.write("/pages/inbox.jsp';\n");
      out.write("}\n");
      out.write("function fn3(){\n");
      out.write("\t$('#textId3').show();\n");
      out.write("\tclearInterval(myVar);\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
