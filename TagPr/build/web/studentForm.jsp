<%-- 
    Document   : StudentForm
    Created on : Aug 1, 2019, 6:31:10 PM
    Author     : A D M I N
--%>
<%@taglib  prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="tags" tagdir="/WEB-INF/tags/"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <tags:student id="111" name="j2ee" />
        <h:form>
            <h:inputText id="name" value="#{student.name}" />
            <h:inputText id="eamil" value="#{student.email}" />
            <h:commandButton value="Submit" action="#{student.submit}"/>
        </h:form>
    </body>
</html>
</f:view>