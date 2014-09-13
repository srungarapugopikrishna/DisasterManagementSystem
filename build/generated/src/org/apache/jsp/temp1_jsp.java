package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class temp1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <h1 align=\"center\"> Create Disaster </h1>\n");
      out.write("\n");
      out.write("        <form id=\"Disasterinfo\" name=\"diaster\" method=\"post\" action=\"disaster\">\n");
      out.write("            <div align=\"center\">\n");
      out.write("                <table width=\"564\" border=\"0\" align=\"center\" cellpadding=\"5\" cellspacing=\"5\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"163\"><div align=\"right\">Disaster name :</div></td>\n");
      out.write("                        <td width=\"391\"><div align=\"left\">\n");
      out.write("                                <input type=\"text\" name=\"name\" id=\"textfield\">\n");
      out.write("                            </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><div align=\"right\">Location :</div></td>\n");
      out.write("                        <td><div align=\"left\">\n");
      out.write("\n");
      out.write("                                <input type=\"location_name\" name=\"location_name\" id=\"textfield2\">\n");
      out.write("                            </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><div align=\"right\">Totalotal Death </div></td>\n");
      out.write("                        <td><div align=\"left\">\n");
      out.write("                                <input type=\"text\" name=\"total_death\" id=\"textfield\">\n");
      out.write("                            </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><div align=\"right\">Property lost :</div></td>\n");
      out.write("                        <td><div align=\"left\">\n");
      out.write("\n");
      out.write("                                <input type=\"text\" name=\"Property\" id=\"textfield\">\n");
      out.write("                            </div></td>\n");
      out.write("                    </tr> <tr>\n");
      out.write("                        <td><div align=\"right\">Disaster Type</div></td>\n");
      out.write("                        <td><div align=\"left\">\n");
      out.write("                                <input type=\"text\" name=\"Diaster_type\" id=\"text\">\n");
      out.write("                            </div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\"><div align=\"center\">\n");
      out.write("                                <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Submit\">\n");
      out.write("                            </div>\n");
      out.write("                            <div align=\"left\"></div></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("</form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
