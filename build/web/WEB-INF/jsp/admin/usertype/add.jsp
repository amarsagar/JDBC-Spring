<%@include file="../header.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>Add UserType</h1>
<form:form modelAttribute="UserType" action="${SITE_URL}/admin/usertype/save" method="post" role="form">
   
    <div class="form-group">
        <label>Role</label>
        <form:input path="role" placeholder="Enter role" required="required" class="form-control"/>
    </div>
   
    
   <form:hidden path="role_id"/>
    <div class="form-group"> 
    <button type="submit" class="btn btn-success" >Save</button>
    </div>
</form:form>
