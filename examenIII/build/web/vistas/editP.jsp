
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelo.categoria"%>
<%@page import="modelo.producto"%>
<%@page import="modeloDAO.inventarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MODIFICAR REGISTRO</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">

    </head>
    <body>
        <%
            inventarioDAO dao = new inventarioDAO();
            int id_producto=Integer.parseInt((String)request.getAttribute("id_producto"));
            producto p=(producto)dao.listP(id_producto);
        %>
        <div class="container">
        <h1>Modificar Persona</h1>
        <br>
            <form>
                
      <div class="form-group cl-3" >
      <label>Nombre del producto</label>
      <input type="text" class="form-control col-2"  name="txtNombreP" value="<%= p.getNom_producto()%>" required>
    </div>
      <div class="form-group">
      <label>Descripcion:</label>
      <input type="text" class="form-control col-2"  name="txtDes" value="<%= p.getDes_producto()%>" required>
    </div>
     <div class="form-group">
      <label>Stock</label>
      <input type="text" class="form-control col-2"  name="txtStock" value="<%= p.getStock()%>" required>
    </div>
     <div class="form-group">
      <label>Precio</label>
      <input type="text" class="form-control col-2"  name="txtPrecio" value="<%= p.getPrecio()%>" required>
    </div>
     <div class="form-group">
      <label>Unidad de Medida</label>
      <input type="text" class="form-control col-2"  name="txtUnidad" value="<%= p.getUnidad_de_medida()%>" required>
    </div>
      <div class="form-group">
      <label>Estado</label>
      <input type="number" class="form-control col-2"  name="txtEstado" value="<%= p.getEstado_producto()%>" required>
    </div>
                <div class="form-group">
             <label>Categoria</label>
             <select class="custom-select"  name="opCategoria" aria-label="Example select with button addon">
       <%
                    List<categoria>list=dao.listarC();
                    Iterator<categoria>iter=list.iterator();
                    categoria cat= new categoria();
                    while(iter.hasNext()){
                        cat=iter.next();
                    
       %>
       <option value="<%= cat.getId_categoria()%>"><%=cat.getNom_categoria()%></option>
    <%}%>
  </select>
       
      
    </div>
        
    <div class="form-group">
      <label>Fecha de entrada</label>
      <input type="text" class="form-control col-2"  name="dtFecha" placeholder="dd-mm-aaaa" value="<%= p.getFecha_entrada()%>" required>
    <input type="hidden"  name="txtIdp"  value="<%= p.getId_producto()%>">
    </div>
    
    <input type="submit" name="accion" value="ActualizarP" />
    <a href="Controlador?accion=listarP">Regresar</a>
  </form>
  </form>
    </div>
      
    </body>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>

</html>

