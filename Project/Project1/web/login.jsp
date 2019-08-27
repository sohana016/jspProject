<%-- 
    Document   : login
    Created on : Aug 2, 2019, 12:33:02 AM
    Author     : Md Yasin Arif
--%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<%@taglib prefix="tags" tagdir="/WEB-INF/tags/" %>
<%@taglib prefix="year" uri="/WEB-INF/tlds/year.tld" %>
<%@taglib prefix="inp" uri="/WEB-INF/tlds/inp.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LogIn</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        
    </head>
    <body style="margin: 100px; border: 2px solid black">
        <year:year/>
        <inp:text/>
      
        <div style="text-align: center" class="bg-success">
            <tags:header heading="Authintication"/>
         <h:form>
     
             Email   <h:inputText id="email" value="#{infor.email}" /><br><br>
           
             Password  <h:inputText id="password" value="#{infor.password}" /><br><br>
    
             <h:commandButton value="Login" type="submit" action="#{infor.search()}" ></h:commandButton>
                 
            </h:form>
        
    </body>
    <tags:footer contact="Contact Us: 01686017809" address="Address: Dhaka" />
    </div>
</html>
</f:view>




































































































