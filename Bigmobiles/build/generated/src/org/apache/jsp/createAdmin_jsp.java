package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "2.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-12 grid-margin\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h4 class=\"card-title\">Tạo tài khoản quản lý</h4>\n");
      out.write("                    <form class=\"form-sample\" action=\"createAdmin\" method=\"post\" id=\"regform\" enctype=\"multipart/form-data\" >\n");
      out.write("                        <p style=\"color: red\" class=\"m-b-20\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    <p class=\"card-description\"> </p>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label class=\"col-sm-3 col-form-label\">Tên đầy đủ</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input type=\"text\" required title=\"Vui lòng nhập đúng tên của bạn, không bao gồm số và không quá 30 ký tự\" name=\"fullname\" class=\"form-control\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label class=\"col-sm-3 col-form-label\">Địa chỉ email</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input type=\"email\" name=\"email\" required placeholder=\"Email dùng để đăng nhập\" class=\"form-control\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label class=\"col-sm-3 col-form-label\">Hình đại diên</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input required title=\"hình phải có định dạng .png hoặc .jpg\" name=\"file\" type=\"file\" accept=\".png,.jpg\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label class=\"col-sm-3 col-form-label\">Mật khẩu</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input type=\"password\" id=\"password\" required name=\"password\" class=\"form-control\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label class=\"col-sm-3 col-form-label\">Xác nhật Mật khẩu</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input type=\"password\"  required id=\"confirm_password\" class=\"form-control\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <input  type=\"submit\" value=\"Tạo tài khoản\" class=\"btn btn-success mr-2\"/>\n");
      out.write("                    <button  type=\"reset\"class=\"btn btn-light\">tạo lại</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "1.jsp", out, false);
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
