<%-- 
    Document   : EditEsquemas
    Created on : 17/10/2017, 02:48:30 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
  <title>EditEsquemas</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
    <body background="fondo.jpg">
        <%
            String id= (String)request.getAttribute("id");
            String n= (String)request.getAttribute("n");
            %>
        <h1>Inserte el  Nuevo Esquema</h1>
        <form action="EditarEsquemas" method="POST">
           Nuevo Nombre:
           <input type="text" name="nombreE" value="<%=n%> "/>
            Id del esquema:
            <input type="text" name="id" value="<%=id%>"/>
            <br>
            <input type="submit" class="btn btn-info" name="Enviar"/>
        </form>
        
        </body>
</html>