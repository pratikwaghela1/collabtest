
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="common/header.jsp" />  
	<div class="container">
		<h2>Users</h2>
		<div class="table-responsive">
			<table class="table table-striped table-sm">
				<thead>
					<tr>
						<th>ID</th>
						<th>User Name</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Age</th>
						<th>Gender</th>
					</tr>
				</thead>
				<tbody> 
					<s:iterator value="users">
						<tr>
							<td><s:property value="userId" /></td>
							<td><s:property value="userName" /></td>
							<td><s:property value="firstName" /></td>
							<td><s:property value="lastName" /></td>
							<td><s:property value="age" /></td>
							<%--  <td><s:if test="gender=='M'">Male</s:if><s:else>Female</s:else> ---   <s:property value="gender"/></td> --%>
							<td><c:if test="${gender == 'M'}">Male</c:if> <c:if test="${gender == 'F'}">Female</c:if></td>
						</tr>
					</s:iterator>
				</tbody>				
			</table>
		</div>
	</div>
	<!-- CONTAINER CLOSE -->


<jsp:include page="common/footer.jsp" />  