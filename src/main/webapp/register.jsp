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
  <h1 class="display-6">Register User</h1>
	<form class="row g-3" method="POST" action="doRegister.action">
		<div class="col-md-6">
			<label for="userName" class="form-label">User Name</label> 
			<input type="text" name="user.userName" class="form-control" id="userName" placeholder="User Name">
		</div>
		<div class="col-md-6">
			<label for="email" class="form-label">Email</label> 
			<input type="email" class="form-control" id="email">
		</div>
		<div class="col-md-6">
			<label for="firstName" class="form-label">First Name</label> 
			<input type="text" class="form-control" id="firstName" placeholder="First Name">
		</div>
		<div class="col-md-6">
			<label for="lastName" class="form-label">Last Name</label> 
			<input type="text" class="form-control" id="lastName" placeholder="Last Name">
		</div>
		<div class="col-md-6">
			<label for="password" class="form-label">Password</label> 
			<input type="password" class="form-control" id="password">
		</div>
		<div class="col-md-6">
			<label for="confirmPassword" class="form-label">Confirm Password</label> 
			<input type="password" class="form-control" id="confirmPassword">
		</div>
		<div class="col-md-6">
			<label for="age" class="form-label">Age</label> 
			<input type="number" class="form-control" id="age">
		</div>
			<div class="col-md-6">
				    <label for="age" class="form-label">Gender</label> 
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="gender" id="male" value="Male" checked >
						<label class="form-check-label" for="male"> Male </label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="gender" id="female" value="Female">
						<label class="form-check-label" for="female"> Female </label>
					</div>
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