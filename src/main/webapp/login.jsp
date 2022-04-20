<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<form class="row g-3" method="POST" action="doLogin.action">
		<div class="col-md-6">
			<label for="inputEmail4" class="form-label">Email</label> 
			<input type="email" class="form-control" id="inputEmail4">
		</div>
		<div class="col-md-6">
			<label for="inputPassword4" class="form-label">Password</label> 
			<input type="password" class="form-control" id="inputPassword4">
		</div>
		<div class="col-12">
			<button type="submit" class="btn btn-primary">Sign in</button>
		</div>
	</form>
	</div>
	<script
		src="${pageContext.request.contextPath}/bootstrap-5.1.3-dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>