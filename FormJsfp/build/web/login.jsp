<%-- 
    Document   : login
    Created on : Aug 2, 2019, 12:33:02 AM
    Author     : Md Yasin Arif
--%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<%@taglib prefix="tags" tagdir="/WEB-INF/tags/" %>
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
  <style>
      body{
          background-image: url("resource/pic1.jpg" );
          opacity: .8;
      }
      #shado{
            border: 1px solid;
  padding: 10px;
  box-shadow: 5px 10px 8px 10px ;
          
      }
  </style>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">LOGIN</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Details</a></li>
      <li><a href="#">Register</a></li>
    </ul>
    <form class="navbar-form navbar-left" action="/action_page.php">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
      </div>
      <button type="submit" class="btn btn-default">Search</button>
    </form>
  </div>
</nav>

    <center>
        <div id="shado" style="text-align: center;height:500px;width:400px;margin: 20px; border: 2px solid black">
           
            <br><br>
            <tags:header heading="Authincation"/>
         <h:form>
              
             <br><br><br>
             
             <h4 style="color: white"> Email   </h4><h:inputText id="email" value="#{infor.email}" /><br><br>
            
           <h4 style="color: white">  Password </h4><h:inputText id="password" value="#{infor.password}" /><br><br>
       
             <h:commandButton styleClass="btn btn-primary btn-md" value="Login" action="#{infor.submit()}" />
             <h:commandButton styleClass="btn btn-success btn-md" value="Back" action="#{infor.back()}" /><br>
             <h:commandLink value="Forget Password" />
         <tags:footer contact="Contact Us: 01686017809" address="Address: Dhaka" />
          
            </h:form>
              </div>
        </center>
    </body>
   
</html>
</f:view>