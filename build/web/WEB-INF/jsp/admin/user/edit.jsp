<%@include file="../header.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>EDIT User</h1>
<form:form modelAttribute="User" action="${SITE_URL}/admin/user/save" method="post" role="form">
    <div class="form-group">
        <label> FirstName</label>
        <form:input path="firstname" placeholder="Enter FirstName" required="required" class="form-control"/>
    </div>
    <div class="form-group">
        <label>LastName</label>
        <form:input path="lastname" placeholder="Enter LastName" required="required" class="form-control"/>
    </div>
    
    <div class="form-group">
        <label>UserName</label>
        <form:input path="username" placeholder="Enter UserName" required="required" class="form-control"/>
    </div>
    
     <div class="form-group">
        <label>Password</label>
        <form:input path="password" type="password"  placeholder="Enter Password" required="required" class="form-control"/>
    </div>
    
    <div class="form-group">
        <label>Email</label>
        <form:input path="email"  placeholder="Enter Email" required="required" class="form-control"/>
    </div>
    
     <div class="form-group">
        <label>Phone</label>
        <form:input path="phone"  placeholder="Enter Phone" required="required" class="form-control"/>
    </div>
    
     <div class="form-group">
        <label>Address</label>
        <form:input path="address" placeholder="Enter Address" required="required" class="form-control"/>
    </div>
    
    <div class="form-group">
        <label>Role_Id</label>
       
        <select name="role_id">    
            <option value="None">---Select---</option>
             <c:forEach items="${role}" var="roles">
                 
                 <option value="${roles.role_id}">${roles.role}</option>
             </c:forEach>
         </select>
    </div>
     
   
    
   <form:hidden path="uid"/>
    <div class="form-group"> 
    <button type="submit" class="btn btn-success" >Save</button>
    </div>
</form:form>
