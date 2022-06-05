<%-- 
    Document   : index
    Created on : 02-jun-2022, 8:38:38
    Author     : ITCA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <h1>Bienvenido/a</h1><br>
        <a href="Controlador?accion=listarP">
        <input class="btn btn-outline-primary" type="button" value="Registrar Productos">
        </a>
        <a href="Controlador?accion=listarC">
        <input class="btn btn-outline-danger" type="button" value="Agregar Nueva Categoria">
        </a>
        <%--<a href="Controlador?accion=listarP">Registrar Productos</a>
        <a href="Controlador?accion=listarC">Agregar Nueva Categoria</a>--%>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
