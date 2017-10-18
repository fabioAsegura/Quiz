

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
  <title>Columna</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
    <body background="fondo.jpg">
        <h1>Inserte la Columna</h1>
        <form action="Columna" method="POST">
            
             <select name="var">
               <option value="nada"></option>
              <option value="pk">PK</option>
              <option value="fk">FK</option>
            </select>
            
            Id:
            <input type="text" name="idColumna"/>
            Nombre:
            <input type="text" name="nameColumna"/>
            
             Id Tabla:
            <input type="text" name="fkTabla"/>
            
           
            <br>
            <br>  
            <input type="submit" class="btn btn-info" name="enviar"/>
        </form>
        <h1>Ver Columnas:</h1>
       <form action="Tablas" method="POST">
           Id Tabla:
           <input type="text" name="idEsque"/>
           <br>
            <br>  
            <input type="submit" class="btn btn-success" name="Ver"/>
    </body>
</html>
