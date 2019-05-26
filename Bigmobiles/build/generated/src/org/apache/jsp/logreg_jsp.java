package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logreg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<html>\n");
      out.write("\n");
      out.write("    <title>Login like Facebook</title>\n");
      out.write("    <head>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"fb.css\" />\n");
      out.write("        <meta name=\"Description\" content=\"Facebook Style Homepage Design with Login Form registration for using html and CSS\"/>\n");
      out.write("\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"navwrapper\">\n");
      out.write("            <div id=\"navbar\">   \n");
      out.write("                <form action=\"loginCustomer\" method=\"post\">\n");
      out.write("                    <table class=\"tablewrapper\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"row1\">Thư điện tử</td>\n");
      out.write("                            <td class=\"row1\">Mật khẩu</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"email\" name=\"email\" class=\"inputtext\">\n");
      out.write("                            </td>\n");
      out.write("                            <td><input type=\"password\" name=\"password\" class=\"inputtext\">\n");
      out.write("                            </td>\n");
      out.write("                            <td><input type=\"submit\" value=\"Đăng Nhập\" ></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"row2 h\">Forgot your password?</td></tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("                <h1 class=\"logowrapper\">Big Mobiles</h1>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"contentwrapper\">\n");
      out.write("            <div id=\"content\">\n");
      out.write("\n");
      out.write("                <div id=\"leftbod\">\n");
      out.write("\n");
      out.write("                    <div class=\"connect bolder\">\n");
      out.write("                        Nếu bạn chưa có tài khoản, vui lòng đăng ký.\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"connect bolder\">\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${me}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mes}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"rightbod\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"signup bolder\">Đăng ký</div>\n");
      out.write("                    <div class=\"free bolder\">It's free and always will be</div>\n");
      out.write("\n");
      out.write("                    <div class=\"formbox\">\n");
      out.write("                        <form action=\"createCUSTOMER\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                            <input type=\"text\" required=\"\" name=\"fullname\" class=\"inputbody in2\" placeholder=\"Tên đầy đủ\">\n");
      out.write("                            <input type=\"number\" required=\"\" name=\"phone\" class=\"inputbody in2\" placeholder=\"Số điện thoại\">\n");
      out.write("                            <input type=\"email\" required=\"\" name=\"email\" class=\"inputbody in2\" placeholder=\"Thư điện tử\">\n");
      out.write("                            <input type=\"password\" name=\"password\" class=\"inputbody in2\" placeholder=\"Mật khẩu\">\n");
      out.write("                            <input type=\"file\" name=\"avatar\" class=\"inputbody in2\" placeholder=\"Hình đại diện\">\n");
      out.write("                            <span data-type=\"radio\" class=\"spanpad\">\n");
      out.write("                                <input type=\"radio\" name=\"gender\" id=\"fem\" class=\"m0\">\n");
      out.write("                                <label for=\"fem\" class=\"gender\">Nam\n");
      out.write("                                </label>\n");
      out.write("                                <input type=\"radio\" name=\"gender\" id=\"male\" class=\"m0\">\n");
      out.write("                                <label for=\"male\" class=\"gender\">Nữ\n");
      out.write("                                </label>\n");
      out.write("                            </span>\n");
      out.write("                            <button type=\"submit\" class=\"signbut bolder\">Đăng ký</button>\n");
      out.write("                        </form>\n");
      out.write("                        <div class=\"formbox\">\n");
      out.write("                            <div class=\"agree\">\n");
      out.write("                                bằng cách nhấp vào Đăng ký, bạn đồng ý với Điều khoản của chúng tôi và bạn đã đọc Chính sách sử dụng dữ liệu của chúng tôi, bao gồm cả việc sử dụng cookie của chúng tôi.\n");
      out.write("\n");
      out.write("                            </div>  \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"formbox\">\n");
      out.write("                            <div class=\"create\"><div class=\"link h\">Create a Page</div> for a celebrity, band or business.</div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
}
