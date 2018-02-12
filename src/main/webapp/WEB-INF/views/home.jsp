<%-- 
    Document   : home
    Created on : Jan 8, 2018, 10:18:02 AM
    Author     : Akhilesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="customer" items="${requestScope.customers}">
            <h1>${customer.firstName}</h1>
        </c:forEach>
    </body>
</html>
