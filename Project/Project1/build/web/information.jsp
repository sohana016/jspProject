<%-- 
    Document   : information
    Created on : Aug 2, 2019, 1:58:42 AM
    Author     : Md Yasin Arif
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<f:view>
    

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Information Detail</title>
        
    </head>
        <body>
            
            <p>Name: <h:outputText value="#{employee.name}" /></p>
            <p>Address: <h:outputText value="#{employee.address}" /></p>
            <p>Mobile No: <h:outputText value="#{employee.mobileNo}" /></p>
            <p> Date of Birth:<h:outputText value="#{employee.dateofBirth}" /></p>
    </body>
</html>
</f:view>