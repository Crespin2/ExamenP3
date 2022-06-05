
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
            <h1>Tabla Personas</h1>
            <br>
             <br>

            
            <a href="Controlador?accion=addC">
            <i data-feather="user-plus"></i>
                <script>
                    feather.replace()
                 </script>
                
            </a><br>
             <a href="Controlador?accion=index">Regresar</a>
            <br>
            <br>
            
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Nombre Categoria</th>
                        <th scope="col">Estado</th>
                        <th scope="col">Acciones</th>
                    </tr>
                </thead>
                <%
                    inventarioDAO dao=new inventarioDAO();
                    List<categoria>list=dao.listarC();
                    Iterator<categoria>iter=list.iterator();
                    categoria cat=null;
                    while(iter.hasNext()){
                        cat=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td scope="row"><%= cat.getId_categoria()%></td>
                        <td><%= cat.getNom_categoria()%></td>
                        <td><%= cat.getEstado_categoria()%></td>
                        <td>
                            <a href="Controlador?accion=editC&id_categoria=<%= cat.getId_categoria()%>"><i data-feather="edit"></i>
                            <script>
                                feather.replace()
                             </script>
                             </a>
                          
                            <a href="Controlador?accion=eliminar&id_categoria=<%= cat.getId_categoria()%>">
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
