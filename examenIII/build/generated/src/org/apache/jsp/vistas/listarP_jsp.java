package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.producto;
import java.util.Iterator;
import modeloDAO.inventarioDAO;
import java.util.List;

public final class listarP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>TABLA DE REGISTROS</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\" integrity=\"sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://unpkg.com/feather-icons\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("   \n");
      out.write("            <h1>Tabla Productos</h1>\n");
      out.write("            <br>\n");
      out.write("             <br>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <a href=\"Controlador?accion=add\">\n");
      out.write("            <i data-feather=\"user-plus\"></i>\n");
      out.write("                <script>\n");
      out.write("                    feather.replace()\n");
      out.write("                 </script>\n");
      out.write("                \n");
      out.write("            </a>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <table class=\"table\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">ID</th>\n");
      out.write("                        <th scope=\"col\">Nombre</th>\n");
      out.write("                        <th scope=\"col\">Descripcion</th>\n");
      out.write("                        <th scope=\"col\">Stock</th>\n");
      out.write("                        <th scope=\"col\">Precio</th>\n");
      out.write("                        <th scope=\"col\">Unidad de Medida</th>\n");
      out.write("                        <th scope=\"col\">Estado</th>\n");
      out.write("                        <th scope=\"col\">Categoria</th>\n");
      out.write("                        <th scope=\"col\">Fecha de entrada</th>\n");
      out.write("                        <th scope=\"col\">Acciones</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    inventarioDAO dao=new inventarioDAO();
                    List<producto>listP=dao.listarP();
                    Iterator<producto>iter=listP.iterator();
                    producto pro=null;
                    while(iter.hasNext()){
                        pro=iter.next();
                    
                
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td scope=\"row\">");
      out.print( pro.getId_producto());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( pro.getNom_producto());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( pro.getDes_producto());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( pro.getStock());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( pro.getPrecio());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( pro.getUnidad_de_medida());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( pro.getEstado_producto());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( pro.getCategoria());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( pro.getFecha_entrada());
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"Controlador?accion=edit&id=");
      out.print( pro.getId_producto());
      out.write("\"><i data-feather=\"edit\"></i>\n");
      out.write("                            <script>\n");
      out.write("                                feather.replace()\n");
      out.write("                             </script>\n");
      out.write("                             </a>\n");
      out.write("                          \n");
      out.write("                            <a href=\"Controlador?accion=eliminar&id=");
      out.print( pro.getId_producto());
      out.write("\">\n");
      out.write("                            <i data-feather=\"trash-2\"></i>\n");
      out.write("                            <script>\n");
      out.write("                                feather.replace()\n");
      out.write("                             </script>\n");
      out.write("                            </a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
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
