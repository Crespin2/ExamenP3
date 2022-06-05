
<%@page import="modelo.producto"%>
<%@page import="java.util.Iterator"%>
<%@page import="modelo.categoria"%>
<%@page import="modeloDAO.inventarioDAO"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TABLA DE REGISTROS</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
        <script src="https://unpkg.com/feather-icons"></script>
    </head>
    <body>
        <div class="container">
            <h1>Tabla Productos</h1>
            <br>
             <br>

            
            <a href="Controlador?accion=addP">
            <i data-feather="user-plus"></i>
                <script>
                    feather.replace()
                 </script>
                
            </a>
             <br>
             <a href="Controlador?accion=index">Regresar</a>
            <br>
            <br>
            <br>
            
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">Nombre</th>
                        <th scope="col">Descripcion</th>
                        <th scope="col">Stock</th>
                        <th scope="col">Precio</th>
                        <th scope="col">UnidadMedida</th>
                        <th scope="col">Estado</th>
                        <th scope="col">Categoria</th>
                        <th scope="col">Fecha Entrada</th>
                        <th scope="col">Acciones</th>
                    </tr>
                </thead>
                <%
                    inventarioDAO dao=new inventarioDAO();
                    List<producto>list=dao.listarP();
                    Iterator<producto>iter=list.iterator();
                    producto pro=null;
                    while(iter.hasNext()){
                        pro=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td scope="row"><%= pro.getNom_producto()%></td>
                        <td><%= pro.getDes_producto()%></td>
                        <td><%= pro.getStock()%></td>
                        <td><%= pro.getPrecio()%></td>
                        <td><%= pro.getUnidad_de_medida()%></td>
                        <td><%= pro.getEstado_producto()%></td>
                        <td><%= pro.getCategoria()%></td>
                        <td><%= pro.getFecha_entrada()%></td>
                        <td>
                            <a href="Controlador?accion=editP&id_producto=<%= pro.getId_producto()%>"><i data-feather="edit"></i>
                            <script>
                                feather.replace()
                             </script>
                             </a>
                          
                            <a href="Controlador?accion=eliminarP&id_producto=<%= pro.getId_producto()%>">
                            <i data-feather="trash-2"></i>
                            <script>
                                feather.replace()
                             </script>
                            </a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>

</html>