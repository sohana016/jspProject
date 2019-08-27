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
            <style>
                body{
                    background-image: url("resource/pic.png");
                   
                }

            </style>
        </head>
        <body>
            
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">INFORMATION</a>
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
                 <div id ="shado" style="text-align: center;height:500px;width:450px;margin: 20px; border: 2px solid black" >
                      <tags:header heading="Registration_From " />
                     
                
                   
            <table>
               <h:form> 
                    <tr>
                       <td><h4> First Name</h4></td>
                        <td><h:inputText id="firstName" value="#{employee.firstName}" size="25"/></td>
                        </tr>
                        <tr>
                            <td> </td>
                        </tr>
                    <tr>
                        <td><h4>Last Name</h4></td>
                        <td><h:inputText id="lastName" value="#{employee.lastName}" size="25"/></td>
                    </tr>
                    <tr>
                      <td>  <h4>Address</h4></td>
                        <td><h:inputText id="address" value="#{employee.address}" size="25"/></td>
                    </tr>
                    <tr>
                       <td>  <h4>Mobile No </h4></td>
                        <td><h:inputText id="mbileNo" value="#{employee.mobileNo}" size="25"/></td>
                    </tr>
                    <tr>
                        <td><h4>Date of Birth</td> </td>
                        <td><h:inputText id="dateOfBirth" value="#{employee.dateofBirth}"  size="25"/></td>
                    </tr>
                    <tr>
                       <td><h4> Gender</td></td>
                        <td>
                            <h:selectOneRadio value="#{employee.gender}">
                                <f:selectItem itemLabel="Male" itemValue="Male" />
                                <f:selectItem itemLabel="Female" itemValue="Female" />
                            </h:selectOneRadio>
                        </td>
                    </tr>
                   
                    <tr>
                      <h4>  <td>Schedule</td>
                        <td>
                            <h:selectOneMenu value="#{employee.schedule}">
                                <f:selectItems value="#{times.sch}" />
                            </h:selectOneMenu>
                        </td>
                    </tr>
                    <tr>
                        <td><h:commandButton styleClass="btn btn-success btn-md" value="Submit" action="#{employee.submit()}"/>
                            </td>
                        <td>
                        <h:commandButton styleClass="btn btn-primary btn-md" value="Reset" action="#{employee.reset()}"/>
                        </td>
                        </tr>
                    <tr>
                        <td> <h:commandLink value="SignIN" action="#{employee.logt()}"/></td>
                    </tr>
                   
                    
                </h:form>
            </table>

                
               
                <tags:footer contact="Contact Us: 01686017809" address=" Address: Dhaka" />
            </div>
             </center>    
        </body>
    </html>
</f:view>