/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-10-06 11:48:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/../../style/loginstyle.css", Long.valueOf(1665056824802L));
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Yahoo!!</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"Main-container\">\n");
      out.write("\n");
      out.write("    <div class=\"container-login\">\n");
      out.write("\n");
      out.write("        <div class=\"wrap-login\">\n");
      out.write("            <div class=\"login-header\">\n");
      out.write("                <h2 style=\"color:#353c4e;\">Grading System</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"login-pic\">\n");
      out.write("                <img src=\"../../assets/student.svg\" alt=\"IMG\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form class=\"login-form\" action=\"/login.do\" method=\"POST\">\n");
      out.write("                <span class=\"login-form-title\">Login</span>\n");
      out.write("\n");
      out.write("                <div class=\"wrap-input\">\n");
      out.write("                    <input type=\"text\" class=\"input\" name=\"name\" placeholder=\"Email\" required>\n");
      out.write("                    <span class=\"focus-input\"></span>\n");
      out.write("                    <span class=\"symbol-input\">\n");
      out.write("                            <i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>\n");
      out.write("                        </span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"wrap-input\">\n");
      out.write("                    <input type=\"password\" class=\"input\" name=\"password\" placeholder=\"Password\" required>\n");
      out.write("                    <span class=\"focus-input\"></span>\n");
      out.write("                    <span class=\"symbol-input\">\n");
      out.write("                            <i class=\"fa fa-lock\" aria-hidden=\"true\"></i>\n");
      out.write("                        </span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"login-form-btn-container\">\n");
      out.write("                    <button class=\"login-form-btn\" type=\"submit\">Login</button>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"display: flex;justify-content: center;\">\n");
      out.write("                <p><font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font></p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<style scoped>\n");
      out.write("    ");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;700&display=swap');\r\n");
      out.write("\r\n");
      out.write("*{\r\n");
      out.write("    margin: 0px;\r\n");
      out.write("    padding: 0px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("body, html{\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    font-family: 'Poppins',sans-serif;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("}\r\n");
      out.write(".Main-container{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write(".login-header{\r\n");
      out.write("    flex-basis: 100%;\r\n");
      out.write("    margin-top: -108px;\r\n");
      out.write("    margin-bottom: 100px;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("}\r\n");
      out.write(".container-login{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    min-height: 100vh;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    padding: 15px;\r\n");
      out.write("    background: #F3F3FE;\r\n");
      out.write("}\r\n");
      out.write(".wrap-login{\r\n");
      out.write("    width: 960px;\r\n");
      out.write("    background: #fff;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    padding: 177px 130px 33px 95px;\r\n");
      out.write("    box-shadow: 0px 11px 35px 2px rgb(0 0 0 / 14%);\r\n");
      out.write("}\r\n");
      out.write(".login-pic{\r\n");
      out.write("    width: 316px;\r\n");
      out.write("}\r\n");
      out.write(".login-pic img{\r\n");
      out.write("    max-width: 100%;\r\n");
      out.write("}\r\n");
      out.write(".login-form{\r\n");
      out.write("    width: 290px;\r\n");
      out.write("}\r\n");
      out.write(".login-form-title{\r\n");
      out.write("    font-family: 'poppins', sans-serif;\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    color: #353c4e;\r\n");
      out.write("    line-height: 1.2;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-weight: 700;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    display: block;\r\n");
      out.write("    padding-bottom: 54px;\r\n");
      out.write("}\r\n");
      out.write(".wrap-input{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    z-index: 1;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write(".input{\r\n");
      out.write("    font-family: 'Poppins' , sans-serif;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    font-weight: 500;\r\n");
      out.write("    line-height: 1.5;\r\n");
      out.write("    color: #666666;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    border: none;\r\n");
      out.write("    display: block;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    background: #e6e6e6;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    border-radius: 25px;\r\n");
      out.write("    padding: 0 30px 0 68px;\r\n");
      out.write("}\r\n");
      out.write(".focus-input{\r\n");
      out.write("    display: block;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    border-radius: 25px;\r\n");
      out.write("    bottom: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    z-index: -1;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    box-shadow: 0px 0px 0px 0px;\r\n");
      out.write("    color: rgba(87, 184,70, 0.8);\r\n");
      out.write("}\r\n");
      out.write(".input:focus + .focus-input{\r\n");
      out.write("    animation:  anim-shadow 0.5s ease-in-out forwards;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".symbol-input{\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    border-radius: 25px;\r\n");
      out.write("    bottom: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    padding-left: 35px;\r\n");
      out.write("    pointer-events: none;\r\n");
      out.write("    color: #666666;\r\n");
      out.write("    transition: all 0.4s\r\n");
      out.write("}\r\n");
      out.write(".input:focus + .focus-input + .symbol-input{\r\n");
      out.write("    color: #57b846;\r\n");
      out.write("    padding-left: 28px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-form-btn-container{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    padding-top: 20px;\r\n");
      out.write("    margin-bottom: 143px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".login-form-btn{\r\n");
      out.write("    font-family:'poppins',sans-serif ;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    line-height: 1.5;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    background: #57b846;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    border-radius: 25px;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    padding: 0 25px ;\r\n");
      out.write("    transition: all 0.4s;\r\n");
      out.write("    border: none;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".login-form-btn:hover{\r\n");
      out.write("    background: #333333;\r\n");
      out.write("}\r\n");
      out.write(".text-center{\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".txt1{\r\n");
      out.write("    font-family: 'poppins';\r\n");
      out.write("    font-size: 13px;\r\n");
      out.write("    line-height: 1.5;\r\n");
      out.write("    color: #666666;\r\n");
      out.write("}\r\n");
      out.write(".txt2{\r\n");
      out.write("    font-family: 'poppins';\r\n");
      out.write("    font-size: 13px;\r\n");
      out.write("    line-height: 1.5;\r\n");
      out.write("    color: #666666;\r\n");
      out.write("}\r\n");
      out.write(".p-t-1{\r\n");
      out.write("    padding-top: 12px;\r\n");
      out.write("}\r\n");
      out.write(".p-t-2{\r\n");
      out.write("    padding-top: 136px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a{\r\n");
      out.write("    font-family: 'poppins', sans-serif;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    line-height: 1.7;\r\n");
      out.write("    color: #666666;\r\n");
      out.write("    margin: 0px;\r\n");
      out.write("    transition: all 0.4s;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("}\r\n");
      out.write("a:focus{\r\n");
      out.write("    outline: none !important;\r\n");
      out.write("}\r\n");
      out.write("a:hover{\r\n");
      out.write("    color: #57b846;\r\n");
      out.write("}\r\n");
      out.write("button{\r\n");
      out.write("    outline: none !important;\r\n");
      out.write("    border: none;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("}\r\n");
      out.write("button:hover{\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Responsive */\r\n");
      out.write("@media (max-width: 992px){\r\n");
      out.write("\r\n");
      out.write("    .wrap-login{\r\n");
      out.write("        padding: 177px 90px 33px 85px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .login-pic{\r\n");
      out.write("        width: 35%;\r\n");
      out.write("    }\r\n");
      out.write("    .login-form{\r\n");
      out.write("        width: 50%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("@media (max-width: 768px){\r\n");
      out.write("    .wrap-login{\r\n");
      out.write("        padding: 100px 80px 33px 80px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .login-pic{\r\n");
      out.write("        display: none;\r\n");
      out.write("    }\r\n");
      out.write("    .login-form{\r\n");
      out.write("        width: 100%;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("@media (max-width: 576px){\r\n");
      out.write("    .wrap-login{\r\n");
      out.write("        padding: 100px 15px 33px 15px;\r\n");
      out.write("    }\r\n");
      out.write("}");
      out.write("\n");
      out.write("</style>");
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