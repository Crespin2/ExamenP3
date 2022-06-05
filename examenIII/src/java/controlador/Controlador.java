
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.categoria;
import modelo.producto;
import modeloDAO.inventarioDAO;

/**
 *
 * @author ITCA
 */
public class Controlador extends HttpServlet {
    
    String listarP="vistas/listarP.jsp";
    String listarC="vistas/listarC.jsp";
    String addC="vistas/addC.jsp";
    String addP="vistas/addP.jsp";
    String editC="vistas/editC.jsp";
    String editP="vistas/editP.jsp";
    String index="index.jsp";
    categoria cat= new categoria();
    producto p=new producto();
    inventarioDAO dao=new inventarioDAO();
    int id_producto;
    int id_categoria;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String  acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listarP")){
            acceso=listarP;
        }
        else if(action.equalsIgnoreCase("listarC")){
            acceso=listarC;
            
        }
        //categoria
         else if(action.equalsIgnoreCase("addC")){
            acceso=addC;
        }
         else if (action.equalsIgnoreCase("index")){
             acceso=index;
         }
         else if(action.equalsIgnoreCase("AgregarC")){
             String nom_categoria=request.getParameter("txtNombreC");
             int estado_categoria=Integer.parseInt(request.getParameter("numEstadoC"));
             cat.setNom_categoria(nom_categoria);
             cat.setEstado_categoria(estado_categoria);
             dao.addC(cat);
             acceso=listarC;
             
         }
         else if(action.equalsIgnoreCase("editC")){
         request.setAttribute("id_categoria", request.getParameter("id_categoria"));
          acceso=editC;
        }
        else if(action.equalsIgnoreCase("ActualizarC")){
            id_categoria =Integer.parseInt(request.getParameter("txtId"));
            String nom_categoria=request.getParameter("txtNombreC");
             int estado_categoria=Integer.parseInt(request.getParameter("numEstadoC"));
             cat.setId_categoria(id_categoria);
             cat.setNom_categoria(nom_categoria);
             cat.setEstado_categoria(estado_categoria);
            dao.editC(cat);
            acceso=listarC;
        }
        
        else if (action.equalsIgnoreCase("eliminar")){
             id_categoria=Integer.parseInt(request.getParameter("id_categoria"));
             cat.setId_categoria(id_categoria);
             dao.eliminar(id_categoria);
             acceso=listarC;
        }
        //productos
         else if(action.equalsIgnoreCase("addP")){
            acceso=addP;
        }
        else if (action.equalsIgnoreCase("AgregarP")){
            String nom_producto=request.getParameter("txtNombreP");
            String des_producto=request.getParameter("txtDes");
            Double stock=Double.parseDouble(request.getParameter("txtStock"));
            Double precio=Double.parseDouble(request.getParameter("txtPrecio"));
            String unidad_de_medida=request.getParameter("txtUnidad");
            int estado_producto=Integer.parseInt(request.getParameter("txtEstado"));
            int categoria=Integer.parseInt(request.getParameter("opCategoria"));
            String fecha_entrada=request.getParameter("dtFecha");
    
            p.setNom_producto(nom_producto);
            p.setDes_producto(des_producto);
            p.setStock(stock);
            p.setPrecio(precio);
            p.setUnidad_de_medida(unidad_de_medida);
            p.setEstado_producto(estado_producto);
            p.setCategoria(categoria);
            p.setFecha_entrada(fecha_entrada);
            dao.addP(p);
            acceso=listarP;
        }
         else if(action.equalsIgnoreCase("editP")){
          request.setAttribute("id_producto", request.getParameter("id_producto"));
          acceso=editP;
        }
         else if(action.equalsIgnoreCase("ActualizarP")){
            id_producto=Integer.parseInt(request.getParameter("txtIdp"));
            String nom_producto=request.getParameter("txtNombreP");
            String des_producto=request.getParameter("txtDes");
            Double stock=Double.parseDouble(request.getParameter("txtStock"));
            Double precio=Double.parseDouble(request.getParameter("txtPrecio"));
            String unidad_de_medida=request.getParameter("txtUnidad");
            int estado_producto=Integer.parseInt(request.getParameter("txtEstado"));
            int categoria=Integer.parseInt(request.getParameter("opCategoria"));
            String fecha_entrada=request.getParameter("dtFecha");
            
            p.setId_producto(id_producto);
            p.setNom_producto(nom_producto);
            p.setDes_producto(des_producto);
            p.setStock(stock);
            p.setPrecio(precio);
            p.setUnidad_de_medida(unidad_de_medida);
            p.setEstado_producto(estado_producto);
            p.setCategoria(categoria);
            p.setFecha_entrada(fecha_entrada);
            
            dao.editP(p);
            acceso=listarP;
        }
         else if (action.equalsIgnoreCase("eliminarP")){
             id_producto=Integer.parseInt(request.getParameter("id_producto"));
             p.setId_producto(id_producto);
             dao.eliminarP(id_producto);
             acceso=listarP;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
