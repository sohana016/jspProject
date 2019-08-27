<%-- 
    Document   : information
    Created on : Aug 2, 2019, 1:58:42 AM
    Author     : Md Yasin Arif
--%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<%@taglib prefix="tags" tagdir="/WEB-INF/tags/"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<f:view>


    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Information Detail</title>
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        </head>
        <body>
            <div style="text-align: center;margin: 50px; border: 2px solid black" class="bg-success">
            <tags:header heading="Information" />
            
            <p>Name: <h:outputText value="#{employee.name}" /></p>
            <p>Address: <h:outputText value="#{employee.address}" /></p>
            <p>Mobile No: <h:outputText value="#{employee.mobileNo}" /></p>
            <p> Date of Birth:<h:outputText value="#{employee.dateofBirth}" /></p>
            <p> Gender:<h:outputText value="#{employee.gender}" /></p>
            <p> Subject:  <h:outputText value="#{employee.subjt}" /></p>
            <p>Schedule:<h:outputText value="#{employee.schedule}" /></p>
            </div>
        </body>
    </html>
</f:view>