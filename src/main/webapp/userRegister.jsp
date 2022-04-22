<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="${pageContext.request.contextPath}/bootstrap-5.1.3-dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<style>
.container{
 position relative;
 position: absolute;
 top: 50%;
 left: 50%;
 transform: translate(-50%,-50%);
}


</style>
<body>
<div class="container">
  <h1 class="display-6">Register User</h1>

		<s:form action="userRegister.action" name="userRegister" id="userRegister">
			<s:textfield name="userName" label="User Name" />
			<s:textfield name="firstName" label="First Name" />
			<s:textfield name="lastName" label="Last Name" />
			<s:textfield name="email" label="Email" />
			<s:textfield name="password" label="Passowrd" />
			<s:textfield name="confirmPassword" label="Confirm Passord" />
			<s:textfield name="age" label="Age"/>
			<s:radio label="Gender" name="gender" list="#{'M':'Male','F':'Female'}" value="'M'" />
			<s:submit />
		</s:form>


	</div>
	<script
		src="${pageContext.request.contextPath}/bootstrap-5.1.3-dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>