<%-- 
    Document   : result
    Created on : Aug 5, 2019, 4:13:10 PM
    Author     : A D M I N
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
                <sql:query var="items" dataSource="jdbc:mysql://localhost:3306/jsp","root","root" >
        select * from login
        </sql:query>
                
    </body>
</html>
