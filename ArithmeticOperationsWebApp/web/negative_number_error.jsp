<%-- 
    Document   : negative_number_error
    Created on : 09 Aug 2025, 6:31:15 PM
    Author     : khuts
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Negative Number Error Page</title>
    </head>
    <body>
        <h1>Negative Number Error</h1>
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
