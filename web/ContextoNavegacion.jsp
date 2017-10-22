<%-- 
    Document   : Entidad
    Created on : 16/10/2017, 04:01:13 PM
    Author     : User
--%>

<%@page import="model.Esquema"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
  <title>ContextoNavegacion</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
 <body background="fondo.jpg">
       <h1>Insertar contexto de navegacion</h1>
        <form action="contextocavegacion" method="POST">
            Id:
            <input type="text" name="idContexto"/>
            <br>
            Link:
            <input type="text" name="link"/>
            <br>
            Id Unidad Abstracta:
            <input type="text" name="idUnidad"/>
            <br>
            <input type="submit" class="btn btn-info" name="Enviar"/>
            
            <a class="btn btn-info" href="ModeloNavegacion.jsp" role="button">Inicio</a>
            
        </form>
        
    </body>
</html>
