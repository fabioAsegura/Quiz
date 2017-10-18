<%-- 
    Document   : Entidad
    Created on : 16/10/2017, 04:01:13 PM
    Author     : User
--%>
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


            Nombre:
            <input type="text" name="nameColumna"/>
            Data Type:
            <select name="datatype">
                <option value="int">INT</option>
                <option value="double">DOUBLE</option>
                <option value="varchar">VARCHAR</option>
            </select>
            Id Tabla:
            <input type="text" name="idTabla"/>
            <br>
            <br>  
            <input type="submit" class="btn btn-info" name="enviar"/>
            <a class="btn btn-info" href="index.jsp" role="button">Inicio</a>
        </form>
        <h1>Columnas</h1>
        <div class="container">
            <div class="row">  
                <div class="col-sm-12">
                    <table class="table table-hover table-condensed table-bordered">
                        <tr>

                            <td>Id</td>
                            <td>Nombre</td>
                            <td>Data Type</td>
                            <td>IdTabla</td>
                            <td>Acciones</td>
                        </tr>
                        <% if (request.getAttribute("listaColumnas") != null) {
                                ArrayList<Columna> list = (ArrayList<Columna>) request.getAttribute("listaColumnas");
                                if (list != null)
                                    for (Columna col : list) {


                        %>
                        <tr>

                            <td><%=col.getId_columna()%></td>
                            <td><%=col.getNombre_columna()%></td>
                            <td><%=col.getData_type()%></td>
                            <td><%=col.getId_tabla()%></td>

                            <td>
                                <button onclick="window.location.href = 'EditarColumnas?id=<%=col.getId_columna()%>'" class="btn btn-warning">Editar</button>
                                <button onclick="window.location.href = 'BorrarColumnas?id=<%=col.getId_columna()%>'" class="btn btn-danger">Borrar</button>
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
