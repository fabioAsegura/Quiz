

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
            Nombre de la tabla:
            <input type="text" name="nameTabla"/>
            Id Esquema:
            <input type="text" name="idEsquema"/>
            <br>
            <br>  
            <input type="submit" class="btn btn-info" name="enviar"/>
            <a class="btn btn-info" href="Columna.jsp" role="button">Crear Columna</a>
            <a class="btn btn-info" href="index.jsp" role="button">Inicio</a>
        </form>

        <h1>Tablas</h1>
        <div class="container">
            <div class="row">  
                <div class="col-sm-12">
                    <table class="table table-hover table-condensed table-bordered">
                        <tr>
                            <td>Id</td>
                            <td>Nombre</td>
                            <td>IdEsquema</td>
                            <td>Acciones</td>

                        </tr>
                        <% if (request.getAttribute("listaTablas") != null) {
                                ArrayList<Tabla> list = (ArrayList<Tabla>) request.getAttribute("listaTablas");
                                if (list != null)
                                    for (Tabla tabla : list) {


                        %>
                        <tr>
                            <td><%=tabla.getId_tabla()%></td>
                            <td><%=tabla.getNombre_tabla()%></td>
                            <td><%=tabla.getId_esquema()%></td>
                            <td>
                                <button onclick="window.location.href = 'EditarTablas?id=<%=tabla.getId_tabla()%>'" class="btn btn-warning">Editar</button>
                                <button onclick="window.location.href = 'BorrarTablas?id=<%=tabla.getId_tabla()%>'" class="btn btn-danger">Borrar</button>
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
