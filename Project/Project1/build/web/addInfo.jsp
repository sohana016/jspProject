<%-- 
    Document   : addInfo
    Created on : Aug 2, 2019, 1:24:33 AM
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
        <title>Add_Information</title>
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body style="margin: 50px; border: 2px solid black">
        <div style="text-align: center" class="bg-success">
            <tags:header heading="Information" />
        <h:form>
            
                     Name  <h:inputText value="#{employee.name}" /><br><br>
                  Address  <h:inputText value="#{employee.address}" /><br><br>
                     Mobile No  <h:inputText value="#{employee.mobileNo}" /><br><br>
                     Date of Birth   <h:inputText value="#{employee.dateofBirth}" /><br><br>
                                                                                           
                      <h:commandButton value="SignUp"  action="#{employee.submit()}"/>
                    
                      </h:form>
        <tags:footer contact="Contact Us: 01686017809" address=" Address: Dhaka" />
        </div>
    </body>
</html>
</f:view>