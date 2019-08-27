<%-- 
    Document   : student
    Created on : Aug 1, 2019, 6:41:23 PM
    Author     : A D M I N
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="name" required="true"%>
<%@attribute name="id" required="true"%>

<%-- any content can be specified here e.g.: --%>
<h2>${name}</h2>
<h2>${id}</h2>