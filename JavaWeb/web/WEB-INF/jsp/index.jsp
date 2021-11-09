<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <link src="https://framework.marbust.com/marbust-framework.css">
    </head>

    <body>
        <h1 class="p10px">Registros</h1>
        <a href="agregar.htm">Nuevo registro</a>
        <div class="table-ctnr">
            <table border="0">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombres</th>
                        <th>Correo</th>
                        <th>Nacionalidad</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="dato" items="${lista}">
                    <tr>
                        <td>${dato.Id}</td>
                        <td>${dato.Nombres}</td>
                        <td>${dato.Correo}</td>
                        <td>${dato.Nacionalidad}</td>
                        <td><a>Editar</a><a>Delete</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </body>
</html>
