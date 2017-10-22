<%-- 
    Document   : Inicio
    Created on : 16/10/2017, 04:40:00 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

   

<!DOCTYPE html>
<html lang="en">
    <head>
  <title>Principal</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
    <body background="fondo.jpg">
        
        <div class="container">
            <h1 class="col-md-4"> Unidad Abstracta</h1>
        <div class="span12">&nbsp;</div>
        <div class="span12">&nbsp;</div>
        <div class="span12">&nbsp;</div>
        <div class="span12">&nbsp;</div>
        <div class="span12">&nbsp;</div>
        <div class="span12">&nbsp;</div>
       
<form action="unidadstracta" method="POST">
            Id:
            <input type="text" name="idU"/>
            <br>
            Id Tabla:
            <input type="text" name="idT"/>
            <br>
            <input type="submit" class="btn btn-info" name="Enviar"/>
            
            <a class="btn btn-info" href="ModeloNavegacion.jsp" role="button">Inicio</a>
            
        </form>
        </div>
    </body>
</html>
