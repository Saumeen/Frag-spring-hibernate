<%-- 
    Document   : Result2
    Created on : 5 Apr, 2019, 9:32:26 PM
    Author     : sonu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="headerlogout.jsp"/>
        
        <c:forEach var="x" items="${question}">
            
            <div class="container">
           
            ${x.question}
            <hr>
            </div>
        </c:forEach>
            
            </table>
    </body>
</html>
