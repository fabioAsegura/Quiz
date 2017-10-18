

<%@page import="model.Tabla"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
  <title>Tabla</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
    <body background="fondo.jpg">
       <h1>Inserte la Tabla</h1>
        <form action="Tablas" method="POST">
            Nombre:
            <input type="text" name="nameTabla"/>
            Id Esquema:
            <input type="text" name="idEsquema"/>
            <br>
            <br>  
            <input type="submit" class="btn btn-info" name="enviar"/>
        </form>
       
       <h1>Ver Tabla:</h1>
       <form action="Irtablas" method="POST">
           Id Esquema:
           <input type="text" name="idEsque"/>
           <br>
            <br>  
            <input type="submit" class="btn btn-success" name="Ver"/>
       </form>
       
    </body>
</html>
