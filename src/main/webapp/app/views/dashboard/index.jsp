<%-- 
    Document   : index
    Created on : Aug 31, 2012, 2:20:15 PM
    Author     : mohsen
--%>

<%@page import="app.helpers.AuthenticateHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%=AuthenticateHelper.current.getFirstname()%>
    </body>
</html>
