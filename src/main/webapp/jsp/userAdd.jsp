<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="common/header.jsp" />  


<div class="container">
  <h1 class="display-6">Register User</h1>

		<s:form action="userAdd.action" name="userAdd" id="userAdd">
			<s:textfield  key="user.userName" label="User Name" />
			<s:textfield  key="user.firstName" label="First Name" />
			<s:textfield  key="user.lastName" label="Last Name" />
			<s:textfield  key="user.email" label="Email" />
			<s:password  key="user.password" label="Passowrd" />
			<s:password  key="user.confirmPassword" label="Confirm Passord" />
			<s:textfield  key="user.age" label="Age"/>
			<s:radio      key="user.gender" label="Gender"  list="#{'M':'Male','F':'Female'}" value="'M'" />
			
			<s:textfield key="user.address.address1" label="Address 1"/>
			<s:textfield key="user.address.address2" label="Address 2"/>
			<s:textfield key="user.address.country" label="Country"/>
			<s:textfield key="user.address.state" label="State"/>
			<s:textfield key="user.address.pinCode" label="Pin Code"/>
			
			<s:submit />
		</s:form>
</div>
	
<jsp:include page="common/footer.jsp" />  