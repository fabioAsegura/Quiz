

<%@page import="model.Columna"%>
<%@page import="model.Columna"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
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
        <form action="Columnas" method="POST">
             <select name="var">
               <option value="nada"></option>
              <option value="pk">PK</option>
              <option value="fk">FK</option>
            </select>
            
            Nombre:
            <input type="text" name="nameColumna"/>
            
            Id Tabla:
            <input type="text" name="idTabla"/>
            <br>
            <br>  
            <input type="submit" class="btn btn-info" name="enviar"/>
        </form>
         <h1>Columnas</h1>
         <div class="container">
        <div class="row">  
            <div class="col-sm-12">
                <table class="table table-hover table-condensed table-bordered">
                    <tr>
                        <td>TipoClave</td>
                        <td>Id</td>
                        <td>Nombre</td>
                        <td>IdTabla</td>
                        <td>Acciones</td>
                    </tr>
                       <% if (request.getAttribute("listaColumna") != null) {
                       ArrayList<Columna> list = (ArrayList<Columna>) request.getAttribute("listaColumnas");
                        
                       for (Columna col : list) {
                                
                    
                    %>
                    <tr>
                        <td><%=col.getData_type()%></td>
                        <td><%=col.getId_columna()%></td>
                        <td><%=col.getNombre_columna()%></td>
                        <td><%=col.getId_tabla()%></td>
                        <td>
                            <button onclick="window.location.href='EditarEsquemas'" class="btn btn-warning">Editar</button>
                            <button onclick="window.location.href='BorrarEsquemas'" class="btn btn-danger">Borrar</button>
                        </td>
                    </tr>
                     <% } 
                    }
                    %>
                </table>
            </div>
        </div>
            </div>
    </body>
</html>
