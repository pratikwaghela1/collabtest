<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- Bootstrap core CSS -->
<link href="${pageContext.request.contextPath}/bootstrap-5.1.3-dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" >
</head>
<body>
	<header class="p-3 mb-3 border-bottom">
		<div class="container">
			<div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
				<a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-dark text-decoration-none">
					<svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"> <use xlink:href="#bootstrap" /></svg>
				</a>
                
				<ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
					<c:if test="${session.user == null}">
					   <li><a href="loginForm.action" class="nav-link px-2 link-secondary">Login</a></li>
					</c:if>
					<li><a href="userAddForm.action" class="nav-link px-2 link-dark">Register</a></li>
					<li><a href="userList.action" class="nav-link px-2 link-dark">Users</a></li>
				</ul>


				<a>Welcome <s:property value="#session.user.userName"/></a>	
				<form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3">
					<input type="search" class="form-control" placeholder="Search..." aria-label="Search">
				</form>


				<div class="dropdown text-end">
				   
					<a href="#" class="d-block link-dark text-decoration-none dropdown-toggle" id="dropdownUser1" data-bs-toggle="dropdown" aria-expanded="false">
						<img src="https://github.com/mdo.png" alt="mdo" width="32" height="32" class="rounded-circle">
					</a>
					<ul class="dropdown-menu text-small" aria-labelledby="dropdownUser1">
						<li><a class="dropdown-item" href="#">New project...</a></li>
						<li><a class="dropdown-item" href="#">Settings</a></li>
						<li><a class="dropdown-item" href="#">Profile</a></li>
						<li><hr class="dropdown-divider"></li>
						<c:if test="${session.user != null}">
						<li><a class="dropdown-item" href="logout.action">Sign out</a></li>
						</c:if>
					</ul>
				</div>
			</div>
		</div>
	</header>
