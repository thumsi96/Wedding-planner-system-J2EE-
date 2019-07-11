package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("  <head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Home</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS-->\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom fonts for this template-->\n");
      out.write("    <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <!-- Page level plugin CSS-->\n");
      out.write("    <link href=\"vendor/datatables/dataTables.bootstrap4.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template-->\n");
      out.write("    <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"video.css\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body id=\"page-top\">\n");
      out.write("\n");
      out.write("   <nav class=\"navbar navbar-expand navbar-dark bg-dark static-top\">\n");
      out.write("\n");
      out.write("       <a class=\"navbar-brand mr-1\" href=\"home.jsp\"><h3>Wedding Bells</h3></a>\n");
      out.write("        <a class=\"navbar-brand\" href=\"home.jsp\">\n");
      out.write("    <img src=\"wedding-couple.png\" alt=\"logo\" style=\"width:40px;\">\n");
      out.write("  </a>\n");
      out.write("        \n");
      out.write("           \n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("    <ul class=\"navbar-nav\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"about_us.jsp\">About Us</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"our_services.jsp\">Our Services</a>\n");
      out.write("      </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"gallery.jsp\">Gallery</a>\n");
      out.write("      </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"vendors.jsp\">Vendors</a>\n");
      out.write("      </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"special_offers.jsp\">Special Offers</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("     <!-- <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("          Dropdown link\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("        </div>\n");
      out.write("      </li>-->\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("       <a href=\"index.jsp\" class=\"btn btn-dark active\" role=\"button\" aria-disabled=\"true\">Log In</a>\n");
      out.write("       \n");
      out.write("        <a href=\"register.jsp\" class=\"btn btn-dark active\" role=\"button\" aria-disabled=\"true\">Registration</a>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("   \n");
      out.write("  <div class=\"background-wrap\">\n");
      out.write("\t\t\t<video id=\"video-bg-elem\" preload=\"auto\" autoplay=\"true\" loop=\"loop\" muted=\"muted\"> \n");
      out.write("\t\t\t\t<source src=\"Most Romantic Wedding Video EVER!.mp4\" type=\"video/mp4\">\n");
      out.write("\t\t\t\tVideo not supported\n");
      out.write("\t\t\t</video>          \n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("              <div class=\"content\">         \n");
      out.write("\t\t\t<h1>Plan Your Wedding Here</h1>\n");
      out.write("\t\t\t<p>All the things you need to get a wedding in one place</p>\n");
      out.write("                        \n");
      out.write("                        <p>Before two hearts unite in celebration, a lot goes into preparations. Before the love is declared in public, there are many defining moments of choosing and picking. We at Wedding Bells Wedding Planner, as one of the reputed wedding planners in Sri Lanka will create the dream wedding you have always wished for, without a single detail missing.</p>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t   \n");
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("     \n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("    <!-- Scroll to Top Button-->\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("      <i class=\"fas fa-angle-up\"></i>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("   \n");
      out.write("  \n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript-->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Core plugin JavaScript-->\n");
      out.write("    <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom scripts for all pages-->\n");
      out.write("    <script src=\"js/sb-admin.min.js\"></script>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("\n");
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
