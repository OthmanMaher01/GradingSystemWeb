/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-10-06 11:51:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import servlets.models.Course;
import servlets.models.Student;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/../../style/welcomestyle.css", Long.valueOf(1665057101565L));
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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Yahoo!!</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"grading-header\">\n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("        <h2 style=\"color:#353c4e;\">Grading System</h2>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("        <form action=\"/login.do\" method=\"GET\">\n");
      out.write("            <button type=\"submit\" style=\"background: none;border: none;\">\n");
      out.write("                <div style=\"display: flex;flex-direction: column;align-items: center;cursor:pointer;\">\n");
      out.write("                    <img src=\"../../assets/logout.svg\" width=\"30\">\n");
      out.write("                    <span style=\"color: #353c4e;\">Logout</span>\n");
      out.write("                </div>\n");
      out.write("            </button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"main\">\n");
      out.write("\n");
      out.write("    <div class=\"information\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"left\">\n");
      out.write("                <img src=\"../../assets/student.svg\" width=\"150\">\n");
      out.write("                <h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.getName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <div class=\"info\">\n");
      out.write("                    <h3>Information</h3>\n");
      out.write("                    <div class=\"info_data\">\n");
      out.write("                        <div class=\"data\">\n");
      out.write("                            <h4>Email</h4>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.getEmail()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"data\">\n");
      out.write("                            <h4>Major</h4>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.getMajor()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"courses\" id=\"style-2\">\n");
      out.write("                    <h3 style=\"margin-bottom: 40px\">Courses</h3>\n");
      out.write("                    <div class=\"projects_data\">\n");
      out.write("                        ");

                            Student student = (Student) request.getAttribute("student");
                            for (Course course:student.getCourses()
                            ) {
      out.write("\n");
      out.write("                        <div class=\"data\">\n");
      out.write("        <div class=\"course-name\" >\n");
      out.write("        <form method=\"POST\" action=\"/course\">\n");
      out.write("            <input name=\"courseId\" value=\"");
      out.print(course.getId());
      out.write("\" hidden>\n");
      out.write("            <button type=\"submit\" style=\"color: #353c4e;\n");
      out.write("            margin-bottom: -5px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            border: none;\n");
      out.write("            font-size: 16px;\n");
      out.write("            background: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("\">   ");
      out.print(course.getName());
      out.write("</button>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("                            <p>\n");
      out.write("                                ");
      out.print(course.getMark());
      out.write("\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        ");
  } 
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<style scoped>\n");
      out.write("    ");
      out.write("body{\r\n");
      out.write("    background-color: #f3f3f3;\r\n");
      out.write("}\r\n");
      out.write(".main{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-around;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    margin: 82px 60px;\r\n");
      out.write("\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    font-family: 'Josefin Sans', sans-serif;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper{\r\n");
      out.write("    width: 620px;\r\n");
      out.write("    height: 500px;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    box-shadow: 0 1px 20px 0 rgb(69 90 100 / 8%);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .left{\r\n");
      out.write("    width: 35%;\r\n");
      out.write("    background:linear-gradient(to top, #57b846, #4ebc43, #43c040, #35c53e, #1dc93b);\r\n");
      out.write("    padding: 30px 25px;\r\n");
      out.write("    border-top-left-radius: 5px;\r\n");
      out.write("    border-bottom-left-radius: 5px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("}\r\n");
      out.write(".courses{\r\n");
      out.write("    background: white;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .left img{\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .left h4{\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .left p{\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".projects_data{\r\n");
      out.write("\r\n");
      out.write("    overflow-x: hidden;\r\n");
      out.write("    overflow-y: auto;\r\n");
      out.write("    height: 250px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".wrapper .right{\r\n");
      out.write("    width: 65%;\r\n");
      out.write("    background: #fff;\r\n");
      out.write("    padding: 30px 25px;\r\n");
      out.write("    border-top-right-radius: 5px;\r\n");
      out.write("    border-bottom-right-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .right .info,\r\n");
      out.write(".wrapper .right .courses{\r\n");
      out.write("    margin-bottom: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .right .info h3,\r\n");
      out.write(".wrapper .right .courses h3{\r\n");
      out.write("    margin-bottom: 5px;\r\n");
      out.write("    padding-bottom: 5px;\r\n");
      out.write("    border-bottom: 1px solid #e0e0e0;\r\n");
      out.write("    color: #353c4e;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    letter-spacing: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .right .info_data,\r\n");
      out.write(".wrapper .right .projects_data{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .right .info_data .data,\r\n");
      out.write(".wrapper .right .projects_data .data{\r\n");
      out.write("    width: 45%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .right .info_data .data h4,\r\n");
      out.write(".wrapper .right .projects_data .data h4{\r\n");
      out.write("    color: #353c4e;\r\n");
      out.write("    margin-bottom: -5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .right .info_data .data p,\r\n");
      out.write(".wrapper .right .projects_data .data p{\r\n");
      out.write("    font-size: 13px;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("    color: #919aa3;\r\n");
      out.write("    text-overflow: ellipsis;\r\n");
      out.write("    white-space: nowrap;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    padding-left: 9px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".grading-header{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-items: baseline;\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("::-webkit-scrollbar {\r\n");
      out.write("    width: 9px;\r\n");
      out.write("    background-color: #F5F5F5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("::-webkit-scrollbar-track {\r\n");
      out.write("    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    background-color: #F5F5F5;\r\n");
      out.write("}\r\n");
      out.write("::-webkit-scrollbar-thumb {\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);\r\n");
      out.write("    background: #353c4e;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".select {\r\n");
      out.write("    display:flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    position:relative;\r\n");
      out.write("    width: 320px;\r\n");
      out.write("    height:40px;\r\n");
      out.write("    align-self: center;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".option {\r\n");
      out.write("    padding:0 30px 0 10px;\r\n");
      out.write("    min-height:40px;\r\n");
      out.write("    display:flex;\r\n");
      out.write("    align-items:center;\r\n");
      out.write("    background:#333;\r\n");
      out.write("    border-top:#222 solid 1px;\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    top:0;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    pointer-events:none;\r\n");
      out.write("    order:2;\r\n");
      out.write("    z-index:1;\r\n");
      out.write("    transition:background .4s ease-in-out;\r\n");
      out.write("    box-sizing:border-box;\r\n");
      out.write("    overflow:hidden;\r\n");
      out.write("    white-space:nowrap;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".option:hover {\r\n");
      out.write("    background:#666;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".select:focus .option {\r\n");
      out.write("    position:relative;\r\n");
      out.write("    pointer-events:all;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input {\r\n");
      out.write("    opacity:0;\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    left:-99999px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input:checked + label {\r\n");
      out.write("    order: 1;\r\n");
      out.write("    z-index:2;\r\n");
      out.write("    background:#666;\r\n");
      out.write("    border-top:none;\r\n");
      out.write("    position:relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input:checked + label:after {\r\n");
      out.write("    content:'';\r\n");
      out.write("    width: 0;\r\n");
      out.write("    height: 0;\r\n");
      out.write("    border-left: 5px solid transparent;\r\n");
      out.write("    border-right: 5px solid transparent;\r\n");
      out.write("    border-top: 5px solid white;\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    right:10px;\r\n");
      out.write("    top:calc(50% - 2.5px);\r\n");
      out.write("    pointer-events:none;\r\n");
      out.write("    z-index:3;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input:checked + label:before {\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    right:0;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    width: 40px;\r\n");
      out.write("    content: '';\r\n");
      out.write("    background:#666;\r\n");
      out.write("}\r\n");
      out.write(".wrapper .courses-header {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    margin: 30px 70px;\r\n");
      out.write("}\r\n");
      out.write(".wrapper .courses-header h3 {\r\n");
      out.write("    color: #353c4e;\r\n");
      out.write("}\r\n");
      out.write(".course-information{\r\n");
      out.write("    margin-top: 100px;\r\n");
      out.write("    justify-content: space-around;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("}\r\n");
      out.write(".course-information div {\r\n");
      out.write("    padding: 30px;\r\n");
      out.write("    border: 2px solid  #353c4e;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
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