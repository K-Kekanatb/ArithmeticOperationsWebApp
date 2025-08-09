<%-- 
    Document   : number_format_error
    Created on : 09 Aug 2025, 5:41:04 PM
    Author     : khuts
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Number Format Error Page</title>
    </head>
    <body>
        <h1>Number Format Error</h1>
        <%
            String errorMsg = exception.getMessage();
        %>
        <p>
            <b>Error message ---> <%=errorMsg%></b>
        </p>
        <p>
            Please click <a href="index.html">here</a> to go back to the main page.
        </p>
    </body>
</html>
