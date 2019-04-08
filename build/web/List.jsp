<%-- 
    Document   : List
    Created on : 13 Mar, 2019, 10:11:38 PM
    Author     : sonu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <c:forEach items="${list}" var="user" >
   <tr>
    <td>${user.uid }</td>
    <td>${user.username }</td>
    
    <td>
   </tr>
  </c:forEach>
    </body>
</html>
