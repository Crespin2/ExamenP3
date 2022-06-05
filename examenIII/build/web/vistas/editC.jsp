<%@page import="modelo.categoria"%>
<%@page import="modeloDAO.inventarioDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
       <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Categoria</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">

    </head>
    <body>
        <%
            inventarioDAO dao = new inventarioDAO();
            int id_categoria=Integer.parseInt((String)request.getAttribute("id_categoria"));
            categoria cat=(categoria)dao.list(id_categoria);
        %>
        <div class="container">
        <h1>Modificar Categoria</h1>
        <br>
      <form action="Controlador">
      <div  class="form-group cl-3" >
      <label>Nombre Categoria: </label>
      <input type="text" class="form-control col-2"  name="txtNombreC" value="<%= cat.getNom_categoria()%>" required>
    </div>
      <div class="form-group">
      <label>Estado: </label>
      <input type="number" class="form-control col-2"  name="numEstadoC" value="<%= cat.getEstado_categoria() %>" required>
      <input type="hidden" name="txtId" value="<%= cat.getId_categoria()%>">
    </div>
    <input type="submit" name="accion" value="ActualizarC" />
    <a href="Controlador?accion=listarC">Regresar</a>
  </form>
    </div>
         
    </body>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>

</html>
