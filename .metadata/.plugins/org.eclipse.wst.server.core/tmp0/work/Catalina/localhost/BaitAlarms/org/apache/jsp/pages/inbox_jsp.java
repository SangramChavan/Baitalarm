/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2016-06-04 06:38:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.helper.EmailModel;
import java.util.List;
import com.helper.SpamModel;
import com.helper.PhishMailGuard;
import javax.mail.Message;
import com.helper.ReadRecentMail;
import com.helper.SimpleCryptoAndroidJava;
import com.helper.UserModel;

public final class inbox_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fstyle_005fsort_005frequestURI_005fpagesize_005fname_005fid_005fexport_005fdefaultsort_005fclass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fsortProperty_005fproperty_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fstyle_005fsort_005frequestURI_005fpagesize_005fname_005fid_005fexport_005fdefaultsort_005fclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fsortProperty_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fstyle_005fsort_005frequestURI_005fpagesize_005fname_005fid_005fexport_005fdefaultsort_005fclass.release();
    _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fsortProperty_005fproperty_005fnobody.release();
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
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
      out.write("\r\n");
      out.write("</head>   \r\n");
      out.write("<!--/head-->\r\n");
      out.write("<body>\r\n");
      out.write("\t");
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
      out.write('\r');
      out.write('\n');

 	List<EmailModel> msg = null;
					int size=0;		
 	if (um != null) 
 	{
 		String email = um.getEmail();
 		String pass = SimpleCryptoAndroidJava.decryptString(um
 				.getPass());
 		msg = ReadRecentMail.getMyEmails(email, pass, um.getUserid());
 		session.setAttribute("MAILS", msg);
 		if(msg!=null){
			size=msg.size();
		}

 	}
 
      out.write("\r\n");
      out.write("       <section id=\"title\" class=\"emerald\" style=\"padding: 20px;\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                    <h1>Inbox Mails(");
      out.print(size);
      out.write(")</h1>\r\n");
      out.write("                    \r\n");
      out.write("                </div>   \r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section><!--/#title-->  \r\n");
      out.write("\t<section id=\"recent-works\" style=\"padding: 20px;\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write(" ");
      //  display:table
      org.displaytag.tags.TableTag _jspx_th_display_005ftable_005f0 = (org.displaytag.tags.TableTag) _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fstyle_005fsort_005frequestURI_005fpagesize_005fname_005fid_005fexport_005fdefaultsort_005fclass.get(org.displaytag.tags.TableTag.class);
      _jspx_th_display_005ftable_005f0.setPageContext(_jspx_page_context);
      _jspx_th_display_005ftable_005f0.setParent(null);
      // /pages/inbox.jsp(51,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setName("sessionScope.MAILS");
      // /pages/inbox.jsp(51,1) name = class type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setClass("simple");
      // /pages/inbox.jsp(51,1) name = requestURI type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setRequestURI("inbox.jsp");
      // /pages/inbox.jsp(51,1) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setUid("ipanalysisTableId");
      // /pages/inbox.jsp(51,1) name = pagesize type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setPagesize(10);
      // /pages/inbox.jsp(51,1) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setStyle("simple");
      // /pages/inbox.jsp(51,1) name = defaultsort type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setDefaultsort(1);
      // /pages/inbox.jsp(51,1) name = export type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setExport(false);
      // /pages/inbox.jsp(51,1) name = sort type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005ftable_005f0.setSort("list");
      int _jspx_eval_display_005ftable_005f0 = _jspx_th_display_005ftable_005f0.doStartTag();
      if (_jspx_eval_display_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object ipanalysisTableId = null;
        java.lang.Integer ipanalysisTableId_rowNum = null;
        if (_jspx_eval_display_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_display_005ftable_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_display_005ftable_005f0.doInitBody();
        }
        ipanalysisTableId = (java.lang.Object) _jspx_page_context.findAttribute("ipanalysisTableId");
        ipanalysisTableId_rowNum = (java.lang.Integer) _jspx_page_context.findAttribute("ipanalysisTableId_rowNum");
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_display_005fsetProperty_005f0(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          out.write('	');

EmailModel m=(EmailModel)pageContext.getAttribute("ipanalysisTableId");

          out.write("\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_display_005fcolumn_005f0(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t");
          //  display:column
          org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f1 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable.get(org.displaytag.tags.ColumnTag.class);
          _jspx_th_display_005fcolumn_005f1.setPageContext(_jspx_page_context);
          _jspx_th_display_005fcolumn_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
          // /pages/inbox.jsp(62,7) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_display_005fcolumn_005f1.setTitle("Subject");
          // /pages/inbox.jsp(62,7) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_display_005fcolumn_005f1.setSortable(true);
          int _jspx_eval_display_005fcolumn_005f1 = _jspx_th_display_005fcolumn_005f1.doStartTag();
          if (_jspx_eval_display_005fcolumn_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_display_005fcolumn_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_display_005fcolumn_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_display_005fcolumn_005f1.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t<a href=\"#\" onclick='javascript:window.open (\"");
              out.print(request.getContextPath());
              out.write("/pages/showMessage.jsp?index=");
              out.print(m.getMessageId());
              out.write("\", \"Email Content\",\"scrollbars=yes,status=0,toolbar=0,width=800,height=400\");' >");
              out.print(m.getSub());
              out.write("</a>\r\n");
              out.write("\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_display_005fcolumn_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_display_005fcolumn_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_display_005fcolumn_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable.reuse(_jspx_th_display_005fcolumn_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable.reuse(_jspx_th_display_005fcolumn_005f1);
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_display_005fcolumn_005f2(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_display_005ftable_005f0.doAfterBody();
          ipanalysisTableId = (java.lang.Object) _jspx_page_context.findAttribute("ipanalysisTableId");
          ipanalysisTableId_rowNum = (java.lang.Integer) _jspx_page_context.findAttribute("ipanalysisTableId_rowNum");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_display_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_display_005ftable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fstyle_005fsort_005frequestURI_005fpagesize_005fname_005fid_005fexport_005fdefaultsort_005fclass.reuse(_jspx_th_display_005ftable_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fstyle_005fsort_005frequestURI_005fpagesize_005fname_005fid_005fexport_005fdefaultsort_005fclass.reuse(_jspx_th_display_005ftable_005f0);
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--/.row-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!--/#recent-works-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
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
      out.write("\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_display_005fsetProperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  display:setProperty
    org.displaytag.tags.SetPropertyTag _jspx_th_display_005fsetProperty_005f0 = (org.displaytag.tags.SetPropertyTag) _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody.get(org.displaytag.tags.SetPropertyTag.class);
    _jspx_th_display_005fsetProperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_display_005fsetProperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /pages/inbox.jsp(55,7) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fsetProperty_005f0.setName("paging.banner.placement");
    // /pages/inbox.jsp(55,7) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fsetProperty_005f0.setValue("bottom");
    int _jspx_eval_display_005fsetProperty_005f0 = _jspx_th_display_005fsetProperty_005f0.doStartTag();
    if (_jspx_th_display_005fsetProperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_display_005fsetProperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_display_005fsetProperty_005f0);
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f0 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f0.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /pages/inbox.jsp(60,7) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setTitle("From");
    // /pages/inbox.jsp(60,7) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setProperty("fromid");
    // /pages/inbox.jsp(60,7) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f0.setSortable(true);
    int _jspx_eval_display_005fcolumn_005f0 = _jspx_th_display_005fcolumn_005f0.doStartTag();
    if (_jspx_th_display_005fcolumn_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f0);
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f2 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fsortProperty_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f2.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /pages/inbox.jsp(66,7) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f2.setTitle("Date");
    // /pages/inbox.jsp(66,7) name = sortProperty type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f2.setSortProperty("messageId");
    // /pages/inbox.jsp(66,7) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f2.setSortable(true);
    // /pages/inbox.jsp(66,7) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_display_005fcolumn_005f2.setProperty("mdate");
    int _jspx_eval_display_005fcolumn_005f2 = _jspx_th_display_005fcolumn_005f2.doStartTag();
    if (_jspx_th_display_005fcolumn_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fsortProperty_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fsortProperty_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f2);
    return false;
  }
}
