package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;
import modelo.categoria;
import modelo.producto;
import modeloDAO.inventarioDAO;

public final class editP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>MODIFICAR REGISTRO</title>\n");
      out.write("                        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\" integrity=\"sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            inventarioDAO dao = new inventarioDAO();
            int id=Integer.parseInt((String)request.getAttribute("idper"));
            producto p=(producto)dao.listarP();
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <h1>Modificar Persona</h1>\n");
      out.write("        <br>\n");
      out.write("            <form>\n");
      out.write("                \n");
      out.write("      <div class=\"form-group cl-3\" >\n");
      out.write("      <label>Nombre del producto</label>\n");
      out.write("      <input type=\"text\" class=\"form-control col-2\"  name=\"txtNombreP\" value=\"");
      out.print( p.getNom_producto());
      out.write("\" required>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("      <label>Descripcion:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control col-2\"  name=\"txtDes\" value=\"");
      out.print(p.getDes_producto());
      out.write("\" required>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("      <label>Stock</label>\n");
      out.write("      <input type=\"text\" class=\"form-control col-2\"  name=\"txtStock\" value=\"");
      out.print( p.getStock());
      out.write("\" required>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("      <label>Precio</label>\n");
      out.write("      <input type=\"text\" class=\"form-control col-2\"  name=\"txtPrecio\" value=\"");
      out.print( p.getPrecio());
      out.write("\" required>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("      <label>Unidad de Medida</label>\n");
      out.write("      <input type=\"text\" class=\"form-control col-2\"  name=\"txtUnidad\" value=\"");
      out.print( p.getUnidad_de_medida());
      out.write("\" required>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("      <label>Estado</label>\n");
      out.write("      <input type=\"number\" class=\"form-control col-2\"  name=\"txtEstado\" value=\"");
      out.print( p.getEstado_producto());
      out.write("\" required>\n");
      out.write("    </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("      <label>Categoria</label>\n");
      out.write("      \n");
      out.write("      <select class=\"custom-select\" name=\"opCategoria\" required>\n");
      out.write("          ");

                    
                    List<categoria>list=dao.listarC();
                    Iterator<categoria>iter=list.iterator();
                    categoria cat=null;
                    producto pro=null;
                    while(iter.hasNext()){
                        cat=iter.next();
       
      out.write("\n");
      out.write("       <option value=\"\">");
      out.print( cat.getNom_categoria());
      out.write("</option>\n");
      out.write("           ");
}
      out.write("\n");
      out.write("        </select>\n");
      out.write("       \n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label>Fecha de entrada</label>\n");
      out.write("      <input type=\"date\" class=\"form-control col-2\"  name=\"dtFecha\" value=\"");
      out.print( p.getFecha_entrada());
      out.write("\" required>\n");
      out.write("    </div>\n");
      out.write("        <input type=\"hidden\" name=\"txtIdP\" value=\"\">\n");
      out.write("    <input type=\"submit\" name=\"accion\" value=\"ActualizarP\" />\n");
      out.write("    <a href=\"Controlador?accion=listarP\">Regresar</a>\n");
      out.write("  </form>\n");
      out.write("  </form>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
