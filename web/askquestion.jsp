<%-- 
    Document   : askquestion
    Created on : 7 Apr, 2019, 9:46:03 AM
    Author     : sonu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

       


<html>

<head>
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="css/style.css">
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
</head>

<body>
    <header>
        
        <c:choose>
            <c:when test="${Userid eq id}">
                <jsp:forward page="login"/>
            </c:when>
            <c:otherwise>
                <jsp:include page="headerlogout.jsp"/>
            </c:otherwise>
        </c:choose>
        
    </header>
    
    <form:form method="GET" action = "/Frag-spring-hibernate/submitquestion" modelAttirbute="askque" >
    <div class="form-group container">
    <label class="font size bold">Enter Your Question</label>
    <form:input class="form-control" type="text" path="Question" rows="10" />
    <button>Submit </button>
    </div>
</form:form>
 
 <!--<script src="css/bootstrap/js/bootstrap.js"></script> -->
<script src="css/final/jquery-slim.min.js"></script>
<script src="css/final/popper.min.js"></script>
<script src="css/final/bootstrap.min.js"></script>
</body>

</html>