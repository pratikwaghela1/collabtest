<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/bootstrap-5.1.3-dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<div class="container">
    <div class="row">
        <div class="col-md-12 min-vh-100 d-flex flex-column justify-content-center">
            <div class="row">
                <div class="col-lg-6 col-md-8 mx-auto">
						<%-- hasActionErrors() method is defined in ActionSupport --%>
						<s:if test="hasActionErrors()">
							<div class="errorDiv">
								<s:actionerror />
							</div>
						</s:if>
						<div class="card rounded shadow shadow-sm">
                        <div class="card-header">
                            <h3 class="mb-0">Login</h3>
                        </div>
                        <div class="card-body">
                            <s:form class="form" role="form" action="login.action" name="login" id="login">
                                    <s:textfield class="form-control form-control-lg rounded-0" key="login.userName" label="User Name" />
                                    <s:password class="form-control form-control-lg rounded-0" key="login.password" label="Password" />
                                    <s:checkbox  class="custom-control-input" name="login.rememberMe" fieldValue="true" label="Remember me on this computer"/>
                                    <s:submit class="btn btn-success btn-lg float-right" />
                            </s:form>
                        </div>
                        <!--/card-block-->
                    </div>
                    <!-- /form card login -->
                </div>
            </div>
            <!--/row-->
        </div>
        <!--/col-->
    </div>
    <!--/row-->
</div>
<!--/container-->
	<script src="${pageContext.request.contextPath}/bootstrap-5.1.3-dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>