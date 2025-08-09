<%-- 
    Document   : sum_outcome
    Created on : 09 Aug 2025, 6:01:39 PM
    Author     : khuts
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sum Outcome Page</title>
    </head>
    <body>
        <h1>Sum</h1>
        <%
            Integer num1 = (Integer)request.getAttribute("num1");
            Integer num2 = (Integer)request.getAttribute("num2");
            Integer sum = (Integer)request.getAttribute("sum");
        %>
        <p>
            The sum of <b><%=num1%></b> and <b><%=num2%></b> is <b><%=sum%></b>
        </p>
        <p>
            Please click <a href="menu.html">here</a> to go back to the main page.
        </p>
    </body>
</html>
