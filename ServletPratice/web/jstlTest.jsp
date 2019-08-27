<%-- 
    Document   : jstlTest
    Created on : Jul 13, 2019, 4:49:42 PM
    Author     : Java
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<jsp:useBean id="user" class="com.tawhida.User"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
<!--         <cif test="${true}">
        <h4>True</h4>
         </cif>-->
        
        ${user.setName("Tawhida")}
        <c:out value="${user.getName()}" default="Hello">
            
        </c:out>
        <c:set var="salary" scope="page" value="${2000*2}"/>
            
        
        <c:out value="${salary}" default="2000"/>
            
      
        <c:remove var="salary" scope="session"/>
        <c:out value="${salary}" default="not found"/>
        <c:catch var="excption">
          
            <%
             int x= 5/0;
            %>
        </c:catch>
        <c:out value="${excption.message}"/>
        <c:choose>
            <c:when test="${salary <=0}">
                <h4> Low Salary</h4>
            </c:when>
                <c:when test="${salary >2000}">
                <h4>salary is ${salary}</h4>
            </c:when>
            <c:otherwise>
                No comment .......
            </c:otherwise>
        </c:choose>
            <c:import var="t" url="http://localhost:8080/SimpleJsps/tests.jsp?uName=Tawhida&uEmail=tawhida@gmail.com&uPass=gfhgf&ugender=Female"/>
            ${t}
            <table border="1">
                <%
                int[] ids = {1,2,3,4,5,6,7,8,9,10};
                for(int id: ids){
                    out.write("<tr>");
                    out.write("<td>"+id);
                    
                    out.write("</td>");
                    out.write("</tr>");
                    
                }
                %>
            </table>
            <table border="1">
                <c:forEach var="item" begin="1" end="10">
                    <tr>
                        <td>${item}</td>
                    </tr>
                    
                </c:forEach>
            </table>
    </body>
</html>
