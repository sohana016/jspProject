<%-- 
    Document   : information
    Created on : Aug 2, 2019, 1:58:42 AM
    Author     : Md Yasin Arif
--%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<%@taglib prefix="tags" tagdir="/WEB-INF/tags/" %>
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
            <div style="text-align: center;margin:100px; padding: 50px; border: 2px solid black" class="bg-success">
                <tags:header heading="Profile" />
                <table class="table table-bordered">
                    <tr class="info">
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Address</th>
                        <th>Mobile No</th>
                        <th>Date of Birth</th>
                        <th>Gender</th>
                        <th>Schedule</th>
                    </tr>
                    <tr class="danger">
                        <td><h:outputText value="#{employee.firstName}" /></td>
                       <td><h:outputText value="#{employee.lastName}" /></td>
                        <td><h:outputText value="#{employee.address}" /></td>
                        <td><h:outputText value="#{employee.mobileNo}" /></td>
                        <td><h:outputText value="#{employee.dateofBirth}" /></td>
                        <td><h:outputText value="#{employee.gender}" /></td>
                        <td><h:outputText value="#{employee.schedule}" /></td>
                    </tr>
                </table>

            </div>
        </body>

<!--         <p>First Name: <h:outputText value="#{employee.firstName}" /></p>
    <p>Last Name: <h:outputText value="#{employee.lastName}" /></p>
    <p>Address: <h:outputText value="#{employee.address}" /></p>
    <p>Mobile No: <h:outputText value="#{employee.mobileNo}" /></p>
    <p> Date of Birth:<h:outputText value="#{employee.dateofBirth}" /></p>
    <p> Gender:<h:outputText value="#{employee.gender}" /></p>
   
    <p>Schedule:<h:outputText value="#{employee.schedule}" /></p>-->
    </html>
</f:view>