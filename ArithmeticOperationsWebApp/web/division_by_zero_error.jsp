<%-- 
    Document   : division_by_zero_error
    Created on : 09 Aug 2025, 10:51:09 PM
    Author     : khuts
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Division By Zero Error Page</title>
    </head>
    <body>
        <h1>Division By Zero</h1>
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
