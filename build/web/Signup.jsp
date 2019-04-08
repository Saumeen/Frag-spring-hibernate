


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>SignUp Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/stylesignup.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
<!-- //web font -->
</head>
<body>
    <!---header---->
    <header>
        <jsp:include page="Headerlogin.jsp"/>
    </header>
	<!-- main -->
	<div class="main-w3layouts wrapper">
		<h1 class="font">SignUp Form</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form:form  method = "GET" action = "/Frag-spring-hibernate/SignupResult" modelAttirbute="userentry">
					<form:input  type="text" path="Username" placeholder="Username" />
					<form:input  type="email" path="EmailId" placeholder="Email"/>
					<form:input  type="password" path="password" placeholder="Password"/>
				
					<div class="wthree-text">
						<label class="anim">
							<input type="checkbox" class="checkbox" required="">
							<span>I Agree To The Terms & Conditions</span>
						</label>
						<div class="clear"> </div>
					</div>
					<input type="submit" value="SIGNUP">
				</form:form>
				<p>Already Registered? click Here   <a href="login"> Login Now!</a></p>
                                
			</div>
		</div>
	<!-- //main -->
        </div>
</body>
</html>