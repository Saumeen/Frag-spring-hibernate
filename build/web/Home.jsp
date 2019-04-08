<%-- 
    Document   : Home
    Created on : 7 Apr, 2019, 8:57:51 AM
    Author     : sonu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="css/homestyle.css">
    
</head>

<body>
    <header>
        <c:choose>
            <c:when test="${Userid==id}">
            <jsp:include page="Headerlogin.jsp"/>
            </c:when>
            <c:otherwise>
                <jsp:include page="headerlogout.jsp"/>
            </c:otherwise>
        </c:choose>
    </header>
   
<div class="top">
    <a class="btn btn-primary" href="askquestion">Ask Question</a>
        <a class="btn btn-primary" href="showallquestion">Show all Question</a>
                <a class="btn btn-primary" href="questionpage">Show My Question</a>

    <hr>
</div>


<div class="container">
     <c:forEach items="${question}" var="q" >
         <div class="container" >
             ${q.question}
             <hr>
         </div>
   </c:forEach>
</div>
 
 <!--<script src="css/bootstrap/js/bootstrap.js"></script> -->
<script src="css/final/jquery-slim.min.js"></script>
<script src="css/final/popper.min.js"></script>
<script src="css/final/bootstrap.min.js"></script>
</body>

</html>
