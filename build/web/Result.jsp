<%-- 
    Document   : result
    Created on : 13 Mar, 2019, 12:19:30 PM
    Author     : sonu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page </title>
    </head>
    <body>
        <header>
        <c:choose>
            <c:when test="${Userid}== null">
                <jsp:include page="Headerlogin.jsp"/>
            </c:when>
            <c:otherwise >
                <jsp:include page="headerlogout.jsp"/>
            </c:otherwise>
        </c:choose>
     
    </header>
        <h1>Result page ${Userid}</h1>
        <div>
        
            
        </div>
        <a href="questionpage">
            Click here to show question
        </a>
        
    </body>
</html>

