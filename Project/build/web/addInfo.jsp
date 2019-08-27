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
        <body>
            <div style="text-align: center;margin: 50px; border: 2px solid black" class="bg-success">
                <tags:header heading="Information "/>
                
                        <center>
            <table>
                <h:form style="text-align: center;margin: 100px;border: 2px solid black">

                    <tr>
                        <td>Name</td>
                        <td><h:inputText id="firstName" value="#{employee.name}" size="25"/></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><h:inputText id="lastName" value="#{employee.address}" size="25"/></td>
                    </tr>
                    <tr>
                        <td>Mobile No </td>
                        <td><h:inputText id="email" value="#{employee.mobileNo}" size="25"/></td>
                    </tr>
                    <tr>
                        <td>Date of Birth </td>
                        <td><h:inputText id="address" value="#{employee.dateofBirth}"  size="25"/></td>
                    </tr>
                    <tr>
                        <td>Gender</td>
                        <td>
                            <h:selectOneRadio value="#{employee.gender}">
                                <f:selectItem itemLabel="Male" itemValue="Male" />
                                <f:selectItem itemLabel="Female" itemValue="Female" />
                            </h:selectOneRadio>
                        </td>
                    </tr>
                    <tr>
                        <td>Subject</td>
                        <td>
                            <h:selectManyCheckbox value="#{employee.subjt}">
                                <f:selectItem itemLabel="Java" itemValue="Java"/>
                                <f:selectItem itemLabel="PHP" itemValue="PHP"/>
                                <f:selectItem itemLabel="C#" itemValue="C#"/>
                            </h:selectManyCheckbox>
                        </td>
                    </tr>
                    <tr>
                        <td>Schedule</td>
                        <td>
                            <h:selectOneMenu value="#{employee.schedule}">
                                <f:selectItems value="#{times.sch}" />
                            </h:selectOneMenu>
                        </td>
                    </tr>
                    <tr>
                        <td> </td>
                        <td><h:commandButton value="Submit" action="#{employee.submit()}"/> </td>
                    </tr>
                    
                </h:form>
            </table>
        </center>
                
                
                
                
                
                
                
                <tags:footer contact="Contact Us: 01686017809" address=" Address: Dhaka" />
            </div>
        </body>
    </html>
</f:view>