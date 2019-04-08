<%-- 
    Document   : index
    Created on : 13 Mar, 2019, 11:52:20 AM
    Author     : sonu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<title>Login Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/stylelogin.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
<!-- //web font -->
</head>
<body>
    <header>
      
            <jsp:include page="Headerlogin.jsp"/>
            
    </header>
	<!-- main -->
	<div class="login-page">     
  <div class="form">
    <form:form class="login-form" method = "GET" action = "/Frag-spring-hibernate/LoginSuccess" modelAttirbute="loginentry">
      <form:input type="text" path="Username" placeholder="Username"/>
      <form:input type="password" path="password" placeholder="Password"/>
      <button>Log IN </button>
      <p class="message">Not registered? Click Here <a href="Signup">Sign Up</a></p>
    </form:form>
  </div>
</div>
    <!-- //main -->
</body>
</html>