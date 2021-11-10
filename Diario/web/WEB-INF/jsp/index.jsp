<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Notas</title>
        <link rel="shortcut icon" type="image/png" href="img/favicon.png">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

    </head>

    <body>
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a href="agregar.htm" class="btn btn-light">Nuevo registro</a>
                </div>
                
                <div class="card-body">
                    
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>NOTA</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="dato" items="${lista}">
                            <tr>
                                <td>${dato.Id}</td>
                                <td>${dato.Notas}</td>
                                <td>
                                    <a href="info.htm?id=${dato.id}" class="btn btn-info">Info</a>
                                    <a href="editar.htm?id=${dato.id}" class="btn btn-warning">Editar</a>
                                    <a href="eliminar.htm?id=${dato.id}" class="btn btn-danger">Eliminar</a>
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                </div>

            </div>
            
        </div>
    </body>
</html>