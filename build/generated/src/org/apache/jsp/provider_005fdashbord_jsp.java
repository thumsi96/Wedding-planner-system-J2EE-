package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class provider_005fdashbord_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Provider dashboard</title>\n");
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
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body id=\"page-top\">\n");
      out.write("      \n");
      out.write("      \n");
      out.write("        ");

        
            
            response.setHeader("Cache-Control","no-cache, no-store,must-revalidate");
            response.setHeader("Pragma","no-cache");
            response.setHeader("Expires", "0");
          if(session.getAttribute("email")==null)
          {
          
                 response.sendRedirect("index.jsp");
          
          }
        
        
        
        
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h1>Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("   <nav class=\"navbar navbar-expand navbar-dark bg-dark static-top\">\n");
      out.write("\n");
      out.write("      <a class=\"navbar-brand mr-1\" href=\"index.jsp\">Wedding Bells</a>\n");
      out.write("\n");
      out.write("      <button class=\"btn btn-link btn-sm text-white order-1 order-sm-0\" id=\"sidebarToggle\" href=\"#\">\n");
      out.write("        <i class=\"fas fa-bars\"></i>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <!-- Navbar Search -->\n");
      out.write("      <form class=\"d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0\">\n");
      out.write("        \n");
      out.write("      </form>\n");
      out.write("\n");
      out.write("      <!-- Navbar -->\n");
      out.write("      <ul class=\"navbar-nav ml-auto ml-md-0\">\n");
      out.write("        \n");
      out.write("     \n");
      out.write("        <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            <i class=\"fas fa-user-circle fa-fw\"></i>\n");
      out.write("          </a>\n");
      out.write("          <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"userDropdown\">\n");
      out.write("            \n");
      out.write("            <a class=\"dropdown-item\" href=\"sp_account.jsp\">Account</a>\n");
      out.write("            <div class=\"dropdown-divider\"></div>\n");
      out.write("            <a class=\"dropdown-item\" href=\"index.jsp\" data-toggle=\"modal\" data-target=\"#logoutModal\">Logout</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("      <!-- Sidebar -->\n");
      out.write("      <ul class=\"sidebar navbar-nav\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"provider_dashbord.jsp\">\n");
      out.write("            <i class=\"fas fa-fw fa-tachometer-alt\"></i>\n");
      out.write("            <span>Posts</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("       \n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"sp_account.jsp\">\n");
      out.write("            <i class=\"fas fa-fw fa-tachometer-alt\"></i>\n");
      out.write("            <span>Account</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("       \n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("      <div id=\"content-wrapper\">\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("          <!-- Breadcrumbs-->\n");
      out.write("          <ol class=\"breadcrumb\">\n");
      out.write("            <li class=\"breadcrumb-item\">\n");
      out.write("              <a href=\"provider_dashbord.jsp\">Posts</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"breadcrumb-item active\"></li>\n");
      out.write("          </ol>\n");
      out.write("\n");
      out.write("          <!-- Page Content -->\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#addpostmodel\">Add Post</a>\n");
      out.write("       \n");
      out.write("          \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("        <!-- Sticky Footer -->\n");
      out.write("        <footer class=\"sticky-footer\">\n");
      out.write("          <div class=\"container my-auto\">\n");
      out.write("            <div class=\"copyright text-center my-auto\">\n");
      out.write("              <span>Copyright © Your Website 2018</span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <!-- /.content-wrapper -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("    <!-- Scroll to Top Button-->\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("      <i class=\"fas fa-angle-up\"></i>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <!-- Logout Modal-->\n");
      out.write("    <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("      <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("          <div class=\"modal-header\">\n");
      out.write("            <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("            <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("              <span aria-hidden=\"true\">×</span>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("          <div class=\"modal-footer\">\n");
      out.write("            <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("            <a class=\"btn btn-primary\" href=\"index.jsp\">Logout</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- add post -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     <div class=\"modal fade\" id=\"addpostmodel\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("      <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("          <div class=\"modal-header\">\n");
      out.write("            <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Add Post</h5>\n");
      out.write("            <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("              <span aria-hidden=\"true\">×</span>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                \n");
      out.write("               <form>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <div class=\"form-row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                  <div class=\"form-label-group\">\n");
      out.write("                    <input type=\"text\" id=\"postname\" class=\"form-control\" placeholder=\"Post Name\" required=\"required\" autofocus=\"autofocus\">\n");
      out.write("                    <label for=\"postname\">Post Name</label>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("                   \n");
      out.write("                   <div class=\"input-group\">\n");
      out.write("  <div class=\"input-group-prepend\">\n");
      out.write("    <span class=\"input-group-text\" id=\"inputGroupFileAddon01\">Upload Picture</span>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"custom-file\">\n");
      out.write("    <input type=\"file\" class=\"custom-file-input\" id=\"inputGroupFile01\" aria-describedby=\"inputGroupFileAddon01\">\n");
      out.write("    <label class=\"custom-file-label\" for=\"inputGroupFile01\">Choose file</label>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("                   <br>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <div class=\"form-label-group\">\n");
      out.write("                <input type=\"text\" id=\"inputprice\" class=\"form-control\" placeholder=\"price\" required=\"required\">\n");
      out.write("                <label for=\"inputprice\">Price</label>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <a class=\"btn btn-primary btn-block\" href=\"provider_dashbord.jsp\">Save</a>\n");
      out.write("          </form>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
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
